package Java_version1;
import java.io.*;

public class javaio {
public static void main(String args[]) throws IOException { BufferedReader keyin = new BufferedReader(new
InputStreamReader(System.in));
int value;
String name; System.out.printf("請輸入大德先生/小姐姓名 = >"); name = keyin.readLine(); System.out.printf("請輸入捐款金額 =>");
value = Integer.parseInt(keyin.readLine()); System.out.printf("列印收據如下: \n\n");
System.out.printf("**** xxx收容所  捐款收據****/n");
System.out.printf("\n");
System.out.printf(" 感謝 %s 先生/小姐大德贊助\n",name);
System.out.printf("捐款%d元整\n",value);
System.out.printf("**** 四海之內皆兄弟 順祝 平安快樂 ****\n");
}
}