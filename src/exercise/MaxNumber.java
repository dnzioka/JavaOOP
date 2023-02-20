package exercise;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] myArray = {23, 92, 56, 39, 93};
		 int maxi = myArray[0]; // Assume its the largest number in the array
		 			       //5
		 for (int i=0; i<myArray.length; i++) {
			 if (maxi < myArray[i] ) {
				 maxi = myArray[i] ; 
			 }
			 
		 }
		 System.out.println("The maximum number in the above Array is:" + maxi);
		 
		 for (int j=0; j<myArray.length; j++) {
			 if (maxi > myArray[j] ) {
				 maxi = myArray[j] ; 
			 }
			 
		 }
		 System.out.println("The Minimum number in the above Array is:" + maxi);

	}

}
