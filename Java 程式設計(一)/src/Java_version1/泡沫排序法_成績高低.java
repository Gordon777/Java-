package Java_version1;
import java.lang.Math;
public class 泡沫排序法_成績高低 {
	public static void main(String args[]) {
		int a[] = {45, 12, 89, 76, 34, 65, 77, 93};
		int temp;
		
		System.out.printf("陣列內容 : "); //顯⽰原來陣列內容
		for(int j=0; j<a.length; j++)
		System.out.printf("%d ", a[j]);
		System.out.printf("\n");
		
		for (int i=0; i<a.length; i++) {
			for (int j=i+1; j<a.length; j++) {
			if (a[i] < a[j]) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			}
		}
			System.out.printf("第 %d 回合: ", i);
			for(int j=0; j<a.length; j++)
			System.out.printf("%d ", a[j]);
			System.out.printf("\n");
			}
		}
	}
		
	


