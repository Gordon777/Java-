package Java_version1;

import java.util.*;
public class �p���Ѽ� {
        public static void main(String[] args) {
                Scanner keyin = new Scanner(System.in);
                final double Pi = 3.14;
                double radius, area, circum, volume;
                System.out.printf("��Ѽƭp��u��\n");
                System.out.printf("�п�J�ꪺ�b�| =>");
                radius = keyin.nextDouble();
                area = Pi * radius * radius;
                circum = 2 * Pi * radius;
                volume = 3.0/4.0 * Pi * radius * radius * radius;
                System.out.printf("��b�| = %.2f �������ѼƦp�U�G\n", radius);
                System.out.printf("\t��P�� = %.2f\n", circum);
                System.out.printf("\t�ꭱ�n = %.2f\n", area);
                System.out.printf("\t����n = %.2f\n", volume);
        }
}