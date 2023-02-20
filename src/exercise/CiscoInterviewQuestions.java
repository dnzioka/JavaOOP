package exercise;

public class CiscoInterviewQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2 11 5
		   3 4 7
		   1 2 0
		*/
		// From the above matrix find the smallest number, and on that column find the largest number
		
		int [][] matrix = {{26, 61, 57}, {53, 45, 97}, {21, 125, 109}};
		int small = matrix[0][0];
		int mincol = 0;
		int k =0;
		int rowcol = 0;
		//int large = matrix [0][2];
		System.out.println("Given the below matrix:");
		for (int x =0; x<3; x++) {
			//System.out.println("row");
			for (int y =0; y<3; y++) {
				System.out.print(matrix[x][y]);
				System.out.print(" ");
			}
			System.out.println("");	
		}
		
		System.out.println("Find the smallest number:");
		
		for (int x =0; x<3; x++) {
			//System.out.println("row");
			for (int y =0; y<3; y++) {
				if (small > matrix[x][y]){
					small = matrix[x][y];
					mincol = y;
					rowcol = x;
					
				}	
			}
		}
		System.out.println("x:" +rowcol);
		System.out.println("y:" + mincol);
		
		System.out.println("Min number:" + small);
		
		System.out.println("Find the Largest number in the column that contains the smallest number in the matrix:");
		int max = matrix[rowcol][mincol];
		while (k<3) {
			if (matrix[k][mincol]> max) {
				max = matrix[k][mincol];		
			}
			k++;
		}
		System.out.println(max);
		
		
	}

}
