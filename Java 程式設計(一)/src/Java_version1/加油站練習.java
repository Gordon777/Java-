package Java_version1;
import java.io.*;

public class 加油站練習 {
	public static void main(String args[]) throws IOException {
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		final double price=28.5;       // 變數內容不可更改
        double number, total;
        System.out.printf("目前 95 無鉛汽油每公升 %.2f 元\n", price);
        System.out.printf("請輸入加油數量 =>");
        number = Double.parseDouble(keyin.readLine());
        total = number * price;
        System.out.printf("應收金額 = %.0f 元\n", total);   // 捨棄小數點
		          }
}
