package Java_version_2;
import java.io.*;
import java.util.*;
/* 停⾞票 */
class carTicket {
private static int count=0;
private int ticket; // 停⾞票號碼
int[] enterTime = new int[2]; // 進入停⾞場時間
int setTicket() { // 設定停⾞票號碼
count++;
ticket = count;
return ticket;
}
int getTicket() { // 取得停⾞票號碼
return ticket;
}
}
/* ⽬前停放⾞輛 */
class Cars {
static carTicket[] car = new carTicket[100];
static int number;
}
/*公眾計時器 (利⽤設定輸入) */
class Clock {
static int hour;
static int minute;
}
public class 停車場 {
	static Scanner keyin = new Scanner(System.in);
	public static void main(String args[]) {
	Cars.number = 0;
	int select = get_menu();
	while (select != 5) {
	switch(select) {
	case 1: // 顯⽰⽬前停⾞
	disp_cars();
	break;
	case 2: // 設定現在時間
	set_time();
	break;
	case 3: // ⾞輛進入
	enter_car();
	break;
	case 4: // ⾞輛出場
	outer_car();
	break;
	default:
		System.out.printf("錯誤選擇, 請重新輸入\n");
		}
		select = get_menu();
		}
		}
	
	/* 主功能表選單 */
	static int get_menu() {
	System.out.printf("\n** ⾼雄市前⾦立體停⾞場 管理系統 ⽬前時間");
	System.out.printf(" %d 時 %d 分 **\n", Clock.hour, Clock.minute);
	System.out.printf("(1) 顯⽰⽬前停⾞ (2) 設定⽬前時間\n");
	System.out.printf("(3) ⾞輛進入取票 (4) ⾞輛出場繳費\n");
	System.out.printf("(5) 離開系統\n");
	System.out.printf("⽬前⾞輛 %d 請輸入⼯作選項 =>", Cars.number);
	int select = keyin.nextInt();
	keyin.nextLine();
	return select;
	}
	
	/* 顯⽰⽬前停⾞⾞輛 */
	static void disp_cars() {
	System.out.printf("停⾞票號\t\t進入時間\n");
	for(int i=0; i<Cars.number; i++) {
	System.out.printf("%d\t\t", Cars.car[i].getTicket());
	System.out.printf("%d 時 %d 分\n", Cars.car[i].enterTime[0],
	Cars.car[i].enterTime[1]);
	}
	}
	
	/* 設定⽬前公⽤時間 */
	static void set_time() {
	System.out.printf("請輸入⽬前時間(時/分) =>");
	String now = keyin.nextLine();
	Scanner s = new Scanner(now).useDelimiter("/");
	Clock.hour = s.nextInt();
	Clock.minute = s.nextInt();
	}
	/* ⾞輛進場 */
	static void enter_car() {
	Cars.car[Cars.number] = new carTicket();
	Cars.car[Cars.number].setTicket();
	Cars.car[Cars.number].enterTime[0] = Clock.hour; //記錄時
	Cars.car[Cars.number].enterTime[1] = Clock.minute; // 記錄分
	int ticket = Cars.car[Cars.number].getTicket();
	System.out.printf("請按<Enter>鍵取票 (票號：%d) =>", ticket);
	keyin.nextLine();
	Cars.number = Cars.number + 1; // 下⼀輛號碼
	}
	/* ⾞輛出場, 繳費 */
	static void outer_car() {
	System.out.printf("請出⽰停⾞票 =>");
	int ticket = keyin.nextInt();
	keyin.nextLine();
	int flag =0, i;
	for(i=0; i<Cars.number; i++) { // 搜尋該停⾞號
	if(ticket == Cars.car[i].getTicket()){
	flag = 1;
	break;
	}
	}
	if (flag == 0) {
		System.out.printf("查無此⾞輛 \n");
		return;
		}
		int hour = Clock.hour - Cars.car[i].enterTime[0];
		int minute = Clock.minute - Cars.car[i].enterTime[1];
		minute = minute + hour * 60;
		int tax = (minute/30) * 20;
		for(int j=i; j<Cars.number; j++) // 刪除該⾞票紀錄
		Cars.car[j] = Cars.car[j+1];
		Cars.number = Cars.number - 1; // 停⾞數 - 1
		System.out.printf("請繳交 %d 停⾞費(按<Enter>鍵) =>", tax);
		keyin.nextLine();
		}
		}