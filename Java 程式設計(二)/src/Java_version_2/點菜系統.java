package Java_version_2;
import java.util.*;

class Item1 {
String name; // 菜單項⽬名稱
int price; // 單價
int calory; // 熱量
}

class Fare_item{
int No; // 桌次號碼
String name; // 菜名
int price; // 價格
int calory; // 熱量
}

public class 點菜系統 {
	static Item1[] Menu = new Item1[100]; // 菜單價⽬表
	static int Item_No = 0; // 菜單項⽬數量
	static Fare_item[] Fare = new Fare_item[20]; // 顧客點菜項⽬
	static int Fare_No = 0; // 顧客點菜項⽬數量
	
	public static void main(String[] args){
		Scanner keyin = new Scanner(System.in);
		// 給予菜單初值
		
		String name[] = {"蠔油香菇","蒜泥⽩⾁","筍⼲扣⾁","五味花枝",
				"紅燒鮮⿂","⿇婆豆腐","⽩⽟珍丸","快炒青菜",
				"青菜豆腐湯", "⽔晶蝦餃","紅油炒⼿","蜜汁叉燒酥",
				"藕斷絲連","龍⾨炒米粉","瑤柱炒飯","龍蝦鮮麵",
				"⽩ 飯","⾜料觀湯","香菜⽪蛋湯","酸辣海鮮湯",
				"清 湯","南瓜⻄米露"};
		int[] price = {300,250,320,200,400,100,150,100,100,200,200,
				200,200,300,300,400,20,500,200,200,20,150};
		int[] calory = {800,500,700,600,600,200,300,150,100,300,400,
				400,300,500,500,400,100,800,300,300,10,200};
		
		for (int i=0; i<name.length; i++) {
			Menu[i] = new Item1();
			Menu[i].name = name[i];
			Menu[i].price = price[i];
			Menu[i].calory = calory[i];
			}
		// 給予菜單初值結束、點菜作業開始
		int table_No, count, item, sel;
		int total_m=0, total_c=0;
		System.out.printf("請輸入桌次 =>");
		table_No = keyin.nextInt();
		for(int i=0; i<Item_No; i++){
		System.out.printf("(%d)%s ", (i+1), Menu[i].name);
		if ((i+1)%5 == 0)
		System.out.printf("\n");
		}
		System.out.printf("(0) 結束點菜 \n");
		System.out.printf("請輸入菜名的編號 =>");
		item = keyin.nextInt();
		count = 0;
		while(item != 0) {
			Fare[Fare_No] = new Fare_item();
			Fare[Fare_No].No = table_No;
			Fare[Fare_No].name = Menu[item-1].name;
			Fare[Fare_No].price = Menu[item-1].price;
			Fare[Fare_No].calory = Menu[item-1].calory;
			total_m = total_m + Fare[Fare_No].price;
			total_c = total_c + Fare[Fare_No].calory;
			Fare_No = Fare_No + 1;
			count = count + 1;
			System.out.printf("累計%d元，%d 卡洛⾥、請輸入菜名的編號 =>",
			total_m, total_c);
			item = keyin.nextInt();
			}
		System.out.printf("%d 桌顧客菜單如下：\n", table_No);
		System.out.printf(" 菜名\t\t價格\t熱量\n");
		for(int i=0;i< count;i++)
		System.out.printf("%s\t%3d\t%3d\n",Fare[i].name,Fare[i].price,
		Fare[i].calory);
		System.out.printf("總計\t\t總價格:%d\t總熱量:%d\n",total_m,total_c);
		System.out.printf("廚房增加菜單如下：\n");
		for(int i=0;i<count;i++)
		System.out.printf("%3d桌次\t %s \n",Fare[i].No, Fare[i].name);
		}
		}