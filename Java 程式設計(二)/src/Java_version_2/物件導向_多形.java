package Java_version_2;

//Arith.java
class Arith {
static int Add(int x, int y) {
System.out.printf("俱计 + 俱计 = 俱计\n");
return (x+y);
}
static double Add(double x, int y) {
System.out.printf("疊翴计 + 俱计 = 疊翴计\n");
return (x+y);
}
static double Add(int x, double y) {
System.out.printf("俱计 + 疊翴计 = 疊翴计\n");
return (x+y);
}
static double Add(double x, double y) {
System.out.printf("疊翴计 + 疊翴计 = 疊翴计\n");
return (x+y);
}
}

/* Arith.class 惠ヘ魁 */
public class ン旧_ {
	public static void main(String args[]) {
	int a=5;
			double b=2.9;
			System.out.printf("\tArith.Add(5, 5) = %d\n", Arith.Add(a, a));
			System.out.printf("\tArith.Add(2.9, 5) = %.2f\n", Arith.Add(b, a));
			System.out.printf("\tArith.Add(5, 2.9) = %.2f\n", Arith.Add(a, b));
			System.out.printf("\tArith.Add(2.9, 2.9) = %.2f\n", Arith.Add(b, b));
			}
			}
