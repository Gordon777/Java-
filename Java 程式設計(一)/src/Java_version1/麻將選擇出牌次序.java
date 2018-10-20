package Java_version1;
import java.util.*;

public class 麻將選擇出牌次序 {
	public static void main(String args[]) {
		int maxNum, num1, num2, num3, num4;
		Scanner keyin = new Scanner(System.in); System.out.printf("請 東方 擲骰子 (按 Enter 鍵) =>"); keyin.nextLine(); //暫停的功能
		num1 = game();
		System.out.printf("東方擲的是: %d\n", num1);
		
		System.out.printf("請 南方 擲骰子 (按 Enter 鍵) =>"); 
		keyin.nextLine(); //暫停的功能
		num2 = game();
		System.out.printf("南方擲的是: %d\n", num2);
		
		System.out.printf("請 西方 擲骰子 (按 Enter 鍵) =>"); 
		keyin.nextLine(); //暫停的功能
		num3 = game();
		System.out.printf("西方擲的是: %d\n", num3);
		
		System.out.printf("請 北方 擲骰子 (按 Enter 鍵) =>"); 
		keyin.nextLine(); //暫停的功能
		num4 = game();
		System.out.printf("北方擲的是: %d\n", num4);
		
		maxNum = max(num1, max(num2, max(num3, num4)));
		System.out.printf("擲出最大的是 = %d\n", maxNum);

	}
	static int game() 
	{
		Random random = new Random(); 
		int k,sum=0,ran;
		System.out.printf("\t擲出 => "); 
		for (k=1; k<=3; k++) {
		ran= 1 + random.nextInt(6);
		System.out.printf("%d ",ran);
		sum = sum + ran; 
		}
		System.out.printf("\n");
		return sum;
	}
	static int max(int a, int b) { if(a>b)
		return a; else
		return b; }
		}
