package Java_version1;
import java.util.*;

public class �����U�ڸպ�t�� {
	public static void main(String args[]) {
		/* �ŧi��������P�ܼ� */
		Scanner keyin = new Scanner(System.in);
		final int limit = 240; //�̰�����
		double credit; // �U���B��(�U)
		double pay; // �C���u�٪��B(�U)
		double rate;// �~�Q�v
		int count=0; // �֭pú�Ǵ���
		double balance;// �ثe�U�ھl�B
		/* Ū���Ȥ��J��� */
		System.out.printf("== �w����{���N�Ȧ�U�ڸպ�t�� ==\n");
		System.out.printf("�п�J�U�ڪ��B (�U) =>");
		credit = keyin.nextDouble();
		System.out.printf("�п�J�~�Q�v (�p0.04) =>");
		rate = keyin.nextDouble();
		System.out.printf("����C���ٴ��B�� (�U) =>");
		pay = keyin.nextDouble();
		/* �p���ٴڴ��� */
		balance = credit;
		do {
			balance = balance + (balance*rate)/12;
			balance = balance - pay;
			count = count + 1;	
			}while(balance > 0);
		System.out.printf("�z�ݭn %d ��(��) �~�i�ٴڧ���\n", count-1);
		if (count > limit)
			System.out.printf("�W�L���� %d �Хt��U���B��\n", limit);
		else
			System.out.printf("�����@�N�Ӱ�, �w�ﬢ�ߦ��\n");	

	}
	

}
