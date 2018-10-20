package Java_version_2;
/* 製作⼀個空間為 50 的無序陣列，並具有插入元素與
* 列印陣列內容的功能 */
import java.util.*;
public class 建立無序陣列 {
	static int num[] = new int[50]; // 宣告無序陣列空間
	static int point; // 宣告游標變數
	
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		Random random = new Random();
		int value; // 輸入元素
		int select; // 功能選擇
		point = -1; // 游標初值
		for(int i=0; i<30; i++){ //給予陣列初值
		value = random.nextInt(100);
		point = point +1;
		num[point] = value;
		}
		disp_menu();
		select = keyin.nextInt();
		while(select != 3) {
		switch(select) {
		case 1:
		disp_array();
		break;
		case 2:
		if (point >=50) {
		System.out.printf("陣列已滿無法插入!!\n");
		}else {
		System.out.printf("請輸入欲插入元素 =>");
		value = keyin.nextInt();
		point = point +1;
		num[point] = value;
		}
		break;
		default:
		System.out.printf("輸入錯誤 !! 請重新輸入\n");
		}
		disp_menu();
		select = keyin.nextInt();
		}
		}
		static void disp_menu() {
		System.out.printf("== 歡迎光臨 無序陣列管理系統 ==\n");
		System.out.printf("(1) 列印無序陣列內容\n");
		System.out.printf("(2) 插入陣列元素\n");
		System.out.printf("(3) 離開系統\n");
		System.out.printf("\t 請輸入⼯作選項 =>");
		}
		static void disp_array() { /* 列印內容陣列 */
		System.out.printf("\n== 列印無序陣列內容\n");
		for(int i=0; i<=point; i++) {
		System.out.printf("%2d ", num[i]);
		if((i+1) % 5 == 0)
		System.out.printf("\n"); //列印五筆, 換⾏
		}
		System.out.printf("\n"); // 列印完畢, 換⾏
		}
		

}
