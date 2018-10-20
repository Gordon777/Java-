package Java_version1;
import java.util.Scanner; 

public class 超商找錢工具 {
	public static void main(String args[]){
	Scanner keyin = new Scanner(System.in);
	int total, recept, value, value1, handre, fifty, ten, five, one;
	
	 System.out.printf("**** 超商找錢⼯具 ****\n");
	 System.out.print("請輸入消費的⾦額 =>");
	 total = keyin.nextInt();
	 System.out.printf("請輸入繳納⾦額（⼤於消費額 %d） =>", total);
	 recept = keyin.nextInt();
	 
	 value = recept - total;
	 value1 = value;
	 handre = value / 100;
	 value = value - handre * 100;
	 
	 fifty = value / 50;
	 value = value - fifty * 50;
	 
	 ten = value / 10;
	 value = value - ten * 10;
	 
	 five = value / 5;
	 value = value - five * 5;
	 
	 one = value;
	 System.out.printf("應找⾦額 = %d 各種零錢數量如下:\n", value1);
	 System.out.printf("\t 100 元零錢 = %d 張 \n", handre);
	 System.out.printf("\t 50 元硬幣 = %d 個 \n", fifty);
	 System.out.printf("\t 10 元硬幣 = %d 個 \n", ten);
	 System.out.printf("\t  5 元硬幣 = %d 個 \n", five);
	 System.out.printf("\t  1 元硬幣 = %d 個 \n", one);
	 
}
}
