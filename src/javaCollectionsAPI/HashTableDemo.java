package javaCollectionsAPI;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(0, "Dominic Malile");
		hm.put(1, "Soon you will be decome a Junior Dev");
		hm.put(2, "Amen");
		hm.put(3, "Good morning");
		//access the value
		System.out.println(hm.get(2));
		hm.remove(3);
		System.out.println(hm.get(3));
		Set sn =hm.entrySet();
		Iterator it = sn.iterator();
		
		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
