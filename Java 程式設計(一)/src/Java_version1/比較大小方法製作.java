package Java_version1;
import java.util.*;

public class 比較大小方法製作 {
	public static void main(String args[]) { 
		Scanner keyin = new Scanner(System.in); 
		int max=0, min=999;
	int value;
	for(int i=0; i<5; i++){
	System.out.printf("請輸入第 %d 整數 =>", i+1); 
	value = keyin.nextInt();
	max = Max(max, value);
	min = Min(min, value);
	}
	System.out.printf("最大數值是 %d\n", max); 
	System.out.printf("最小數值是 %d\n", min);
	} /* main 方法結束 */
	static int Max(int a, int b) { //Max 方法開始
	if (a > b)
	return a; 
	else
	return b;
	} //Max 方法結束
	static int Min(int a, int b){ //Min方法開始 
	if(a <b)
	return a; 
	else
	return b; }//Min方法結束
	} /* Ex6_2 類別結束 */
	
