package learning;

public class StringRevers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalStr = "Welcome";
	    String reversedStr = "";
	    System.out.println("Original string: " + originalStr);
	        					//5
	    for (int i = 0; i < originalStr.length(); i++) {
	      reversedStr = originalStr.charAt(i) + reversedStr; // eH
	    }
	    
	    System.out.println("Reversed string: "+ reversedStr);
	  }

	}
