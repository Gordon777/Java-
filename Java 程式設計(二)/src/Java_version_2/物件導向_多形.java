package Java_version_2;

//Arith.java
class Arith {
static int Add(int x, int y) {
System.out.printf("��� + ��� = ���\n");
return (x+y);
}
static double Add(double x, int y) {
System.out.printf("�B�I�� + ��� = �B�I��\n");
return (x+y);
}
static double Add(int x, double y) {
System.out.printf("��� + �B�I�� = �B�I��\n");
return (x+y);
}
static double Add(double x, double y) {
System.out.printf("�B�I�� + �B�I�� = �B�I��\n");
return (x+y);
}
}

/* Arith.class �ݩ�P�ؿ��U */
public class ����ɦV_�h�� {
	public static void main(String args[]) {
	int a=5;
			double b=2.9;
			System.out.printf("\tArith.Add(5, 5) = %d\n", Arith.Add(a, a));
			System.out.printf("\tArith.Add(2.9, 5) = %.2f\n", Arith.Add(b, a));
			System.out.printf("\tArith.Add(5, 2.9) = %.2f\n", Arith.Add(a, b));
			System.out.printf("\tArith.Add(2.9, 2.9) = %.2f\n", Arith.Add(b, b));
			}
			}
