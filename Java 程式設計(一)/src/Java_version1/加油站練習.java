package Java_version1;
import java.io.*;

public class �[�o���m�� {
	public static void main(String args[]) throws IOException {
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		final double price=28.5;       // �ܼƤ��e���i���
        double number, total;
        System.out.printf("�ثe 95 �L�]�T�o�C���� %.2f ��\n", price);
        System.out.printf("�п�J�[�o�ƶq =>");
        number = Double.parseDouble(keyin.readLine());
        total = number * price;
        System.out.printf("�������B = %.0f ��\n", total);   // �˱�p���I
		          }
}
