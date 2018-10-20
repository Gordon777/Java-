package Java_version1;
import java.util.*; 

public class 醫療診斷系統 {
	 public static void main(String args[])
	 {
		 Scanner keyin = new Scanner(System.in);
		 String key;
		 System.out.printf("歡迎使⽤醫療診斷系統,  請依序回答問題 \n");
		 System.out.printf("===================================== \n");
		 System.out.printf("請問您最近是否發燒 (y/n) =>");
		 key = keyin.nextLine();
		 if (key.equals("y")) {
			 System.out.printf("請問您最近是否咳嗽 (y/n) =>");
			 key = keyin.nextLine();
			 if (key.equals("y")) {
				 System.out.printf("請問您最近是否感覺疲倦 (y/n) =>");
				 key = keyin.nextLine();
				  if (key.equals("y")) {
					  System.out.printf("先⽣/⼩姐您已經感冒了 !!! \n");
				  }
				  else {
					  System.out.printf("請問您是否⾎壓升⾼ (y/n) =>");
					  key = keyin.nextLine();
					  if (key.equals("y")) {
						  System.out.printf("請問您最近是否⼝乾 (y/n) =>");
						  key = keyin.nextLine();
						  key = keyin.nextLine();
						  if (key.equals("y"))
							  System.out.printf("先⽣/⼩姐您可能得肝病 !!! \n");
						  else
							  System.out.printf("有可能僅有感冒⽽已 ??? \n");
					  }
					  else {
						  System.out.printf("請問您最近是否盜汗 (y/n) =>"); 
						  key = keyin.nextLine();
						  if (key.equals("y"))
							  System.out.printf("先⽣/⼩姐您可能得肺病 !!! \n");
						  else
							  System.out.printf("需要由其他系統進⼀步檢查 !!! \n");
					  }
				  }
			 }
			 else
				 System.out.printf("有發燒無咳嗽, 請到別科⾨診 !!!\n");
					  }
		 else
			 System.out.printf("應該是健康⾝體 \n"); 
				  }
			 }
		 



