package Java_version_2;
/* 請建立⼀套超商販賣系統，能顯⽰商品名稱與單價，提供客⼈購買，最後印出結果 */
import java.util.*;
class Element 
{
String name; // 商品名稱
int price; // 單價
int pice; // 購買數量
int sum; // ⼩計
}

public class 超商販賣系統 {
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		Element[] cust = new Element[20]; // 登錄客⼾購買產品
		int select, k, no, total;
		dispElement();
		select = keyin.nextInt();
		k=0;
		while ((select != 7) && (k<20)) {
			System.out.printf("\t購買數量 =>");
			no = keyin.nextInt();
			switch (select) {
			case 1:
			cust[k] = new Element();
			cust[k].name = "可⼝餅乾";
			cust[k].price = 20;
			cust[k].pice = no;
			k = k + 1;
			break;
			case 2:
			cust[k] = new Element();
			cust[k].name = "味全鮮乳";
			cust[k].price = 30;
			cust[k].pice = no;
			k = k + 1;
			break;
			case 3:
			cust[k] = new Element();
			cust[k].name = "御便當";
			cust[k].price = 50;
			cust[k].pice = no;
			k = k + 1;
			break;
			case 4:
				cust[k] = new Element();
				cust[k].name = "⿊松汽⽔";
				cust[k].price = 20;
				cust[k].pice = no;
				k = k + 1;
				break;
				case 5:
				cust[k] = new Element();
				cust[k].name = "頻果⻄打";
				cust[k].price = 30;
				cust[k].pice = no;
				k = k + 1;
				break;
				case 6:
				cust[k] = new Element();
				cust[k].name = "脆迪酥";
				cust[k].price = 20;
				cust[k].pice = no;
				k = k + 1;
				break;
				default:
				System.out.printf("請重新正確選擇 \n");
				break;
				}
			dispElement();
			select = keyin.nextInt();
			}
			/* 計算各產品⼩計與購買總⾦額 */
			total = 0;
			for (int i=0; i<k; i++) {
			cust[i].sum = cust[i].price * cust[i].pice;
			total = total + cust[i].sum;
			}
			/* 列印購買清單 */
			System.out.printf("***** 購買清單如下 *****\n");
			System.out.printf("品名\t\t單價 \t數量\t ⼩計\n");
			for (int i=0; i<k; i++)
			System.out.printf("%s%10d%10d%10d\n", cust[i].name,
			cust[i].price, cust[i].pice, cust[i].sum);
			System.out.printf("總計 = %d\n", total);
			}
			/* 顯⽰客⼾購買商品選項 */
			public static void dispElement(){
			System.out.printf(" ** 歡迎光臨 春嬌超商 請選擇購買商品 ****\n");
			System.out.printf("(1) 可⼝餅乾 20 元\t");
			System.out.printf("(2) 味全鮮乳 30 元\t");
			System.out.printf("(3) 御便當 50 元\n");
			System.out.printf("(4) ⿊松汽⽔ 20 元\t");
			System.out.printf("(5) 頻果⻄打 30 元\t");
			System.out.printf("(6) 脆迪酥 20 元\n");
			System.out.printf("(7) 結算⾦額\n");
			System.out.printf("\t請輸入選項 =>");
			}
		}
					
