package Java_version_2;
/* 請建立⼀套薪資管理系統，允許輸入員⼯資料，並印出薪資表 */
import java.util.*;

class Employee1 { // 員⼯資料類別
int ID; // 員⼯代號
String name; // 員⼯姓名
String depart; // 服務部⾨
int payment; // 底 薪
int duty; // 職務加級
}

public class 簡單薪資管理系統 {
	
	public static void main(String args[]){
		Scanner keyin = new Scanner(System.in);
		Employee1[] worker;
		worker = new Employee1[20];
		int value, tax, k=0;
		String sel, temp;
		System.out.printf("是否繼續輸入員⼯資料 (yes/no) =>");
		sel = keyin.nextLine();
		while(sel.equals("yes") && (k <20)) {
		worker[k] = new Employee1();
		System.out.printf("***** 輸入員⼯資料 *****\n");
		System.out.printf("輸入員⼯姓名 =>");
		worker[k].name = keyin.nextLine();
		System.out.printf("輸入所屬部⾨ =>");
		worker[k].depart = keyin.nextLine();
		System.out.printf("輸入員⼯代號 =>");
		worker[k].ID = keyin.nextInt();
		System.out.printf("輸入員⼯底薪 =>");
		worker[k].payment = keyin.nextInt();
		System.out.printf("輸入薪資加級 =>");
		worker[k].duty = keyin.nextInt();
		keyin.nextLine();
		System.out.printf("是否繼續輸入員⼯資料 (yes/no) =>");
		sel = keyin.nextLine();
		k = k+1;
		}
		System.out.printf(" ***** 印出員⼯薪資表 *****\n");
		System.out.printf(" 員⼯資料\t\t薪資總額\t預扣稅額\t應領薪資\n");
		for (int i=0; i<k; i++) {
		System.out.printf(" %s ", worker[i].name);
		System.out.printf("(%d ", worker[i].ID);
		System.out.printf("%s)\t", worker[i].depart);
		value = worker[i].payment+worker[i].duty;
		System.out.printf(" %d\t\t", value);
		tax = (int)(value * 0.1);
		System.out.printf("%d\t\t", tax);
		value = value - tax;
		System.out.printf("%d\n", value);
		}
		}
		}
