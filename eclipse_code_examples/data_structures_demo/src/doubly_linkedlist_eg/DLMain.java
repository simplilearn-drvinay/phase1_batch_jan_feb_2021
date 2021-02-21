package doubly_linkedlist_eg;

public class DLMain {

	public static void main(String[] args) {
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.insert(100);
		dl.insert(10);
		dl.insert(3000);
		dl.insert(1000);
		dl.insert(200);
		dl.insert(100);

		
		System.out.println("Printing DL");
		dl.printDoublyList();
	}

}
