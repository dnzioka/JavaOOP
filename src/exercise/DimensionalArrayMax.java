package exercise;

public class DimensionalArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 11, 2, 5 }, { 12, 13, 60 }, { 14, 345, 4 } };
		int maxNum = a[0][0];
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
			for (int j = 0; j < 3; j++) {
				int k = a[i][j];
				if (k > maxNum) {
					maxNum = k;

				}

			}
		}
		System.out.println(maxNum);

	}

}
