package Java_version_2;
/* 請建立⼀套電⼦化企業管理系統，其中包含:員⼯代號、姓名、部⾨、底薪與職務加級 */
import java.util.*;

class Employee {
int ID; //員⼯代號
String name; // 員⼯姓名
String depart; // 服務部⾨
int payment; // 底薪
int duty; // 職務加級
}
public class object產生運用 {
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		
		/* new 產⽣物件變數 */
		Employee emp = new Employee();
		System.out.printf("***** 輸入員⼯資料 *****\n");
		System.out.printf("輸入員⼯姓名 =>");
		emp.name = keyin.nextLine();
		System.out.printf("輸入員⼯所屬部⾨ =>");
		emp.depart = keyin.nextLine();
		System.out.printf("輸入員⼯代號 =>");
		emp.ID = keyin.nextInt();
		System.out.printf("輸入員⼯底薪 =>");
		emp.payment = keyin.nextInt();
		System.out.printf("輸入薪資加級 =>");
		emp.duty = keyin.nextInt();
		System.out.printf("\n***** 印出員⼯資料 *****\n");
		System.out.printf("員⼯代號 = %d\n", emp.ID);
		System.out.printf("員⼯姓名 = %s\n", emp.name);
		System.out.printf("所屬部⾨ = %s\n", emp.depart);
		System.out.printf("底 薪 = %d\n", emp.payment);
		System.out.printf("職務加級 = %d\n", emp.duty);
		}
	}