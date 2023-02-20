package exercise;

public class DimensionalArraymin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 4 5
		// 3 4 7
		// 1 2 9
		// Print minimum number form the above Matrix
		System.out.println("Given the below Matrix:");
		int a[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };
		int minNum = a[0][0];

		for (int i = 0; i < 3; i++) {
			// System.out.println("row");
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("Print minimum number: Solution");
		for (int i = 0; i < 3; i++) {
			// System.out.println("row");
			for (int j = 0; j < 3; j++) {
				int k = a[i][j];
				if (k < minNum) {
					minNum = k;
					break;
				}
			}
		}
		System.out.println(minNum);

	}

}
