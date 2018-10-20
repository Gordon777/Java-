package Java_version_2;
/* ⾛迷宮演練(驗證 Stack 功能) */
import java.util.*;
public class 迷宮練習 {
	static String Stack[] = new String[50]; // 宣告佇列空間
	static int Top; // 宣告佇列後端
	public static void main(String args[]) {
	Scanner keyin = new Scanner(System.in);
	Top = -1; // 佇列初值，表⽰佇列空閒
	String step;
	String path[] = {"D0", "D9", "D8", "D7", "E7",
	"F7", "G7", "H7", "I7", "J7",
	"K7", "K6", "L6", "L5", "L4",
	"L3", "L2", "M2", "N2", "N3",
	"N4", "N5", "N6", "N7", "N8",
	"O8", "P8", "P7", "P6", "P5",
	"P4", "P3", "P2", "P1", "Q1"};
	int select;
	disp_menu();
	select = keyin.nextInt();
	while(select != 4) {
	switch(select) {
	case 1:
	disp_Stack();
	break;
	case 2:
	for (int i=0; i<path.length; i++){
	step = path[i];
	if (push(step))
	System.out.printf("%s ==> ", step);
	else {
	System.out.printf("⽬前路徑已滿請回頭!!\n");
	break;
	}
	if ((i+1) %5 == 0)
	System.out.printf("\n");
	}
	System.out.printf("總共⾛了 %d 路徑\n", Top+1);
	break;
	case 3:
		int k = 0;
		while (Top >= 0) {
		step = pop();
		System.out.printf("%s ==> ", step);
		k = k + 1;
		if(k%5 == 0)
		System.out.printf("\n");
		}
		System.out.printf("回程路徑已結束\n");
		break;
		default:
		System.out.printf("輸入錯誤 !! 請重新輸入\n");
		}
		disp_menu();
		select = keyin.nextInt();
		}
	}
	// 列印功能表
	static void disp_menu() {
	System.out.printf("== 歡迎光臨 ⾛迷宮演練 ==\n");
	System.out.printf("(1) 列印以⾛過的路線\n");
	System.out.printf("(2) 迷宮去程開始\n");
	System.out.printf("(3) 迷宮回程開始\n");
	System.out.printf("(4) 離開系統\n");
	System.out.printf("\t 請輸入⼯作選項 =>");
	}
	// 列印 Stack 內容
	static void disp_Stack() {
	System.out.printf("\n== 到⽬前經過 %d 個路徑 ==\n", Top+1);
	for(int i=0; i<= Top; i++){
	System.out.printf("(%d)%s ", i+1, Stack[i]);
	if ((i+1) %5 == 0)
	System.out.printf("\n");
	}
	}
	// 加入 Push 元素
	static boolean push(String step){
	if (Top >= 50) {
	return false;
	}else {
	Top = Top +1;
	Stack[Top] = step;
	return true;
	}
	}
	static String pop(){
		String step = Stack[Top];
		Top = Top - 1;
		return step;
	}
	}