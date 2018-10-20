package Java_version_2;
import java.util.*;
import java.sql.*;
import java.text.*;
public class 銀行交易系統 {
	static String driver = "com.mysql.cj.jdbc.Driver";
	static Connection conn = null;
	static Statement st = null;
	static ResultSet rs = null;
	static ResultSetMetaData rsmeta = null;
	static String url = "jdbc:mysql://localhost:3306/bank_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static String user = "root";
	static String password = "0000";
	
	public static void main(String[] args) throws SQLException {
		Scanner keyin = new Scanner(System.in);
		
		/* 建立新帳⼾ */
		String ID_Str;
		Account customer = new Account();
		System.out.printf("***建立新帳⼾***\n請輸入姓名=>");
		customer.name = keyin.nextLine();
		System.out.printf("請輸入帳號(12 位數字) =>");
		ID_Str = keyin.nextLine();
		int flag = customer.setID(ID_Str);
		if (flag == 0)
		return;
		System.out.printf("請輸入存款⾦額 =>");
		int money = keyin.nextInt();
		int balance = customer.saveM(money);
		System.out.printf("餘額 = %d\n", balance);
		
		/* 列印帳⼾清單 */
		String name = customer.name; // 新增帳⼾名稱
		balance = customer.checkM(); // 新增帳⼾餘額
		int[] ID = customer.getID();
		String ID_S = "";
		for (int i=0; i<13; i++)
		ID_S = ID_S + ID[i]; // 新增帳⼾號碼
		System.out.printf("\n列印帳⼾資料\n");
		System.out.printf("帳⼾姓名： %s \n", name);
		System.out.printf("帳⼾號碼(13 碼)：%s\n", ID_S);
		System.out.printf("餘額= %d\n", balance);
		
		/* 連結 bank_db 資料庫 */
		try {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("成功連結 Bank_db 資料庫");
		st = conn.createStatement();
		String SQL;
		
		/* 將帳⼾寫入 account 資料表 */
		SQL = String.format("INSERT INTO account VALUES('%s', '%s', '%d')",
		ID_S, name, balance);
		if (st.executeUpdate(SQL) == 1)
			System.out.println("帳⼾ account 新增正常");
		
		/* 由異動訊息寫入 transaction 資料表*/
		Transaction trans = new Transaction();
		java.util.Date now = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		trans.trans_date = sdf.format(now);
		trans.trans_type = 1;
		trans.trade = balance;
		trans.ID = ID_S;
		SQL = String.format("INSERT INTO transaction(ID, trans_type, trade, trans_date)" +
		"VALUES('%s', '%d', '%d','%s')", trans.ID, trans.trans_type, trans.trade, trans.trans_date);
		if (st.executeUpdate(SQL) == 1)
		System.out.println("交易檔 transaction 新增正常");
		
		/* 由 account 讀出新增帳⼾的資料 */
		SQL = String.format("Select * From account where ID = %s", ID_S);
		rs = st.executeQuery(SQL);
		System.out.printf("\n顯⽰新增帳⼾ account 資料：\n");
		while (rs.next()) {
		System.out.printf("%s\t", rs.getString("ID"));
		System.out.printf("%s\t", rs.getString("name"));
		System.out.printf("%s\t", rs.getInt("balance"));
		System.out.printf("\n");
		}
		/* 由 transaction 讀出新增交易資料 */
		SQL = String.format("Select * From transaction where ID = %s", ID_S);
		rs = st.executeQuery(SQL);
		System.out.printf("\n顯⽰新增交易 transaction 資料：\n");
		while (rs.next()) {
		System.out.printf("交易編碼: %d\n", rs.getInt("trans_no"));
		System.out.printf("帳⼾編碼: %s\n", rs.getString("ID"));
		System.out.printf("交易種類： ");
		if (rs.getInt("trans_type") == 1)
		System.out.printf("存款 \n");
		else
		System.out.printf("提款 \n");
		System.out.printf("交易⾦額： %d\n", rs.getInt("trade"));
		System.out.printf("交易⽇期：%s\n", rs.getString("trans_date"));
		}
		conn.close();
		}
		catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
		catch (SQLException e) {
		e.printStackTrace();
		}
		}
		}