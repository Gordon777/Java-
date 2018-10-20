package Java_version_2;
import java.util.*;

public class 自行拋出例外 {
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		int k;
		try {
		System.out.printf("請輸入除數的分子 =>");
		k = keyin.nextInt();
		if (k <10 || k>20)
		throw new ArithmeticException();
		int x=20, y=2, m;
		System.out.printf("請輸入 %d/%d =>", x, y);
		m = keyin.nextInt();
		if (m != x/y)
		throw new Exception();
		}
		catch(ArithmeticException except1){
		System.out.printf("Catch NumberFormatException\n");
		System.out.printf("%s\n", except1.toString());
		System.out.printf("輸入並非介於 10 與 20 之間\n");
		}
		catch(Exception except2){
		System.out.printf("Catch Exception\n");
		System.out.printf("%s\n", except2.toString());
		}
		}
		}