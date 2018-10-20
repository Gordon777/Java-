package Java_version1;

import java.util.*;
public class 計算圓參數 {
        public static void main(String[] args) {
                Scanner keyin = new Scanner(System.in);
                final double Pi = 3.14;
                double radius, area, circum, volume;
                System.out.printf("圓參數計算工具\n");
                System.out.printf("請輸入圓的半徑 =>");
                radius = keyin.nextDouble();
                area = Pi * radius * radius;
                circum = 2 * Pi * radius;
                volume = 3.0/4.0 * Pi * radius * radius * radius;
                System.out.printf("圓半徑 = %.2f 的相關參數如下：\n", radius);
                System.out.printf("\t圓周長 = %.2f\n", circum);
                System.out.printf("\t圓面積 = %.2f\n", area);
                System.out.printf("\t圓體積 = %.2f\n", volume);
        }
}