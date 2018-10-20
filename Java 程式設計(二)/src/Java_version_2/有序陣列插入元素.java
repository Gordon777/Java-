package Java_version_2;
/* 有序陣列的插入元素 */

import java.util.*;
public class 有序陣列插入元素 {
	static int num[] = new int[50]; // 宣告陣列空間
	static int point; // 宣告游標變數
	
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		point = -1; // 游標初值
		int select, k, item;
		for (int i=0; i< 30; i++){ //給予陣列初值
		num[i] = (i+1) *2; //存入有序資料
		point = point + 1; //游標指⽰⽬前位置
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
		item = keyin.nextInt();
		point = point +1;
		k = point;
		while (true) {
		if(num[k-1] > item) {num[k] = num[k-1];
		k = k - 1;
		}
		else {
		break;
		}
		num[k] = item;
		}
		}
		break;
		default:
		System.out.printf("輸入錯誤 !! 請重新輸入\n");
		}
		disp_menu();
		select = keyin.nextInt();
		}
		}
		// 列印功能表
		static void disp_menu() {
		System.out.printf("== 歡迎光臨 有序陣列管理系統 ==\n");
		System.out.printf("(1) 列印有序陣列內容\n");
		System.out.printf("(2) 插入陣列元素\n");
		System.out.printf("(3) 離開系統\n");
		System.out.printf("\t 請輸入⼯作選項 =>");
		}
		// 列印陣列內容
		static void disp_array() {
		System.out.printf("\n== ⽬前序陣列有 %d 筆資料 ==\n", point+1);
		for(int i=0; i<=point; i++) {
		System.out.printf("%2d ", num[i]);
		if((i+1) % 10 == 0)
		System.out.printf("\n"); //列印五筆, 換⾏
		}
		System.out.printf("\n"); // 列印完畢, 換⾏
		}
		}
