package Java_version1;
import java.util.Scanner; 

public class 計算股票平均價格 {
	public static void main(String args[]) { 
		Scanner keyin = new Scanner(System.in);
		float ave, sum=0, cost;
		int number=0;
		System.out.printf("*** 計算股票平均價系統 ***\n");
		System.out.printf("請輸入第⼀個交易⽇股價 =>"); 
		cost = keyin.nextFloat();
		sum = sum + cost;
		number++;
		ave = sum / number;
		System.out.printf("(⽬前平均價 = %.2f)請輸入第⼆個交易⽇股價 =>", ave);
		cost = keyin.nextFloat();
		sum = sum + cost;
		number++;
		ave = sum / number;
		System.out.printf("(⽬前平均價 = %.2f)請輸入第三個交易⽇股價 =>", ave);
		cost = keyin.nextFloat();
		sum = sum + cost;
		number++;
		ave = sum / number;
		System.out.printf("(⽬前平均價 = %.2f)請輸入第四個交易⽇股價 =>", ave);
		cost = keyin.nextFloat();
		sum = sum + cost;
		number++;
		ave = sum / number;
		System.out.printf("(⽬前平均價 = %.2f)請輸入第五個交易⽇股價 =>", ave); 
		cost = keyin.nextFloat();
		sum = sum + cost;
		number++;
		ave = sum / number;
		System.out.printf("五⽇平均價 = %.2f\n", ave);
	}
	
	

}
