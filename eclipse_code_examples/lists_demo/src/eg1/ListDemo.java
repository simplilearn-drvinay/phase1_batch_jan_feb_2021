package eg1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
	
		LinkedList li=new LinkedList();
		li.add("hello");
		li.add(12222);
		li.add('c');
		li.add(true);
		li.add(22.222);
		li.add(1111221221);
		System.out.println(li);
		
		List<Integer> li2=new LinkedList<>();
		li2.add(1220);
		li2.add(1221);
		li2.add(1220);
		li2.add(1200);
		li2.add(200);
		li2.add(null);
		li2.add(44);
		li2.add(22);
		li2.add(null);
		li2.add(1220);
		li2.add(1220);
		li2.add(null); //insert at last
		System.out.println("li2 : "+li2);
		li2.add(1, 220); //insert at specific position
		System.out.println("li2 : "+li2);
		li2.set(1, 1000); //update
		System.out.println("li2 : "+li2);
		System.out.println("li2.size() : "+li2.size());
		System.out.println("li2.get(2) : "+li2.get(2));
		System.out.println("Accessing elements 1 by 1 using loop");
		for (int i = 0; i < li2.size(); i++) {
			System.out.print(li2.get(i)+" ");
		}
		li2.remove(1);//index
		System.out.println("\nli2 : "+li2);
		Integer obj=1220;
		li2.remove(obj); //removes first occurance of this object in the List
		System.out.println("li2 : "+li2);
		while(li2.remove(obj)) {}  //remove all the occurance of that object from the List
		System.out.println("li2 : "+li2);
		
		
		Collections.reverse(li2);
		System.out.println("li2 : "+li2);
		Collections.replaceAll(li2, null, 0);
		System.out.println("li2 after replaceAll: "+li2);
		Collections.sort(li2); //ascending
		System.out.println("li2 after sort: "+li2);
		Collections.sort(li2, Collections.reverseOrder()); //descending
		System.out.println("li2 after sort in reverseOrder: "+li2);
		Collections.shuffle(li2);
		System.out.println("li2 after shuffle: "+li2);
		Collections.sort(li2);
		System.out.println("sort "+li2);
		System.out.println("Collections.binarySearch(li2, 44): "+Collections.binarySearch(li2, 44));
		System.out.println("Collections.binarySearch(li2,144): "+Collections.binarySearch(li2, 144));
		

	}

}
