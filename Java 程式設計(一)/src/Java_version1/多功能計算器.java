package Java_version1;
import java.util.Scanner;

public class 多功能計算器 {
	 public static void main(String args[]) { 
		 Scanner keyin = new Scanner(System.in);
		 float op1, op2, result=0F; 
		 String oper_st; 
		 char oper;
		 System.out.printf("== 歡迎使⽤+ - * / 計算器 ==\n");
		 System.out.printf("請輸入(如: 45 + 28) =>");
		 op1 = keyin.nextFloat();
		 oper_st = keyin.next();
		 oper = oper_st.charAt(0);
		 op2=keyin.nextFloat();
		 switch(oper) {
		 case '+': 
			 result = op1 + op2;
		 	 break;
		 case '-': 
			 result = op1 - op2;
		 	 break; 
		 case '*': 
			 result = op1 * op2;
		 	 break;	 
		 case '/': 
			 result = op1 / op2;
		 	 break;
		 }
		 System.out.printf("%.2f %s %.2f = %.2f\n", op1, oper, op2, result); 
	 }
	

}
