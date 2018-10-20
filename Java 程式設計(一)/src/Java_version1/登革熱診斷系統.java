package Java_version1;
import java.util.*; 

public class 登革熱診斷系統 {
public static void main(String args[]){
	Scanner keyin = new Scanner(System.in);
	final int a=8, b=6, c=4, d=3;
	int weights = a+b+c+d;
	int x, y, z, k;
	float value;
	System.out.printf("*** 登⾰熱⾃我診斷系統  ***\n");
	System.out.printf("請輸入各種症狀明顯度如何 (0 ~ 10)\n");
	System.out.printf("\t如: 不明顯(0),稍明顯 (4) 明顯(6),很明顯(10)\n");
	
	System.out.printf("請輸入發燒症狀明顯否(0~10) =>");
	x = keyin.nextInt();
	System.out.print("請輸入筋骨酸痛症狀明顯否(0~10) =>");
	y = keyin.nextInt();
	System.out.print("請輸入感冒症狀明顯否(0~10) =>");
	z = keyin.nextInt();
	System.out.print("請輸入嗜睡症狀明顯否(0~10) =>");
	k = keyin.nextInt();
	
	value = (float)(x*a + y*b +z*c + k*d)/weights;
	System.out.printf("\n您感染登⾰熱指數為(0 ~ 10)= %.2f\n", value);		
}
}
