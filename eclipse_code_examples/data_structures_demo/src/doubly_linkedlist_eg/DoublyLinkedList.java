package doubly_linkedlist_eg;



public class DoublyLinkedList {

	private Node head;
	private Node tail;
	class Node {
		Node previous;
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}
	
	public void insert(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=tail=newNode;
			head.previous=null;
			tail.next=null;
		}else {
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			tail.next=null;
				
		}
		
	}
	
	public void printDoublyList() {
		Node cuNode=head;
		while (cuNode!=null) {
			System.out.println(cuNode.data);
			cuNode=cuNode.next;
			
		}
	}

}
