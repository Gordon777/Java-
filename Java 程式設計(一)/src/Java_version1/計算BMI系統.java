package Java_version1;
import java.util.*;

public class �p��BMI�t�� {
	public static void main(String args[]) {
		Scanner keyin = new Scanner(System.in);
		final double base=18.0, height=24.0;
		double toll, weight, bmi;
		
		System.out.printf("== �w��ϥ� BMI �����t��(18 ~ 24) ==\n");
		System.out.printf("�п�J�Ȥᨭ��(����) =>");
		toll = keyin.nextDouble() / 100;
		System.out.printf("�п�J�Ȥ��魫(����) =>");
		weight = keyin.nextDouble();
		bmi = weight / (toll * toll);
		
		System.out.printf("\n�Ȥ� BMI �� = %.4f\n", bmi);
		if (bmi <= base)
			System.out.printf("�z�����ӽG�F, �ݭn�W�D\n");
		else if (bmi >= height)
			System.out.printf("�z�����ӭD�F, �ݭn�\n");
		else
			System.out.printf("���߱z���@�Ӱ������\n");
		System.out.printf("== �t�ε���, �w��A�����{ ==\n");
		
	}

}
