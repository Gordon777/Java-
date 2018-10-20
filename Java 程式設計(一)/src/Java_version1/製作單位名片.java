package Java_version1;
import java.util.Scanner;

public class 製作單位名片 {
	
public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("請輸入客戶資料(姓名 年齡 消費金額) =>");
		String name = keyin.next();
		String position= keyin.next();
		int tel = keyin.nextInt();
	       System.out.printf("名片列印如下：\n");
	       System.out.printf("------------------------------------\n");
	       System.out.printf("台灣遊戲軟體發展協會          \n");
	       System.out.printf("%s\n\n", position);
	       System.out.printf("\t%s\n\n", name);
	       System.out.printf("電話: %s\n", tel);
	       System.out.printf("地址: 高雄縣鳥松鄉澄清路 840 號\n");
	       System.out.printf("-------------------------------------\n");
	}	
}
