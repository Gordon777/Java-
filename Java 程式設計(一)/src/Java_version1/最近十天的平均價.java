package Java_version1;

public class 最近十天的平均價 {
	public static void main(String args[]) {
	double course[]={78.8, 72.3, 61, 56, 87,66.3, 74.5, 88, 76, 58};
	double sum=0, ave;
	for(int i=0; i<course.length; i++) {
		System.out.printf("%.2f ", course[i]);
		sum = sum + course[i];}
		System.out.printf("\n");
		ave = sum /course.length;
		System.out.printf("最近 10 天的平均價 = %.2f", ave);
			
	}
		
}
