package Java_version1;

public class �L�X�G���}�C����}�C {
	public static void main(String args[]) {
		int score[][] = {{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}};
		System.out.printf("�C�L��}�C�p�U�G\n");
		for(int i=0; i<score.length; i++){
		for(int j=0; j<score[i].length; j++)
		System.out.printf("\t%2d", score[i][j]);
		System.out.printf("\n");
		}
		System.out.printf("\n�C�L�ಾ�}�C�p�U�G\n");
		for(int i=0; i<score.length; i++){
		for(int j=0; j<score[i].length; j++)
		System.out.printf("\t%2d", score[j][i]);
		System.out.printf("\n");
		}
	}	
		
}
