package Java_version1;
import java.lang.*; // 導入子套件 (包含 Math類別)
import java.util.Scanner;//導入套件內的類別

public class 製作工程計算器 {
	public static void main(String args[]) {
		/* 利用套件內類別 java.util.Sacnner 產生物件 keyin */ 
		Scanner keyin = new Scanner(System.in);
		double value, ans=0;
		int select;
		disp_men();
		/* 呼叫引用 keyin 的物件方法 nextInt() */ 
		select = keyin.nextInt();
		while( select != 7) {
		System.out.printf("輸入一個數值 (注意三角函數範圍) =>");
		/* 呼叫 keyin 的nextDouble 物件方法 */ value = keyin.nextDouble(); switch(select) {
		case 1:
		/* 直接引用類別 Math 的類別方法 */
		ans = Math.log(value); 
		System.out.printf("log(%.2f) = %.2f\n", value, ans); 
		break;
		case 2:
		/* 直接引用類別 Math 的類別方法 */
		ans = Math.log10(value); 
		System.out.printf("log10(%.2f) = %.2f\n", value, ans); 
		break;
		case 3:
		/* 直接引用類別 Math 的類別方法 */
		ans = Math.sqrt(value); 
		System.out.printf("sqrt(%.2f) = %.2f\n", value, ans); 
		break;
		case 4:
		ans = Math.sin(value); 
		System.out.printf("sin(%.2f) = %.2f\n", value, ans); 
		break;
		case 5:
		ans = Math.cos(value); 
		System.out.printf("cos(%.2f) = %.2f\n", value, ans); 
		break;
		case 6:
		ans = Math.tan(value); 
		System.out.printf("tan(%.2f) = %.2f\n", value, ans); 
		break;
		default: 
		System.out.printf("錯誤輸入 \n");
		}
		disp_men();
		select = keyin.nextInt();
		}
		System.out.print("== 謝謝使用 歡迎再度光臨 ==\n"); 
		}
	
		static void disp_men() {
		System.out.printf("\n*** 工程計算器提供有下列功能 ***\n"); 
		System.out.printf("(1) log 函數\t (2) log10() 函數\n");
		System.out.printf("(3) sqrt 函數\t (4) sin() 函數\\n");
		System.out.printf("(5) cos 函數\t (6) tan() 函數\\n");
		System.out.printf("(7) 離開系統\n"); 
		System.out.printf("請選擇輸入 =>");
		} 
		}
