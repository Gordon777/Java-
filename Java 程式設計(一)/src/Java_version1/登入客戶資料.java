package Java_version1;
import java.util.Scanner;

public class 登入客戶資料 {    
public static void main(String args[]) {
	Scanner keyin = new Scanner(System.in);
	System.out.print("請輸入客戶資料(姓名 年齡 消費金額) =>");
	String name = keyin.next();
	int age = keyin.nextInt();
	float costs = keyin.nextFloat();         
	System.out.printf("客戶資料如下: \n\n");
	System.out.printf("客戶姓名: %s\n", name);
	System.out.printf("客戶年齡: %d\n", age);
	System.out.printf("消費金額: %.2f\n", costs);
	     }
	}


