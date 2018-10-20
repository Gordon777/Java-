package Java_version_2;
/* 請您幫他建立⼀套『菜單價⽬表』（Menu）,
請製作⼀個菜單項⽬ Item，再產⽣ Menu 物件陣列
時立即並給予下列初值內容，再依照設計格式印出價⽬表）*/

class Item {
String name;
int price;
int calory;
}

public class 真健康美食餐廳 {
	static Item[] Menu = new Item[100];
	public static void main(String[] args){
	// 給予菜單初值
		String name[] = {"蠔油香菇","蒜泥⽩⾁","筍⼲扣⾁","五味花枝",
				"紅燒鮮⿂","⿇婆豆腐","⽩⽟珍丸","快炒青菜",
				"青菜豆腐湯", "⽔晶蝦餃", "紅油炒⼿",
				"蜜汁叉燒酥","藕斷絲連","龍⾨炒米粉",
				"瑤柱炒飯", "龍蝦鮮麵","⽩ 飯","⾜料觀湯",
				"香菜⽪蛋湯","酸辣海鮮湯", "清 湯",
				"南瓜⻄米露"};
		int[] price = {300,250,320,200,400,100,150,100,100,
				200, 200,200,200,300, 300,400,20,500,
				200,200,20,150};
		int[] calory = {800,500,700,600,600,200,300,150, 100,
				300,400,400,300,500, 500,400,100,800,
				300,300,10,200};
		for (int i=0; i<name.length; i++) {
			Menu[i] = new Item();
			Menu[i].name = name[i];
			Menu[i].price = price[i];
			Menu[i].calory = calory[i];
			}
		System.out.printf(" 菜單\t\t價格\t卡路⾥\n");
		for (int i=0; i<name.length; i++) {
		System.out.printf("%s\t", Menu[i].name);
		System.out.printf("%d\t", Menu[i].price);
		System.out.printf("%s\t", Menu[i].calory);
		System.out.printf("\n");
		}
	}
}
