package eg1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<>();
		hs.add("hey");
		hs.add("hey");
		hs.add("heloo");
		hs.add(null);
		hs.add(null);
		hs.add("hey");
		hs.add("java");
		hs.add("spring");
		hs.add("agile");
		hs.add("hibernate");
		hs.add("jdbc");
		System.out.println("hs : "+hs);
		
		
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("hey");
		lhs.add("hey");
		lhs.add("heloo");
		lhs.add(null);
		lhs.add(null);
		lhs.add("hey");
		lhs.add("java");
		lhs.add("spring");
		lhs.add("agile");
		lhs.add("hibernate");
		lhs.add("jdbc");
		System.out.println("lhs : "+lhs);
		
		//Set<String> ts=new TreeSet<>();//ascending
		Set<String> ts=new TreeSet<>(Collections.reverseOrder()); //descending
		ts.add("hey");
		ts.add("hey");
		ts.add("heloo");
		//ts.add(null);
		//ts.add(null);
		ts.add("hey");
		ts.add("java");
		ts.add("spring");
		ts.add("agile");
		ts.add("hibernate");
		ts.add("jdbc");
		System.out.println("ts : "+ts);
		
		System.out.println("ts.size() : "+ts.size());
		ts.remove("heloo");
		System.out.println("ts after remove(): "+ts);
		
		for(String vinay:ts) {
			System.out.println(vinay.toUpperCase());
		}
		
		int ar[]= {233,22,3,88,3,3,1616};
		for(int x:ar) {
			System.out.println(x);
		}
		
		System.out.println("ts.contains(\"java\") "+ts.contains("java"));
		System.out.println("ts.contains(\"jee\") "+ts.contains("jee"));
		
		System.out.println("\nIterating using iterator");
		Iterator<String> i=ts.iterator();
		while(i.hasNext()) {
			String t=i.next();
			System.out.println(t.toUpperCase());
		}

	}

} //try the with Queue ->LinkedList,PriorityQueue
