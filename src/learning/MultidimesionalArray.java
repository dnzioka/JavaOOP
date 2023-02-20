package learning;

public class MultidimesionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 3 5
		// 3 4 7
		// 5 2 1
		// the above is a two-dimensional array e.i 3 rows and 3 columns
		// the two is index reference

		// a[row][column]

		int a[][] = { { 2, 3, 5 }, { 3, 4, 7 }, { 5, 2, 1 } };

		// to print 2 from the above
		System.out.println(a[2][1]);
		// to print 7 from the above
		System.out.println(a[1][2]);
		System.out.println("print entire matrix: Solution");
		//print entire matrix
		for (int i=0; i<3; i++) {
			//System.out.println("row");
			 for(int j=0; j<3; j++) {
				 System.out.print(a[i][j]);
				 System.out.print(" ");
				 
			 }
			 System.out.println("");
			
		}

	}

}
