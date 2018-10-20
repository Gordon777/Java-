package Java_version1;

public class 印出股票歷史價 {
	public static void main(String args[]) {
		double course[]={78.8, 72.3, 61, 56, 87, 66.3, 74.5, 88, 76, 58};
		/* 由 course[0]~ course[course.length­1] 列印陣列 */ 
		for(int i=0; i<course.length; i++)
		System.out.printf("%.2f ", course[i]);
		System.out.printf("\t"); // 列印完畢, 換行

}
}
