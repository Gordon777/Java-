package Java_version1;
import java.util.*;

public class 不同格式資料輸出 {
	public static void main (String[] args) {
	Scanner keyin = new Scanner(System.in);
	int value;
	System.out.printf("請輸入一個整數 =>");
	value = keyin.nextInt();
	System.out.printf("\t 10 進位表示 = %d\n", value); System.out.printf("\t 16 進位表示 = %x\n", value); System.out.printf("\t 8 進位表示 = %o\n", value); System.out.printf("\t 浮點數表示 = %.2f\n", (float)value);
	}
}
