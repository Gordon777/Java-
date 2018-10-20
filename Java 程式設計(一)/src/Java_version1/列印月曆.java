package Java_version1;
import java.util.Scanner;

public class 列印月曆 {
	public static void main(String args[]) { 
		Scanner keyin = new Scanner(System.in);
	int first, number, now=0, day; 
	System.out.printf("請輸入該月 1 日星期幾( 1 ~ 7)=>"); 
	first = keyin.nextInt(); 
	System.out.printf("請輸入該月的天數(28~31)=>");
	number = keyin.nextInt(); 
	System.out.printf("\tMon\tTue\tWed\tTue\tFri\tSat\tSan\n"); 
	for (int i=1; i< first; i++){
	System.out.printf("\t"); now = now + 1;
	}
	day=1; while(day<=number){
		System.out.printf("\t%d", day); now = now + 1;
		if (now%7 == 0){
		System.out.printf("\n"); 
		now = 0;
		}
		day = day + 1;
	}
	while(now < 7)
	{ System.out.printf("\t"); 
	now = now + 1;
	}
}
}
