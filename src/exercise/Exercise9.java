package exercise;

public class Exercise9 {

	public static void main(String[] args) {
		System.out.println("The pattern is:");
		System.out.println("3");
		System.out.println("6 9");
		System.out.println("12 15 18");
		System.out.println("The solution using Loops is:");
		int k =3;
		int l=1;
		for (int i=1; i<4; i++) {
			//System.out.println("outer");
			for (int j=0; j<i; j++) {
				int m = k * l;
				System.out.print(m);
				System.out.print(" ");
				l++;
				
			}
			System.out.println("");
		}

	}

}
