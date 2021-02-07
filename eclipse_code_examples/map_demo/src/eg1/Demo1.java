package eg1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
		
		Map<Integer, String> hm=new HashMap<>();
		//put does insert as well as update-> if key is unique it will insert and if key is already existing it will update.
		hm.put(100, "hhello");
		hm.put(100, "hello");
		hm.put(200, "hello");
		hm.put(90, "hello");
		hm.put(90, "hello");
		hm.put(500, "java");
		hm.put(450, null);
		hm.put(340, null);
		hm.put(null, "hello");
		hm.put(null, "hello");
		hm.put(700, null);
		hm.put(290, "jee");
		hm.put(291, "hibernate");
		System.out.println("hm : "+hm);
		
		Map<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(100, "hhello");
		lhm.put(100, "hello");
		lhm.put(200, "hello");
		lhm.put(90, "hello");
		lhm.put(90, "hello");
		lhm.put(500, "java");
		lhm.put(450, null);
		lhm.put(340, null);
		lhm.put(null, "hello");
		lhm.put(null, "hello");
		lhm.put(700, null);
		lhm.put(290, "jee");
		lhm.put(291, "hibernate");
		System.out.println("lhm : "+lhm);
		
		//Map<Integer, String> tm=new TreeMap<>(); //ascending by key
		Map<Integer, String> tm=new TreeMap<>(Collections.reverseOrder()); //descending
		tm.put(100, "hhello");
		tm.put(100, "hello");
		tm.put(200, "hello");
		tm.put(90, "hello");
		tm.put(90, "hello");
		tm.put(500, "java");
		tm.put(450, null);
		tm.put(340, null);
		//tm.put(null, "hello");
		//tm.put(null, "hello");
		tm.put(700, null);
		tm.put(290, "jee");
		tm.put(291, "hibernate");
		System.out.println("tm : "+tm);
		
		Map<Integer, String> ht=new Hashtable<>();
		ht.put(100, "hhello");
		ht.put(100, "hello");
		ht.put(200, "hello");
		ht.put(90, "hello");
		ht.put(90, "hello");
		ht.put(500, "java");
	//	ht.put(450, null);
	//	ht.put(340, null);
	//	ht.put(null, "hello");
	//	ht.put(null, "hello");
	//	ht.put(700, null);
		ht.put(290, "jee");
		ht.put(291, "hibernate");
		System.out.println("ht : "+ht);
		System.out.println("ht.size() : "+ht.size());
		System.out.println("ht.get(100) : "+ht.get(100));
		System.out.println("ht.get(101) : "+ht.get(101));
		ht.remove(100);
		System.out.println("ht : "+ht);
		
		
		System.out.println("ht.containsKey(120) : "+ht.containsKey(120));
		System.out.println("ht.containsKey(290) : "+ht.containsKey(290));
		
		System.out.println("ht.containsValue(\"jee\") : "+ht.containsValue("jee"));
		System.out.println("ht.containsValue(\"spring\") : "+ht.containsValue("spring"));
		
		System.out.println("ht.keySet() : "+ht.keySet());
		System.out.println("ht.values() : "+ht.values());
		
		Set<Integer> set=ht.keySet();
		System.out.println("\nIterating using keySet()");
		for(Integer i:set) {
			System.out.println("key is "+i+"  Value is "+ht.get(i));
		}
		
		System.out.println("\nIterating using entrySet()");
		for(Entry<Integer, String> e:ht.entrySet()) {
			System.out.println("Key -> "+e.getKey()+" value -> "+e.getValue());
		}

	}

}
