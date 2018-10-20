package Java_version_2;
import java.util.Scanner;
import java.io.*;

class Employee2{ /* 物件陣列的類別宣告 */
int ID; // 員⼯代號
String name; // 員⼯姓名
String depart; // 所屬部⾨
int payment; // 底薪
int duty; // 職務加級
}

public class 紀錄檔案輸出運用 {
	public static void main(String args[]) throws IOException {
		Scanner keyin = new Scanner(System.in);
		Employee2[] worker = new Employee2[20];
		
		/* 宣告輸出檔案物件 */
		String file = "Human.data";
		BufferedWriter data = new BufferedWriter(new FileWriter(file));
		int k=0;
		String sel;
		
		/* 讀入資料並存入物件陣列內 */
		System.out.printf("是否繼續輸入員⼯資料 (yes/no) =>");
		sel = keyin.nextLine();
		while(sel.equals("yes") && (k <20)) {
		worker[k] = new Employee2();
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
		keyin.nextLine(); // 清除鍵盤輸入
		System.out.printf("是否繼續輸入員⼯資料 (yes/no) =>");
		sel = keyin.nextLine();
		k = k+1;
		}
		
		/* 將物件陣列內容寫入檔案內 */
		System.out.printf("*** 將員⼯資料輸出到 Human.dada 檔案內 **\n");
		for (int i=0; i<k; i++) {
		data.write(worker[i].ID + "\t");
		data.write(worker[i].name + "\t");
		data.write(worker[i].depart + "\t");
		data.write(worker[i].payment + "\t");
		data.write(worker[i].duty + "\n");
		}
		data.close();
		System.out.printf("***** 輸出完畢 ****\n");
		}
	}
