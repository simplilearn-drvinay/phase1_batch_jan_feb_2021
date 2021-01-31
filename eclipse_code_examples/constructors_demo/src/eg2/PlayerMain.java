package eg2;

public class PlayerMain {

	public static void main(String[] args) {
		
		Player p1=new Player(100, "Sachin R Tendulkar");
		System.out.println("Printing p1");
		p1.printPlayer();
		

		Player p2=new Player(101, "Micheal Jordan");
		System.out.println("\nPrinting p2");
		p2.printPlayer();
		Address a1=new Address(7000, "XYZ Street", "Bangalore", 560006);
		
		Player p3=new Player(102, "Rahul Dravid", "Cricket", "INDIA");
		p3.setAddress(a1);
		System.out.println("\nPrinting p3");
		p3.printPlayer();
		
		Player p4=new Player(103, "Tiger Woods", "Golf", "USA");
		System.out.println("\nPrinting p4");
		p4.setAddress(new Address(7001, "Some Street", "Newyork", 200000));
		p4.printPlayer();
		
		
		Player p5=new Player(104, "Anil Kumble", "Cricket", "INDIA", a1);
		
		System.out.println("\nPrinting p5");
		p5.printPlayer();
		

	}

}
