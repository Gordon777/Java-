package Java_version1;
import java.util.Scanner;

public class 收銀機計算 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int total=0, item; // 設 total 累積器初值為 0
		System.out.printf("超商收銀機、請注意是否歸零 = %d\n", total);
		System.out.printf("請輸入汽⽔的⾦額 =>");
		item = in.nextInt();
		total = total + item;
		System.out.printf("\t⽬前累進⾦額為 = %d\n", total);
		System.out.print("請輸入餅乾的⾦額 =>");
		item = in.nextInt();
		total = total + item;
		System.out.printf("\t⽬前累進⾦額為 = %d\n", total);
		System.out.print("請輸入御便當的⾦額 =>");
		item = in.nextInt();
		total = total + item;
		System.out.printf("\t總⾦額為 = %d 謝謝光臨 !!!\n", total);
	}

}
