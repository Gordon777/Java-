package Java_version1;
import java.util.*;
public class �O���̪�30�Ѫ����L�� {
static double stock[]={78, 72, 61, 56, 87,
66, 74, 88, 76, 58,
65, 57, 90, 78, 67,
89, 56, 77, 56, 87,
67, 80, 77, 86, 67,
75, 86, 98, 88, 78};
public static void main(String args[]) {
	Scanner keyin = new Scanner(System.in);
	double cost;
	int select;
	disp_menu();
	select = keyin.nextInt();
	while(select != 3) {
	switch(select) {
	case 1:	
	disp_stock();
	break;
	case 2:
	System.out.printf("�еn����馬�L�ѻ� =>");
	cost = keyin.nextDouble();
	for (int i=(30-1); i>=1; i--)
	stock[i] = stock[i-1];
	stock[0] = cost;
	break;
	default:
	System.out.printf("��J���~ !! �Э��s��J\n");
	}
	disp_menu();
	select = keyin.nextInt();
		}
	}	
static void disp_menu() {
	System.out.printf("== �w����{ �Ѳ����դ��R�t�� ==\n");
	System.out.printf("(1) �C�L 30 ����v���L��\n");
	System.out.printf("(2) �n����馬�L��\n");
	System.out.printf("(3) ���}�t��\n");
	System.out.printf("\t �п�J�u�@�ﶵ =>");
}
static void disp_stock() { /* �C�L 30 �餺�ѻ� */
	System.out.printf("\n== �C�L�̪� 30 ��ѻ�==\n");
	for(int i=0; i<stock.length; i++) {
		System.out.printf("%.2f ", stock[i]);
		if((i+1) % 5 == 0)
			System.out.printf("\n"); //�C�L����, ����
	}
		System.out.printf("\n"); // �C�L����, ����
}
}
