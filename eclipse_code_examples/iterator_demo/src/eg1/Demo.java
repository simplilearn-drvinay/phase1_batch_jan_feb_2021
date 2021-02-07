package eg1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {

	//Remove all the K,V pairs for whose key is multiples of 10 or whose value is null;
	public static void main(String[] args) {
		Map<Integer, String> hm=new HashMap<>();
		hm.put(100, "hhello");
		hm.put(100, "hello");
		hm.put(200, "hello");
		hm.put(90, "hello");
		hm.put(90, "hello");
		hm.put(500, "java");
		hm.put(450, null);
		hm.put(340, null);
		hm.put(45, "hello");
		hm.put(55, "hello");
		hm.put(700, null);
		hm.put(290, "jee");
		hm.put(291, "hibernate");
		System.out.println("map before remove : "+hm);
		
//		for(Entry<Integer, String> e:hm.entrySet()) {
//			if(e.getKey()%10==0 || e.getValue()==null) {
//				hm.remove(e.getKey());
//			}
//		}
		Iterator<Entry<Integer, String>> i=hm.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer, String> e=i.next(); //read and increment
			if(e.getKey()%10==0 || e.getValue()==null) {
				i.remove();
			}
		}
		
		
		System.out.println("map after remove : "+hm);
		//Enumerator (read) from top to bottom
		//Iterator (read as well as remove) from top to bottom
		//ListIterator(read,remove add) it is bidirectional but it is applicable only on List
	}

}
