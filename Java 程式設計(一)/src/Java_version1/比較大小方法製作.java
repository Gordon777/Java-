package Java_version1;
import java.util.*;

public class ����j�p��k�s�@ {
	public static void main(String args[]) { 
		Scanner keyin = new Scanner(System.in); 
		int max=0, min=999;
	int value;
	for(int i=0; i<5; i++){
	System.out.printf("�п�J�� %d ��� =>", i+1); 
	value = keyin.nextInt();
	max = Max(max, value);
	min = Min(min, value);
	}
	System.out.printf("�̤j�ƭȬO %d\n", max); 
	System.out.printf("�̤p�ƭȬO %d\n", min);
	} /* main ��k���� */
	static int Max(int a, int b) { //Max ��k�}�l
	if (a > b)
	return a; 
	else
	return b;
	} //Max ��k����
	static int Min(int a, int b){ //Min��k�}�l 
	if(a <b)
	return a; 
	else
	return b; }//Min��k����
	} /* Ex6_2 ���O���� */
	
