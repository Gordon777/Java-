package Java_version1;
import java.util.*;
public class 乘法練習系統 {
	public static void main(String args[]) 
	{ 
		Scanner keyin = new Scanner(System.in); 
		Random random = new Random();
		int ran1 = 1 + random.nextInt(9);	
		int ran2 = 1 + random.nextInt(9);
		int value1 = ran1 * ran2;
		
		System.out.printf("請輸入 %d * %d =", ran1, ran2); 
		int value2 = keyin.nextInt();
		
		if (value1 == value2) 
		{ 
			System.out.printf("答對了 您好棒 !!");
		} 
		else 
		{
			System.out.printf("答錯了 正確答案是 %d 多加油哦 !!\n", value1); 
		}
	}

}
