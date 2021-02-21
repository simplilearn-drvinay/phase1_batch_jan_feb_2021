package linkedlist_eg;

public class LinkedList {

	private Node head;
	class Node {
		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			this.next=null;
		}
	}

	
	
	
	public void insert(int data) {
		Node node=new Node(data);
		node.next=null;
		if(this.head==null) {
			//System.out.println("if");
			this.head=node;
		}else {
		//	System.out.println("else");
			Node findLast=this.head;
			while(findLast.next!=null) {
			//	System.out.println("loop");
				findLast=findLast.next;
			}
			findLast.next=node;
		}
		
	}
	
	public void printList() {
		System.out.println("Contents of your linkedlist is ");
		Node findLast=this.head;
	//	System.out.println("list.head - "+list.head.next.data);
		while(findLast.next!=null) {
			System.out.println(findLast.data);
			findLast=findLast.next;
		}
	}
}
