package learning;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList can hold dynamic items and its not fixed
		ArrayList<String> a = new ArrayList<String>();
		a.add("Dominic");
		a.add("Rahul");
		a.add("Selenium");
		a.add("Webdriver");
		// a.remove(2);
		// extract/access the values
		// a.get(1);
		System.out.println(a.get(2));
	

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));

		}
		
		for (String val : a) {
			System.out.println(val);
		}
		// item is present in the ArrayList
		
		System.out.println(a.contains("Selenium"));
		
		
		
	

		
		
	}

}
