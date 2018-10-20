package Java_version1;

public class 連續累加程式 {
	public static void main(String args[]) {
		 int count, sum;
		 sum = 0; 
		 for (count = 1;count <= 10; count++) {
			 sum = sum + count; 
		 }
		 System.out.printf("1 + 2 + .. + 10 = %d\n", sum); 
	}

}
