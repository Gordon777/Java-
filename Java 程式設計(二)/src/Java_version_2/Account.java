package Java_version_2;
/* 設定客⼾姓名、帳號(ID) 與存款餘額 */
import java.io.*;
import java.util.Scanner;
public class Account {
	String name;
	private int[]ID = new int[13];
	private int balance;
	// 設定帳號
	int setID(String ID_Str) {
	if(ID_Str.length() !=12){
	System.out.printf("需12個字元,請重新輸入!!\n");
	return 0;
	}
	else{
	Scanner s = new Scanner(ID_Str).useDelimiter("");
	int total = 0;
	for(int i=0;i<12;i++){
	ID[i]=s.nextInt();
	if((i+1)%2==0)
	total+=ID[i];
	else
	total+=ID[i]*2;
	}
	ID[12] = (10-(total%10));
	System.out.print("****建立完成****\n完整的新帳⼾(13碼)為=>");
	for(int i=0;i<13;i++)
	System.out.print(ID[i]);
	System.out.println();
	return 1;
	}
	}	
	// 取得帳號
	int[] getID(){
	return ID;
	}
	// 寫入帳號
	int writeID(String ID_STR1) {
	if(ID_STR1.length() !=13){
		System.out.printf("⻑度不對\n");
		return 0;
		}
		else{
		Scanner s = new Scanner(ID_STR1).useDelimiter("");
		int total = 0, check, check_R;
		for(int i=0;i<12;i++){
		ID[i]=s.nextInt();
		if((i+1)%2==0)
		total+=ID[i];
		else
		total+=ID[i]*2;
		}
		check_R = s.nextInt();
		check = 10-(total%10);
		if (check == check_R) {
		ID[12] = check;
		return 1;
		} else {
		System.out.printf("檢查碼不對\n");
		return 0;
		}
		}
		}
	// 存款
	int saveM(int money){
	balance = balance + money;
	return balance;
	}
	// 取款
	int recM(int money) {
	int m = balance - money;
	if (m >=0) {
	balance = m;
	return balance;
	}
	else {
	return -1;
	}
	}
	// 查詢餘額
	int checkM(){
	return balance;
	}
	}