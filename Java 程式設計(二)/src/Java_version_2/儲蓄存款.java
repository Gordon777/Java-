package Java_version_2;
import java.io.*;
import java.util.*;

public class 儲蓄存款 {
	static Account[] customer; // 客⼾資料的物件陣列
	static int k=0; // 紀錄儲存筆數
	static Scanner keyin; // 鍵盤輸入物件
	static String file_R = "deposit.data";
	public static void main(String args[]) throws IOException {
	keyin = new Scanner(System.in);
	customer = new Account[50];
	mainMenu();
	int select = keyin.nextInt();
	keyin.nextLine();
	while (select !=8) {
	switch (select) {
	case 1: /* 讀入帳⼾資料 */
	readData();
	break;
	case 2: /* 新建立帳⼾ */
	addAcc();
	break;
	case 3: /* 顯⽰所有帳⼾ */
	dispData();
	break;
	case 4: /* 提款作業 */
	recMoney();
	break;
	case 5: /* 存款作業 */
	saveMoney();
	break;
	case 6: /* 查詢餘額 */
	checkMoney();
	break;
	case 7: /* 儲存帳⼾資料 */
	saveData();
	break;
	default:
	System.out.printf("錯誤輸入, 請重新選擇 !!\n");
	}
	mainMenu();
	select = keyin.nextInt();
	keyin.nextLine();
	}
	}
	/* 顯⽰主選單 */
	public static void mainMenu() {
	System.out.printf("\n== 藝術銀⾏ 活期儲蓄系統 ==\n");
	System.out.printf("(1) 讀入所有帳⼾\t");
	System.out.printf("(2) 建 立 新帳⼾\t");
	System.out.printf("(3) 顯⽰所有帳⼾\n");
	System.out.printf("(4) 帳⼾提款作業\t");
	System.out.printf("(5) 帳⼾存款作業\t");
	System.out.printf("(6) 帳⼾查詢餘額\n");
	System.out.printf("(7) 儲 存 資 料\t");
	System.out.printf("(8) 離 開 系 統\n");
	System.out.printf("請選擇⼯作項⽬ => ");
	}
	/* 讀取 deposit.data 檔案資料, 再存入 customer 物件陣列中 */
	public static void readData() throws IOException {
	String inData;
	String ID_STR1;
	int money;
	File fileID = new File(file_R); // 產⽣輸入檔案物件
	if (fileID.exists()) {
	BufferedReader data = new BufferedReader(new
	FileReader(fileID));
	while ((inData=data.readLine()) != null) {
	Scanner s = new Scanner(inData).useDelimiter("\t");
	customer[k] = new Account();
	ID_STR1 = s.next();
	if (customer[k].writeID(ID_STR1) == 0) {
	System.out.printf("%s 帳⼾不對\n", ID_STR1);
	continue;
	}
	customer[k].name = s.next();
	money = s.nextInt();
	customer[k].saveM(money);
	k = k +1;
	}
	data.close();
	}
	else {
	System.out.printf("%s 檔案不存在, 請先建立它\n", file_R);
	System.out.printf("按任何鍵離開 =>");
	keyin.nextLine();
	System.exit(1);
	}
	}
	public static void addAcc() {
	String ID_Str;
	customer[k] = new Account();
	System.out.printf("***建立新帳⼾***\n請輸入姓名=>");
	customer[k].name = keyin.nextLine();
	System.out.printf("請輸入帳號(12 位數字) =>");
	ID_Str = keyin.nextLine();
	int flag = customer[k].setID(ID_Str);
	if (flag == 0)
	return;
	System.out.printf("請輸入存款⾦額 =>");
	int money = keyin.nextInt();
	int balance = customer[k].saveM(money);
	System.out.printf("餘額 = %d\n", balance);
	k = k + 1;
	}
	/* 顯⽰所有帳⼾ */
	public static void dispData() {
	System.out.printf("== 列印所有帳⼾資料 ==\n");
	System.out.printf("帳號\t\t姓名\t餘額\n");
	for (int i=0; i<k; i++) {
	int[] ID = customer[i].getID();
	for (int j=0; j<13; j++)
		System.out.printf("%d", ID[j]);
		System.out.printf("\t");
		System.out.printf("%s\t", customer[i].name);
		System.out.printf("%d\n", customer[i].checkM());
		}
		}
		/* 檢查帳號 */
		public static int checkAcc(String ID_Str) {
		int[] ID = new int[13];
		int[] ID_R = new int[13];
		int acc, flag=0;
		Scanner s = new Scanner(ID_Str).useDelimiter("");
		for (int i=0; i<13; i++)
		ID[i] = s.nextInt();
		for (acc=0; acc<k; acc++) {
		ID_R = customer[acc].getID();
		if (Arrays.equals(ID, ID_R)) {
		flag =1;
		break;
		}
		}
		if (flag == 0) {
			System.out.printf("無此帳號，請離開 !!\n");
			return -1;
			}else {
			return acc;
			}
			}
			/* 存款作業 */
			public static void saveMoney() {
			int[] ID = new int[13];
			int flag;
			System.out.printf("請輸入提款帳號 =>");
			String ID_Str = keyin.nextLine();
			int acc = checkAcc(ID_Str);
			if (acc < 0) {
			System.out.printf("無此帳號，請離開 !!\n");
			return;
			}
			System.out.printf("請輸入存款⾦額 =>");
			int money = keyin.nextInt();
			int m = customer[acc].saveM(money);
			String name = customer[acc].name;
			System.out.printf("帳⼾：%s⽬前餘額為：%d\n", name, m);
			}
			/* 提款作業 */
			public static void recMoney(){
			System.out.printf("請輸入存款帳號 =>");
			String ID_Str = keyin.nextLine();
			int acc = checkAcc(ID_Str);
			if (acc < 0) {
			System.out.printf("無此帳號，請離開 !!\n");
			return;
			}
			System.out.printf("請輸入提款⾦額 =>");
			int money = keyin.nextInt();
			int m = customer[acc].recM(money);
			if(m <0){
			System.out.printf("存款不⾜、請離開 !!\n");
			return;
			}
			String name = customer[acc].name;
			System.out.printf("帳⼾：%s⽬前餘額為：%d\n", name, m);
			}
			/* 查詢餘額 */
			public static void checkMoney(){
			System.out.printf("請輸入存款帳號 =>");
			String ID_Str = keyin.nextLine();
			int acc = checkAcc(ID_Str);
			if (acc < 0) {
			System.out.printf("無此帳號，請離開 !!\n");
			return;
			}
			int m = customer[acc].checkM();
			String name = customer[acc].name;
			System.out.printf("帳⼾：%s⽬前餘額為：%d\n", name, m);
			}
			/* 儲存資料 */
			public static void saveData() throws IOException {
			BufferedWriter outData = new BufferedWriter(new
			FileWriter(file_R));
			int[] ID_R = new int[13];
			System.out.printf("** 將儲存檔案 (depoist.dada) **\n");
			for (int i=0; i<k; i++) {long temp=0;
			ID_R = customer[i].getID();
			for(int j=0; j<13; j++) {
			temp = temp + ID_R[j];
			temp = temp * 10;
			}
			temp = temp /10;
			outData.write(temp + "\t");
			outData.write(customer[i].name + "\t");
			outData.write(customer[i].checkM() + "\t");
			outData.newLine();
			}
			outData.close();
			System.out.printf("***** 儲存完畢 ****\n");
			}
			}