package Java_version1;

public class 尋找質數程式 {
	public static void main(String args[]) {
		final int limit = 100; // 設定尋找最高數值
		int prime; // 質數旗號
		int i=1;
		int count=0;
		System.out.printf("列印出 1~100 間的質數如下:\n"); while (i <= limit) {
			prime = 1;
			int j = 2;
			while (j <=i-1) {
			if ((i%j) == 0) { prime = 0; break;
			}
			j++; }
			if (prime == 1){ System.out.printf("%d ", i); count = count + 1;
			if (count%10 == 0)
			System.out.printf("\n"); }
			i++;
		}
	}

}
