package Java_version1;
import java.lang.Math;

public class �j�ֳz�q���︹ {
	public static void main(String args[]) {
		int value, flag; // �H��������X
		int[] num = new int[6]; // �x�s������X
		int i=0;
		while (i < 6) {
		flag=0;
		value = 1 + (int)(Math.random()*46);
		for (int j=0; j<i; j++) { // �˵��w��X�����X
		if (value == num[j]) { // �O�_����
		flag = 1; // ���ƫh��󭫨�
		break;
			}
		}
		if (flag == 0) {
		num[i] = value; // �S���ƫh��J�}�C
		i = i+1;
			}
		}
		System.out.printf("���B���X�O: ");
		for (i=0; i<6; i++)
		System.out.printf("%d ", num[i]);
		System.out.printf("\n");
		}
	}