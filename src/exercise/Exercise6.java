package exercise;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print this number in this pattern using Loops
		System.out.println("The pattern is:");
		System.out.println("1 2 3 4");
		System.out.println("5 6 7");
		System.out.println("8 9");
		System.out.println("10");
		System.out.println("The solution using Loops is:");
		int k = 1;
		for (int i=1; i<5; i++) {
			//System.out.println("outer");
			for (int j=0; j<=4-i; j++) {
				System.out.print(k);
				System.out.print(" ");
				k++;
				
			}
			System.out.println("");
		}

	}

}
