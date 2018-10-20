package Java_version1;
import java.util.Scanner;

public class 兩數相除結果 {
public static void main(String args[]) {
	 Scanner keyin = new Scanner(System.in); 
	 int div1, value1, value2;
	 float div;
	 System.out.printf("請輸入兩個整數(value1 value2) =>");
	 value1 = keyin.nextInt();
	 value2 = keyin.nextInt();
	// 整數相除得到整數, 存入浮點數變數
	 div = value1 /value2;
	 System.out.printf("未轉換 => %d/%d = %f\n", value1, value2, div);
	// ⼀個整數轉換成浮點數, 再除以另⼀個整數, 結果存入浮點數變數
	 div = (float)value1 /value2;
	 System.out.printf("已轉換 => (float)%d/%d = %f\n", value1, value2, div);
	 // 強迫轉換另⼀個整數變數
	 div = value1 /(float)value2;
	 System.out.printf("已轉換 => %d/(float)%d = %f\n", value1, value2, div);
}}
