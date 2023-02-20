package learning;


public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arrays can store multiple values in single variable
		// can be created into two ways

		/* Method One */

		// declare variable that can hold 5 values
		int[] myNumber = new int[5]; // store five int into the variable
		// initalize the array
		myNumber[0] = 10;
		myNumber[1] = 20;
		myNumber[2] = 30;
		myNumber[3] = 40;
		myNumber[4] = 50;

		/* Method Two */
		int[] myNumber2 = { 17, 2, 3, 4, 5, 11, 33, 44, 22, 12 };

		// to access
		// System.out.println(myNumber2[3]);

		System.out.println(myNumber.length); // size of the array (5)

		// iterate the array using For loop /* code to repeat */
		for (int i = 0; i < myNumber.length; i++) {

			// System.out.println(myNumber[i]);
		}

		for (int i = 0; i < myNumber2.length; i++) {
			System.out.println(myNumber2[i]);
		}

		String[] Names = { "Dominic", "Malile", "Kenya" };

		for (int i = 0; i < Names.length; i++) {
			System.out.println(Names[i]);
		}

	}

}
