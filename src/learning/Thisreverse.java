package learning;

public class Thisreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String school = "Welcome to Maseno University";
		String it = " ";
		for (int i=0; i<school.length(); i++) {
			 //System.out.print(school.charAt(i));
			 it = school.charAt(i) + it; //w 
			 //e 
		}{
		System.out.println(it);
		//System.out.println("******");
		
		for (int i=school.length()-1; i>=0; i--) {
			System.out.print(school.charAt(i));//em
		}
			
		}

	}

}
