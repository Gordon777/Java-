package Java_version1;
import java.util.*;
public class ���k�m�ߨt�� {
	public static void main(String args[]) 
	{ 
		Scanner keyin = new Scanner(System.in); 
		Random random = new Random();
		int ran1 = 1 + random.nextInt(9);	
		int ran2 = 1 + random.nextInt(9);
		int value1 = ran1 * ran2;
		
		System.out.printf("�п�J %d * %d =", ran1, ran2); 
		int value2 = keyin.nextInt();
		
		if (value1 == value2) 
		{ 
			System.out.printf("����F �z�n�� !!");
		} 
		else 
		{
			System.out.printf("�����F ���T���׬O %d �h�[�o�@ !!\n", value1); 
		}
	}

}
