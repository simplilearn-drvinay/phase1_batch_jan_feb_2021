package eg2;

public class Player {
	
	private int id;
	private String name;
	private String sportName;
	private String countryName;
	private Address address; //has-a
	
	public Player(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public Player(int id,String name,String sportName,String countryName) {
		this(id,name);  //constructor chaining
		this.sportName=sportName;
		this.countryName=countryName;
	}
	
	
	
	public Player(int id, String name, String sportName, String countryName, Address address) {
		this(id,name,sportName,countryName);
		this.address = address;
	}
	
	public void setAddress(Address address) {
		this.address=address;
	}

	public void printPlayer() {
		System.out.println("Player Id : "+id);
		System.out.println("Player Name : "+name);
		System.out.println("Player SportName : "+sportName);
		System.out.println("Player's Address details ->");
		if(address!=null) {
		address.printAddress();
		}else {
			System.out.println("Player is yet to update address details");
		}
		System.out.println("Player Country Name : "+countryName);
	}

}
