package learning;


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Welcome";
		//reverse the string
		String newName = "";
		
		
		for (int i=name.length()-1; i>=0; i--) {
			
			newName = newName + name.charAt(i);
			//System.out.println("The reversed characters is:");
			//System.out.print(name.charAt(i));
			//System.out.println("Reversed string: " + newName);
			
		}
		//System.out.println("*******");
		System.out.println("Original string: " + name);
		//System.out.println("*******");
		System.out.println("Reversed string: " + newName); 
		//gnimmargorP avaJ ot emocleW

	}

}
