package Java_version1;
import java.io.*;

public class javaio {
public static void main(String args[]) throws IOException { BufferedReader keyin = new BufferedReader(new
InputStreamReader(System.in));
int value;
String name; System.out.printf("�п�J�j�w����/�p�j�m�W = >"); name = keyin.readLine(); System.out.printf("�п�J���ڪ��B =>");
value = Integer.parseInt(keyin.readLine()); System.out.printf("�C�L���ڦp�U: \n\n");
System.out.printf("**** xxx���e��  ���ڦ���****/n");
System.out.printf("\n");
System.out.printf(" �P�� %s ����/�p�j�j�w�٧U\n",name);
System.out.printf("����%d����\n",value);
System.out.printf("**** �|�������ҥS�� ���� ���w�ּ� ****\n");
}
}