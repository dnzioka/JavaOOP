package javaCollectionsAPI;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set does not accept duplicate values
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("Kenya");
		hs.add("India");
		hs.add("Tanzaia");
		hs.add("Uganda");
		hs.add("Mawe");
		hs.add("Turkey");
		hs.add("UK"); //reject
		System.out.println(hs);
		System.out.println(hs.contains("UK"));
		System.out.println(hs.size());
		
		//iterator = traverse thru every item on the set
		Iterator <String> i= hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		
		

	}

}
