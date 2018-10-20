package Java_version_2;
import java.util.*;
public class exceotion例外 {
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		double fract; //分數;
		double numer; // 分子
		double demo; // 分母
		int data[] = {1, 2, 3, 4, 5, 6, 7};
		int point;
		try {
			System.out.printf("請輸入除數的分子 =>");
			numer = keyin.nextDouble();
			System.out.printf("請輸入除數的分母 =>");
			demo = keyin.nextDouble();
			fract = numer / demo;
			System.out.printf("\n");
			System.out.printf("%.2f/%.2f = %.2f\n", numer,demo,fract);
			System.out.printf("請輸入幾個陣列元素輸出 =>");
			point = keyin.nextInt();
			for (int i=0; i<point; i++)
				System.out.printf("%d ", data[i]);
				System.out.printf("\n");
				}
				catch(InputMismatchException except1){
				System.out.printf("Catch NumberFormatException\n");
				System.out.printf("%s\n", except1.toString());
				}
				catch(ArrayIndexOutOfBoundsException except2){
				System.out.printf("Catch ArrayIndexOutOfBoundsException\n");
				System.out.printf("%s\n", except2.toString());
				}
				finally {
				System.out.println("Program finally");
				}
				}
				}