package Java_version1;
import java.util.*;

public class �±N��ܥX�P���� {
	public static void main(String args[]) {
		int maxNum, num1, num2, num3, num4;
		Scanner keyin = new Scanner(System.in); System.out.printf("�� �F�� �Y��l (�� Enter ��) =>"); keyin.nextLine(); //�Ȱ����\��
		num1 = game();
		System.out.printf("�F���Y���O: %d\n", num1);
		
		System.out.printf("�� �n�� �Y��l (�� Enter ��) =>"); 
		keyin.nextLine(); //�Ȱ����\��
		num2 = game();
		System.out.printf("�n���Y���O: %d\n", num2);
		
		System.out.printf("�� ��� �Y��l (�� Enter ��) =>"); 
		keyin.nextLine(); //�Ȱ����\��
		num3 = game();
		System.out.printf("����Y���O: %d\n", num3);
		
		System.out.printf("�� �_�� �Y��l (�� Enter ��) =>"); 
		keyin.nextLine(); //�Ȱ����\��
		num4 = game();
		System.out.printf("�_���Y���O: %d\n", num4);
		
		maxNum = max(num1, max(num2, max(num3, num4)));
		System.out.printf("�Y�X�̤j���O = %d\n", maxNum);

	}
	static int game() 
	{
		Random random = new Random(); 
		int k,sum=0,ran;
		System.out.printf("\t�Y�X => "); 
		for (k=1; k<=3; k++) {
		ran= 1 + random.nextInt(6);
		System.out.printf("%d ",ran);
		sum = sum + ran; 
		}
		System.out.printf("\n");
		return sum;
	}
	static int max(int a, int b) { if(a>b)
		return a; else
		return b; }
		}
