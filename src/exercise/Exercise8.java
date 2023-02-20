package exercise;

public class Exercise8 {

	public static void main(String[] args) {
		// print this number in this pattern using Loops
		System.out.println("The pattern is:");
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("The solution using Loops is:");
		for (int i=1; i<5; i++) {
			//System.out.println("outer");
			for (int j=1; j<=i; j++) {
				System.out.print(j);
				
			}
			System.out.println("");
			
		}

	}

}
