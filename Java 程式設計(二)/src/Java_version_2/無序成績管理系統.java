package Java_version_2;
/* 三⺠國中張老師成績管理系統 */
import java.util.*;
public class 無序成績管理系統 {
	static int course[][] = new int[50][7]; // 宣告無序陣列空間
	static String name[]={"學號","國文","英文","數學","理化","⾃然","平均"};
	static int point; // 宣告游標變數
	public static void main(String args[]) {
	Scanner keyin = new Scanner(System.in);
	Random ran = new Random();
	int value; // 輸入元素
	int select; // 功能選擇
	point = -1; // 游標初值(初值已存入 5 筆資料)
	int location;
	for (int i=0; i<10; i++){ //給予陣列初值
	course[i][0] = 1 + ran.nextInt(50);
	for(int j=1; j<=5; j++)
	course[i][j] = 30 + ran.nextInt(70);
	point = point + 1;
	}
	disp_menu();
	select = keyin.nextInt();
	while(select != 7) {
	switch(select) {
	case 1:
	disp_course();
	break;
	case 2:
	if (point >=50) {
	System.out.printf("陣列已滿無法插入!!\n");
	}else {
	point = point +1;
	System.out.printf("請輸入學⽣學號(2位數) =>");
	course[point][0]= keyin.nextInt();
	System.out.printf("請輸入國文成績 =>");
	course[point][1]= keyin.nextInt();
	System.out.printf("請輸入英文成績 =>");
	course[point][2]= keyin.nextInt();
	System.out.printf("請輸入數學成績 =>");
	course[point][3]= keyin.nextInt();
	System.out.printf("請輸入理化成績 =>");
	course[point][4]= keyin.nextInt();
	System.out.printf("請輸入⾃然成績 =>");
	course[point][5]= keyin.nextInt();
	}
	System.out.printf("⽬前學⽣⼈數為 %d\n", point);
	break;
	case 3:
		System.out.printf("請輸入欲刪除學⽣學號 =>");
		value = keyin.nextInt();
		location = Linear_serach(value);
		if (location == -1){
		System.out.printf("沒有學號= %d 學⽣\n", value);
		}else {
		for(int i = location;i<=point;i++)
		course[i] = course[i+1];
		}
		point = point - 1;
		System.out.printf("%d 學⽣已刪除成功\n", value);
		System.out.printf("⽬前學⽣⼈數為 %d\n", point);
		break;
		case 4:
		System.out.printf("請輸入欲查詢學號 =>");
		value = keyin.nextInt();
		location = Linear_serach(value);
		if (location == -1){
		System.out.printf("沒有學號= %d 學⽣\n", value);
		}else {
		for(int i=0;i<=6;i++){
		System.out.printf("%s=%d ", name[i], course[location][i]);
		}
		System.out.printf("\n");
		}
		break;
		case 5:
		System.out.printf("請輸入欲更新成績的學號 =>");
		value = keyin.nextInt();
		location = Linear_serach(value);
		if (location == -1){
		System.out.printf("沒有學號= %d 學⽣\n", value);
		}
		else {
			System.out.printf("更新 %d 學⽣的成績 =>\n", course[location][0]);
			System.out.printf("請更新國文成績(%d) =>", course[location][1]);
			course[location][1]= keyin.nextInt();
			System.out.printf("請更新英文成績(%d) =>", course[location][2]);
			course[location][2]= keyin.nextInt();
			System.out.printf("請更新數學成績(%d) =>", course[location][3]);
			course[location][3]= keyin.nextInt();
			System.out.printf("請更新理化成績(%d) =>", course[location][4]);
			course[location][4]= keyin.nextInt();
			System.out.printf("請更新⾃然成績(%d) =>", course[location][5]);
			course[location][5]= keyin.nextInt();
			}
			break;
		case 6:
			int sum;
			for(int i=0; i<=point; i++){
			sum = 0;
			for(int j=1; j<=5; j++)
			sum = sum + course[i][j];
			course[i][6] = sum/5;
			}
			buffer_sort();
			disp_course();
			break;
			default:
			System.out.printf("輸入錯誤 !! 請重新輸入\n");
			}
			disp_menu();
			select = keyin.nextInt();
			}
			}
			static void disp_menu() {
			System.out.printf("== 三⺠國中 張老師成績管理系統 ==\n");
			System.out.printf("(1) 列印全班成績\n");
			System.out.printf("(2) 新增學⽣成績\n");
			System.out.printf("(3) 刪除學⽣成績\n");
			System.out.printf("(4) 查詢學⽣成績\n");
			System.out.printf("(5) 更新學⽣成績\n");
			System.out.printf("(6) 依平均成績⾼低列印\n");
			System.out.printf("(7) 離開系統\n");
			System.out.printf("\t 請輸入⼯作選項 =>");
			}
			static void disp_course() { /* 列印全班各科成績 */
			System.out.printf("\n== 列印全班各科成績==\n");
			for(int i=0; i<name.length; i++)
			System.out.printf("%s ", name[i]);
			System.out.printf("\n");
			for(int i=0; i<=point; i++) {
			for(int j=0; j<course[i].length; j++)
				System.out.printf("%2d ", course[i][j]);
			System.out.printf("\n");
			}
			System.out.printf("\n"); // 列印完畢, 換⾏
			}
			
			static int Linear_serach(int value){
				int flag=0, i=0;
				int location=-1;
				while (i <= point) {
				if(value == course[i][0]) {
				flag = 1;
				location = i;
				break;
				}
				i = i+1;
				}
				if (flag == 1)
				return location;
				else
				return -1;
				}
				static void buffer_sort(){
				int temp[] = new int[7];
				for(int i=0; i<=point; i++){
				for(int j=0; j<=point; j++) {
				if(course[i][6] < course[j][6]){
				temp = course[i];
				course[i] = course[j];
				course[j] = temp;
				}
				}
				}
				}
				}