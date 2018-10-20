package Java_version1;
import java.lang.Math;

public class 大樂透電腦選號 {
	public static void main(String args[]) {
		int value, flag; // 隨機選取號碼
		int[] num = new int[6]; // 儲存選取號碼
		int i=0;
		while (i < 6) {
		flag=0;
		value = 1 + (int)(Math.random()*46);
		for (int j=0; j<i; j++) { // 檢視已選出的號碼
		if (value == num[j]) { // 是否重複
		flag = 1; // 重複則放棄重來
		break;
			}
		}
		if (flag == 0) {
		num[i] = value; // 沒重複則填入陣列
		i = i+1;
			}
		}
		System.out.printf("幸運號碼是: ");
		for (i=0; i<6; i++)
		System.out.printf("%d ", num[i]);
		System.out.printf("\n");
		}
	}