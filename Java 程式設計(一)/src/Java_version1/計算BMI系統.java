package Java_version1;
import java.util.*;

public class 計算BMI系統 {
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		final double base=18.0, height=24.0;
		double toll, weight, bmi;
		
		System.out.printf("== 歡迎使用 BMI 評估系統(18 ~ 24) ==\n");
		System.out.printf("請輸入客戶身高(公分) =>");
		toll = keyin.nextDouble() / 100;
		System.out.printf("請輸入客戶體重(公斤) =>");
		weight = keyin.nextDouble();
		bmi = weight / (toll * toll);
		
		System.out.printf("\n客戶 BMI 值 = %.4f\n", bmi);
		if (bmi <= base)
			System.out.printf("您身材太瘦了, 需要增胖\n");
		else if (bmi >= height)
			System.out.printf("您身材太胖了, 需要減重\n");
		else
			System.out.printf("恭喜您有一個健美體材\n");
		System.out.printf("== 系統結束, 歡迎再次光臨 ==\n");
		
	}

}
