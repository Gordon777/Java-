package Java_version1;
import java.util.*;

public class �[�k����ƻs�@ {
	/* main ��k�}�l */
	public static void main(String args[]) {
	Scanner keyin = new Scanner(System.in); int sum; // �ϰ��ܼ�
	int value1, value2; 
	System.out.printf("�п�J�Ĥ@�Ӿ�� =>"); 
	value1 = keyin.nextInt(); 
	System.out.printf("�п�J�ĤG�Ӿ�� =>"); 
	value2 = keyin.nextInt();
	/* �I�s Add() ��� */
	sum = Add(value1, value2);
	System.out.printf("%d+%d = %d\n", value1, value2, sum);
	} /* main ��k���� */
	/* Add ��k�}�l */
	static int Add(int a, int b) {
	int sum; 
	sum = a + b; 
	return sum;
	} /*Add��k����*/ 
	} 
	// �ϰ��ܼ�

