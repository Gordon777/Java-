package Java_version1;

public class 印出數學成績單 {
	public static void main(String args[]) {
		int score[][] = {{492101, 80, 90, 78, 72, 0},
		{492102, 90, 67, 54, 46, 0},
		{492103, 71, 64, 83, 53, 0},
		{492104, 68, 89, 73, 73, 0},
		{492105, 56, 72, 53, 49, 0},
		{492106, 96, 65, 78, 83, 0},
		{492107, 49, 62, 91, 68, 0}};
		
		/* 計算每位學⽣的總平均分數 */
		for(int i=0; i<score.length; i++)
		score[i][5] = (score[i][1]+score[i][2]+score[i][3]+score[i][4])/4;
		
		/* 列印所有學⽣成績資料 */
		System.out.printf("學號 程式設計 資訊網路 資料處理 統計分析 總平均\n");
		for (int i=0; i<score.length; i++) {
		for(int j=0; j<score[i].length; j++)
		System.out.printf("%d \t", score[i][j]);
		System.out.printf("\n");
		}
	}
}
