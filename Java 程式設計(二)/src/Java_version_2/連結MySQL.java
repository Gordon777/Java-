package Java_version_2;
import java.sql.*;
public class 連結MySQL {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; // 連結 MySQL 驅動程式
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		ResultSetMetaData rsmeta = null;
		String url = "jdbc:mysql://localhost:3306/bank_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		// 連結主機 localhost:3306 伺服器內 Bank_db 資料庫
		String user = "root"; // 帳⼾ root
		String password = "0000"; // root 密碼
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			// 連結到主機 MySQL 內 Bank_db 資料庫
			System.out.println("成功連結 Bank_db 資料庫");
			st = conn.createStatement(); // 產⽣ SQL 敘述物件
			rs = st.executeQuery("select * from account");// 下達 SQL 命令
			while (rs.next()) { // 擷取下⼀筆紀錄
			System.out.printf("%s\t", rs.getString("ID")); // ID 欄位內容
			System.out.printf("%s\t", rs.getString("name")); // name欄位內容
			System.out.printf("%s\t", rs.getInt("balance"));// balance 內容
			System.out.printf("\n");
			}
			conn.close(); // 關閉資料庫連線
			}
			catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
			catch (SQLException e) {
			e.printStackTrace();
			}
		}
	}