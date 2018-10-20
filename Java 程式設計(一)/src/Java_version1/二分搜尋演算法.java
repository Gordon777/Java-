package Java_version1;
import java.util.Scanner;
import java.lang.Math;

public class 二分搜尋演算法 {
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		int a[][], value, flag, low, high, mid;
		a = new int[50][2];
		int number = 411101;
		for(int i=0; i<a.length; i=i+1){
		a[i][0] = number + i;
		a[i][1] = (int)(Math.random()*100);
		}
		/* 列印全班成績 */
		System.out.printf("=== 411101 ~ 411150 成績列印 ===\n");
		for(int i=0; i<a.length; i++) {
		System.out.printf("%4d", a[i][1]);
		if((i+1) % 10 == 0)
		System.out.printf("\n");
		}
		System.out.printf("請輸入欲尋找的學⽣學號 => ");
		value = keyin.nextInt();
		/* ⼆分搜尋法 */
		low = 0; high = 49;mid=0;
		flag=0; // 設定是否找到旗號
		while((low+1) < high) { // 陣列是否搜尋完
		mid = (low + high)/2;
		if (value == a[mid][0]) { // 比對陣列中間元素
		flag = 1; // 找到了, 設定旗號並離開
		break;
		}
		else if (value > a[mid][0]) // 在陣列的後半段
		low = mid;
		else // 在陣列的前半段
		high = mid;
		}
		if (flag == 1)
		System.out.printf("學號 %d 成績是 %d\n", a[mid][0], a[mid][1]);
		else
		System.out.printf("沒有 %d 學號學⽣\n", value);
		}
		}
