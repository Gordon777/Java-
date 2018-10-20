package Java_version1;

public class 印出二維陣列內容 {
	public static void main(String args[]) {
		int score[][]={{1, 2, 3},
				{4, 5, 6},
				{7, 8, 8},
				{10, 11, 12}};
			int x; // ⾏指標 (外迴圈)
			int y; // 列指標 (內迴圈)
			for(x=0; x<score.length; x++) {
			for(y=0; y<score[x].length; y++)
			System.out.printf("\t%2d", score[x][y]);
			System.out.printf("\n");
			}
		}
	}
