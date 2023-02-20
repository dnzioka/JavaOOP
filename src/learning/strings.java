package learning;


public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string is an object
		//two ways of intializing a string -> String literal
		
		String n = "Rahul shetty Academy";
		String n1 = "Rahul shetty Academy"; // reference the string created above if the string has similar characters
		
		//new keyword
		
		String n2 = new String ("welcome"); //creates two memory spaces
		String n3 = new String ("welcome");
		
		//String Methods
		String watu = "Rahul shetty Academy";
		String [] splittedString = watu.split(" ");
		for(String Rist  :splittedString)
		System.out.println(Rist);
		System.out.println("*****");
		
		String [] half = watu.split("shetty");
		System.out.println(half[0]);
		System.out.println(half[1]);
		System.out.println(half[1].trim());
		System.out.println("******");
		
		//print character by character
		for (int i=0;i<watu.length(); i++) {
			 System.out.println(watu.charAt(i));
		}
		//print the characters in reverse order
		System.out.println("******");
		for (int i=watu.length()-1; i>=0; i--) {
			System.out.println(watu.charAt(i));
		
		}

	}

}
