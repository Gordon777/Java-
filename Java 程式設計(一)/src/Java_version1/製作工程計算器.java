package Java_version1;
import java.lang.*; // �ɤJ�l�M�� (�]�t Math���O)
import java.util.Scanner;//�ɤJ�M�󤺪����O

public class �s�@�u�{�p�⾹ {
	public static void main(String args[]) {
		/* �Q�ήM�����O java.util.Sacnner ���ͪ��� keyin */ 
		Scanner keyin = new Scanner(System.in);
		double value, ans=0;
		int select;
		disp_men();
		/* �I�s�ޥ� keyin �������k nextInt() */ 
		select = keyin.nextInt();
		while( select != 7) {
		System.out.printf("��J�@�Ӽƭ� (�`�N�T����ƽd��) =>");
		/* �I�s keyin ��nextDouble �����k */ value = keyin.nextDouble(); switch(select) {
		case 1:
		/* �����ޥ����O Math �����O��k */
		ans = Math.log(value); 
		System.out.printf("log(%.2f) = %.2f\n", value, ans); 
		break;
		case 2:
		/* �����ޥ����O Math �����O��k */
		ans = Math.log10(value); 
		System.out.printf("log10(%.2f) = %.2f\n", value, ans); 
		break;
		case 3:
		/* �����ޥ����O Math �����O��k */
		ans = Math.sqrt(value); 
		System.out.printf("sqrt(%.2f) = %.2f\n", value, ans); 
		break;
		case 4:
		ans = Math.sin(value); 
		System.out.printf("sin(%.2f) = %.2f\n", value, ans); 
		break;
		case 5:
		ans = Math.cos(value); 
		System.out.printf("cos(%.2f) = %.2f\n", value, ans); 
		break;
		case 6:
		ans = Math.tan(value); 
		System.out.printf("tan(%.2f) = %.2f\n", value, ans); 
		break;
		default: 
		System.out.printf("���~��J \n");
		}
		disp_men();
		select = keyin.nextInt();
		}
		System.out.print("== ���¨ϥ� �w��A�ץ��{ ==\n"); 
		}
	
		static void disp_men() {
		System.out.printf("\n*** �u�{�p�⾹���Ѧ��U�C�\�� ***\n"); 
		System.out.printf("(1) log ���\t (2) log10() ���\n");
		System.out.printf("(3) sqrt ���\t (4) sin() ���\\n");
		System.out.printf("(5) cos ���\t (6) tan() ���\\n");
		System.out.printf("(7) ���}�t��\n"); 
		System.out.printf("�п�ܿ�J =>");
		} 
		}
