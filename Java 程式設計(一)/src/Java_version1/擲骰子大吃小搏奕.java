package Java_version1;
import java.util.*;

public class 擲骰子大吃小搏奕 {
	/* 宣告類別變數 (整體變數)*/
	static String maxName="", minName="";
	static int maxNum=0, minNum=99;
	
	/* main 方法開始 */
	public static void main(String args[]) {
	Scanner keyin = new Scanner(System.in); // 區域物件
	String name; // 區域變數
	int number; // 區域變數
	System.out.printf("=== 歡迎光臨大吃小擲骰子遊戲 ===\n"); 
	System.out.printf("輸入姓名並擲骰子 (Enter 結束) =>"); 
	name = keyin.nextLine();
	while(name.length() !=0) 
	{
		game(name);
		System.out.printf("領先者 %s 先生 %d 點\n", maxName,maxNum);
		System.out.printf("輸入姓名並擲骰子 (Enter 結束) =>");
		name = keyin.nextLine();
	}
	System.out.printf("贏家 %s 先生擲出 %d\n", maxName, maxNum); 
	System.out.printf("輸家 %s 先生擲出 %d\n", minName, minNum);
	}
	/* game 方法開始 */
	static void game(String name) {
	Random random = new Random();// 區域物件
	int ran, sum=0; // 區域變數 
	System.out.printf("\t您擲出 => ");
	for (int k=1; k<=3; k++) {
	ran= 1 + random.nextInt(6);
	System.out.printf("%d ",ran);
	sum = sum + ran;
	}
	System.out.printf("合計 = %d\n", sum); if (sum > maxNum) {
		maxName = name;
		maxNum = sum; 
	}
	if(sum <= minNum) 
	{ 
		minName = name; 
		minNum = sum;
	} 
	}

}
