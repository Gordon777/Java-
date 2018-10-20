package Java_version1;
import java.util.*; 
public class 製作電子算盤 {
	 public static void main(String args[]) {
		 Scanner keyin = new Scanner(System.in); 
		 int total=0, cost;
		 System.out.printf("歡迎光臨 == 春嬌柑仔店 ==\n\n"); 
	     System.out.printf("已購買 %d 請輸入產品價格 (0 結束) =>", total); 
	     cost = keyin.nextInt();
	     cost = keyin.nextInt();
	     while (cost > 0) { 
	     total = total + cost;
	     System.out.printf("已購買 %d 請輸入產品價格 (0 結束) =>", total);
	     cost = keyin.nextInt();
	     
		 }
	 System.out.printf("⼈客您總共買 %d 元 謝謝!! 愛過來ㄜ\n", total); 
	 }
}
