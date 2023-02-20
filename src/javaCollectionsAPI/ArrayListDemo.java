package javaCollectionsAPI;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Welcome to Java collection API");
		a.add("Selenium");
		a.add("Java");
		a.add("WebDriver");
		a.add("Driver");
		a.add("ActionsClass");
		a.add("Java");
		System.out.println(a);
		a.add(0, "Rahul Shetty"); // add at specific index
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
		System.out.println(a.get(4));
		System.out.println(a.get(5));
		System.out.println(a.contains("true"));
		System.out.println(a.indexOf("Java"));
		System.out.println(a.contains("ActionsClass"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	
		
		

	}

}
