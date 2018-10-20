package Java_version_2;
import java.util.*;

public class 擲出例外 {
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		double a; //分數;
		double b; // 分子
		double c; // 分母
		try {
			System.out.printf("請輸入除數的分子 =>");
			b = keyin.nextDouble();
			System.out.printf("請輸入除數的分母 =>");
			c = keyin.nextDouble();
			if (c == 0)
			throw new ArithmeticException();
			a = b / c;
			System.out.printf("\n");
			System.out.printf("%.2f/%.2f = %.2f\n", b,c,a);
			}
			catch(InputMismatchException except1){
			System.out.printf("Catch NumberFormatException\n");
			System.out.printf("%s\n", except1.toString());
			}
			catch(ArithmeticException except2){
			System.out.printf("Throw out Catch ArithmeticException\n");
			System.out.printf("%s\n", except2.toString());
			}
			}
	}
			