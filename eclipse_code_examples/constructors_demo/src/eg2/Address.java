package eg2;

public class Address {

	private int aid;
	private String streetName;
	private String cityName;
	private int zip;
	
	public Address(int aid, String streetName, String cityName, int zip) {
		this.aid = aid;
		this.streetName = streetName;
		this.cityName = cityName;
		this.zip = zip;
	}
	
	public void printAddress() {
		System.out.println("Aid : "+aid);
		System.out.println("StreetName : "+streetName);
		System.out.println("City Name : "+cityName);
		System.out.println("Zip : "+zip);
	}
	
	
}
