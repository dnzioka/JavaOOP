package learning;

public class Revers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "welcome home, Away from home";
						//3
		for (int i=name.length()-1; i>=0; i--){
		System.out.print(name.charAt(i));
		}
		System.out.println("");
		for (int i=0; i<name.length(); i++){
			System.out.print(name.charAt(i));
			}
		System.out.println("");
		 
		int j =name.length()-1;
		while (j>=0) {
			System.out.print(name.charAt(j));
			j--;
			
		}

	}

}
