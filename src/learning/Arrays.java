package learning;


public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays can store multiple values in single variable
		// can be created into two ways
		
		/*Method One*/
		
		//declare variable that can hold 5 values
		int [] myNumber = new int [5]; // store five int into the variable
		//initalize the array
		myNumber[0] = 1;
		myNumber[1] = 2;
		myNumber[2] = 3;
		myNumber[3] = 5;
		myNumber[4] = 5;
		
		/*Method Two*/
		int [] myNumber2 = {1,2,3,4,5};
	
		//to access 
		System.out.println(myNumber2[3]); 
		
		String [] Names= {"Dominic", "Malile", "Kenya"};
		
		for (int i=0; i<Names.length; i++) {
			System.out.println(Names[i]);
		}

	}

}
