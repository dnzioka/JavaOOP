package learning;


public class enhancedForLoop {

	public static void main(String[] args) {
		//normal for loop
		String[] name = { "Dominic", "Malile", "Kenya" };

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		//simplified or enhanced for loop for the above
		
		for(String majina: name) {
			System.out.println(majina);
		}
		
		

	}

}
