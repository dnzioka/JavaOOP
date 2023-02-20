package learning;


public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myNumber= { 17, 2, 3, 4, 5, 11, 33, 44, 22, 12 };
		//Task 1: print multiples of 2 from the above array
		//2,4,44,22,12
		for (int num : myNumber) {
			if(num%2 ==0) {
				System.out.println(num);
				break;
			}
			else {
				System.out.println(num + " " + "is not multiple of 2");
			}
		}
		
		//Task 2: check if the above array has multiple of 2
		// use break to avoid further check
		
	
	}

}
