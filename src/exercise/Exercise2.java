package exercise;


public class Exercise2 {

	public static void main(String[] args) {
		// print this number in this pattern using Loops
		System.out.println("The pattern is:");
		System.out.println("1");
		System.out.println("2 3");
		System.out.println("4 5 6");
		System.out.println("7 8 9 10");
		System.out.println("The solution using Loops is:"); 
		
		int k =1;
		
		for (int i=0; i<4; i++) {
			//System.out.println("outer");
			
			for (int j=1; j<=k; j++) {
				System.out.print(k);
				System.out.print(" ");
				
				//System.out.print("\t");
			}
			System.out.println("");
			k++;
			
		}

	}

}
