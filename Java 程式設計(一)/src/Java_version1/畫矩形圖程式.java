package Java_version1;
import java.util.*;

public class �e�x�ιϵ{�� {
	public static void main(String args[]) {
	/* �ŧi��������P�ܼ� */
	Scanner keyin = new Scanner(System.in);
	int height;
	int wide;
	// �x�Ϊ����� // �x�Ϊ��e��
	/* �n�D��J�x�ΰ��P�e */ 
	System.out.printf("�п�J�x�ΰ��� =>");
	height = keyin.nextInt(); 
	System.out.printf("�п�J�x�μe�� =>"); 
	wide = keyin.nextInt();
	/* ø�s�x�ιϧ� */
	for(int i=1; i<=height; i++) {
	System.out.printf(" "); for(int j=1; j<=wide; j++) {
	System.out.printf("*"); 
	}
	System.out.printf("\n"); 
	}
	}
	}
	


