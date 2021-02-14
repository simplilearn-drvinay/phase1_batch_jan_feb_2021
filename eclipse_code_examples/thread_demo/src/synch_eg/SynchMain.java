package synch_eg;

public class SynchMain {

	public static void main(String[] args) {
		
		new Pages("page1 of user1", "page2 of user1");
		new Pages("page1 of user2", "page2 of user2");
		new Pages("page1 of user3", "page2 of user3");
		new Pages("page1 of user4", "page2 of user4");
		new Pages("page1 of user5", "page2 of user5");
		new Pages("page1 of user6", "page2 of user6");

	}

}
//try with wait() notify() notifyAll()
//look up and give solution for producer consumer problem.