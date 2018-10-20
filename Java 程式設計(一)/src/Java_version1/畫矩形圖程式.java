package Java_version1;
import java.util.*;

public class 畫矩形圖程式 {
	public static void main(String args[]) {
	/* 宣告相關物件與變數 */
	Scanner keyin = new Scanner(System.in);
	int height;
	int wide;
	// 矩形的高度 // 矩形的寬度
	/* 要求輸入矩形高與寬 */ 
	System.out.printf("請輸入矩形高度 =>");
	height = keyin.nextInt(); 
	System.out.printf("請輸入矩形寬度 =>"); 
	wide = keyin.nextInt();
	/* 繪製矩形圖形 */
	for(int i=1; i<=height; i++) {
	System.out.printf(" "); for(int j=1; j<=wide; j++) {
	System.out.printf("*"); 
	}
	System.out.printf("\n"); 
	}
	}
	}
	


