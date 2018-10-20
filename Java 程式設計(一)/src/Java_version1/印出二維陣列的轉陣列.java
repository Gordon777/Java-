package Java_version1;

public class 印出二維陣列的轉陣列 {
	public static void main(String args[]) {
		int score[][] = {{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}};
		System.out.printf("列印原陣列如下：\n");
		for(int i=0; i<score.length; i++){
		for(int j=0; j<score[i].length; j++)
		System.out.printf("\t%2d", score[i][j]);
		System.out.printf("\n");
		}
		System.out.printf("\n列印轉移陣列如下：\n");
		for(int i=0; i<score.length; i++){
		for(int j=0; j<score[i].length; j++)
		System.out.printf("\t%2d", score[j][i]);
		System.out.printf("\n");
		}
	}	
		
}
