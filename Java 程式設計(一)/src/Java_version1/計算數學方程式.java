package Java_version1;
import java.util.*;

public class 計算數學方程式 {
	public static void main(String[] args) {
    Scanner keyin = new Scanner(System.in);
	double x,y1,y2;
    System.out.printf("請輸入變數 x 的數值 =>");
    x = keyin.nextDouble();
    y1 = 4*x*x + 3*x + 2;
    y2 = x*x + 1;
    System.out.printf(" %.2f\n3",y1);
    System.out.printf(" %.2f",y2);

    }

}
