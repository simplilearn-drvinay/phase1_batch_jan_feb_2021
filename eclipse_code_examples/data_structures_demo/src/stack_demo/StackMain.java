package stack_demo;

public class StackMain {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.pop();
		s.push("hello");
		s.push("hi");
		s.push("java");
		s.push("hello");
		s.push("jee");
		s.push("jee");
		s.push("jee");
		s.push("jee");
		s.push("jee");
		s.push("jee");
		s.push("jee");
		
		System.out.println("Contents of stack before peek");
		System.out.println(s);
		System.out.println("peek : "+s.peek());
		
		System.out.println("Contents of stack after peek");
		System.out.println(s);
		
		System.out.println("Contents of stack before pop");
		System.out.println(s);
		System.out.println("pop : "+s.pop());
		System.out.println("Contents of stack after pop");
		System.out.println(s);

	}

}

//Try Queue operations same as how we did the other datastructures without using any predefined classes
