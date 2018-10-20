package Java_version1;
import java.util.Scanner;

public class 掃描輸入套件 {
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		System.out.printf("請輸入客戶資料 =>"); 
		String name = keyin.next();
		int age = keyin.nextInt();
		float cost = keyin.nextFloat();
		System.out.printf("姓名: "+name+"年齡: "+age+"花費: "+cost);

		}

}
