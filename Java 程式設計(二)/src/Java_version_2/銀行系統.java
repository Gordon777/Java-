package Java_version_2;
import java.util.*;
public class 銀行系統 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
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
		System.out.printf("\n列印帳⼾資料\n");
		System.out.printf("帳⼾姓名： %s \n", customer.name);
		int[] ID = customer.getID();
		String ID_S = "";
		for (int i=0; i<13; i++)
		ID_S = ID_S + ID[i];
		System.out.printf("帳⼾號碼(13 碼)： %s", ID_S);
		System.out.printf("\n");
		System.out.printf("餘額= %d\n", customer.checkM());
	}
}