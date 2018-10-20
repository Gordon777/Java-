package Java_version1;

public class 連續累乘程式 {
	public static void main(String args[]) {
		 int count, total;
		 total= 1;
		 for (count = 1;count <= 10; count++) {
			 total = total * count;
			 System.out.printf("total * %d = %d\n", count, total);	 
		 }
	}

}
