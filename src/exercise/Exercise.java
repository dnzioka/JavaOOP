package exercise;


public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print this number in this pattern using Loops
		//1 2 3 4
		//5 6 7
		//8 9
		//10
		System.out.println("The pattern is:");
		System.out.println("1 2 3 4");
		System.out.println("5 6 7");
		System.out.println("8 9");
		System.out.println("10");
		
		System.out.println("The solution using Loops is:");
		
		int k =1;
		
		for (int i=0; i<4; i++) {
			//System.out.println("outer");
			for (int j=1; j<=4-i; j++) {
				System.out.print(k);
				System.out.print(" "); //space btwn "\t"
				k++;	
			}
			System.out.println("");
		}
		

	}

}
