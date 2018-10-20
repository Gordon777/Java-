package Java_version_2;
import java.util.*;

public class 建立有序陣列 {
	static int num[] = new int[50]; // 宣告陣列空間
	static int point; // 宣告游標變數
	
public static void main(String args[]) {
		point = -1; // 游標初值
		for (int i=0; i< 40; i++){ //給予陣列初值
		num[i] = (i+1) *2; //存入有序資料
		point = point + 1; //游標指⽰⽬前位置
		}
		// 列印陣列內容
		System.out.printf("\n== ⽬前序陣列有 %d 筆資料 ==\n", point+1);
		for(int i=0; i<=point; i++) {
		System.out.printf("%2d ", num[i]);
		if((i+1) % 10 == 0)
		System.out.printf("\n"); //列印10筆, 換⾏
		}
		System.out.printf("\n"); // 列印完畢, 換⾏
		}
	}


