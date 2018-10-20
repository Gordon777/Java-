package Java_version_2;
import java.util.Scanner;


class Employee3 {
/* 宣告物件成員 ***/
private int ID; // 員⼯代號, 介於 1000~5000
String name; // 員⼯姓名
String depart; // 所屬部⾨
private int payment; // 底 薪 > 15800
private int extra; // 加班時數 < 45

/*** 宣告物件⽅法 ***/
int setID(int i) { // 設定員⼯代號⽅法, 1: 正常, 0: 錯誤
if((i>1000) && (i <5000)) {
ID = i;
return 1;
}
else {
System.out.printf("需 1000 <員⼯代號 < 5000 範圍 !!\n");
return 0;
}
}
int getID() { // 讀取員⼯代號⽅法
return ID;
}
int setPayment(int pay) { //設定底薪⽅法, 1: 正常, 0: 錯誤
if (pay < 15800) {
System.out.printf("底薪不可低於 15800 元\n");
return 0;
}
else {
	payment = pay;
	return 1;
	}
	}
	int getPayment() { // 讀取底薪⽅法
	return payment;
	}
	int setExtra(int ex) { // 設定加班時數⽅法, 1: 正常, 0: 錯誤
	if (ex > 45) {
	System.out.printf("加班時數不可超過 45 ⼩時\n");
	return 0;
	}
	else {
	extra = ex;
	return 1;
	}
	}
	int getExtra() { // 取得加班時數⽅法
	return extra;
	}
	}
public class 人資系統 {
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		Employee3 worker = new Employee3();
		int id, pay, ex, pay1;
		
		System.out.printf("** 展鵬資訊 建立員⼯資料 **\n");
		System.out.printf("請輸入 員⼯姓名 =>");
		worker.name = keyin.nextLine();
		System.out.printf("請輸入員⼯部⾨ = >");
		worker.depart = keyin.nextLine();
		
		System.out.printf("請輸入員⼯代號 =>");
		id = keyin.nextInt();
		keyin.nextLine();
		if (worker.setID(id)==0) {
		System.out.printf("程式停⽌運作 \n");
		return;
		}
		
		
		System.out.printf("請輸入員⼯底薪 =>");
		pay = keyin.nextInt();
		keyin.nextLine();
		if (worker.setPayment(pay) == 0) { // 判斷是否正常設定
		System.out.printf("程式停⽌運作 \n");
		return;
		}
		
		
		System.out.printf("請輸入員⼯加班時數 =>");
		ex = keyin.nextInt();
		keyin.nextLine();
		if (worker.setExtra(ex) == 0) { // 判斷是否正常設定
		System.out.printf("程式停⽌運轉 \n");
		return;
		}
		
		System.out.printf("**** 列印員⼯薪資表 *****\n");
		System.out.printf("代號 姓名 部⾨ 本⽉薪資\n");
		System.out.printf("%d\t", worker.getID());
		System.out.printf("%s\t", worker.name);
		System.out.printf("%s\t", worker.depart);
		pay = worker.getPayment();
		pay1 = (int)((double)pay/(30 * 8)) * worker.getExtra();
		System.out.printf("%d\n", pay+pay1);
		}
		}


