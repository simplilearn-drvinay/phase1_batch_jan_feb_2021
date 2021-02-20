package eg2;

public class PlayerMain {

	public static void main(String[] args) {
	
		Player p1=new Player(100, "Sachin");
		System.out.println("p1 -> "+p1);
		Player p2=new Player(105, "Sachin");
		System.out.println("p2 -> "+p2);
		
		if(p1.equals(p2)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}

	}

}
