package Java_version1;
import java.util.*;

public class �Y��l�j�Y�p�i�� {
	/* �ŧi���O�ܼ� (�����ܼ�)*/
	static String maxName="", minName="";
	static int maxNum=0, minNum=99;
	
	/* main ��k�}�l */
	public static void main(String args[]) {
	Scanner keyin = new Scanner(System.in); // �ϰ쪫��
	String name; // �ϰ��ܼ�
	int number; // �ϰ��ܼ�
	System.out.printf("=== �w����{�j�Y�p�Y��l�C�� ===\n"); 
	System.out.printf("��J�m�W���Y��l (Enter ����) =>"); 
	name = keyin.nextLine();
	while(name.length() !=0) 
	{
		game(name);
		System.out.printf("����� %s ���� %d �I\n", maxName,maxNum);
		System.out.printf("��J�m�W���Y��l (Enter ����) =>");
		name = keyin.nextLine();
	}
	System.out.printf("Ĺ�a %s �����Y�X %d\n", maxName, maxNum); 
	System.out.printf("��a %s �����Y�X %d\n", minName, minNum);
	}
	/* game ��k�}�l */
	static void game(String name) {
	Random random = new Random();// �ϰ쪫��
	int ran, sum=0; // �ϰ��ܼ� 
	System.out.printf("\t�z�Y�X => ");
	for (int k=1; k<=3; k++) {
	ran= 1 + random.nextInt(6);
	System.out.printf("%d ",ran);
	sum = sum + ran;
	}
	System.out.printf("�X�p = %d\n", sum); if (sum > maxNum) {
		maxName = name;
		maxNum = sum; 
	}
	if(sum <= minNum) 
	{ 
		minName = name; 
		minNum = sum;
	} 
	}

}
