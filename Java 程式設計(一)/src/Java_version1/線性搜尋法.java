package Java_version1;
import java.util.Scanner;

public class 線性搜尋法 {
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		int value, flag=0, i;
		int[] num = {20, 13, 45, 24, 42, 34, 22, 89, 19, 70};
		System.out.printf("num[] = ");
		for (int k=0; k<10; k++)
			System.out.printf("%d ", num[k]);
			System.out.printf("\n");
			System.out.printf("請輸入⼀個數值 =>");
			value = keyin.nextInt();
			i=0;
			while (i < 10) {
			if (value == num[i]){
			flag = 1;
			break;
			}
			i++;
			}
			if(flag == 1)
			System.out.printf("num[%d] = %d 找到了\n", i, value);
			else
			System.out.printf("%d 不在 num 陣列內", value);
		}
	}