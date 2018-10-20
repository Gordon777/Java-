package Java_version_2;
/* 醫院掛號系統(僅插入 Queue 功能) */
import java.util.*;
public class 陣列佇列結構 {
	static String Queue[] = new String[50]; // 宣告佇列空間
	static int Rear; // 宣告佇列後端
	static int Front=0; // 宣告佇列前端
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		Rear = -1; // 佇列初值，表⽰佇列空閒
		String customer;
		int select;
		disp_menu();
		select = keyin.nextInt();
		while(select != 3) {
		switch(select) {
		case 1:
		disp_Queue();
		break;
		case 2:
		System.out.printf("請輸入客⼾姓名 =>");
		customer = keyin.next();
		if (enQueue(customer))
		System.out.printf("%s 已掛號成功!!\n", customer);
		else
		System.out.printf("⽬前掛號已滿請稍候再掛!!\n");
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
		System.out.printf("== 歡迎光臨 甄美麗掛號系統 ==\n");
		System.out.printf("(1) 列印⽬前掛號客⼾名單\n");
		System.out.printf("(2) 客⼾掛號\n");
		System.out.printf("(3) 離開系統\n");
		System.out.printf("\t 請輸入⼯作選項 =>");
		}
	// 列印 Queue 內容
	static void disp_Queue() {
	System.out.printf("\n== ⽬前有 %d 位客⼾掛號 ==\n", Rear+1);
	for(int i=0; i<= Rear; i++)
		System.out.printf("(%d)%s \n", i+1, Queue[i]);
	}
	// 加入 Queue 元素
	static boolean enQueue(String customer){
	if (Rear >= 50) {
	return false;
	}else {
	Rear = Rear +1;
	Queue[Rear] = customer;
	return true;
	}
	}
	}	
