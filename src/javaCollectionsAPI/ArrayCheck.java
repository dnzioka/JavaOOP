package javaCollectionsAPI;

public class ArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"Mzungu","Mkenya", "Mjaluo", "Mkamba","Mkisii","Mkikuyu"};
		// check if mkisii name is available in the above array
		
		String name = "Mkisii";
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == name) {
				System.out.println("yes");
				break;
			}else {
				System.out.println("No");
			}
		}

	}

}
