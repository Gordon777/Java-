package Java_version1;
import java.util.*;

public class 加法器函數製作 {
	/* main 方法開始 */
	public static void main(String args[]) {
	Scanner keyin = new Scanner(System.in); int sum; // 區域變數
	int value1, value2; 
	System.out.printf("請輸入第一個整數 =>"); 
	value1 = keyin.nextInt(); 
	System.out.printf("請輸入第二個整數 =>"); 
	value2 = keyin.nextInt();
	/* 呼叫 Add() 函數 */
	sum = Add(value1, value2);
	System.out.printf("%d+%d = %d\n", value1, value2, sum);
	} /* main 方法結束 */
	/* Add 方法開始 */
	static int Add(int a, int b) {
	int sum; 
	sum = a + b; 
	return sum;
	} /*Add方法結束*/ 
	} 
	// 區域變數

