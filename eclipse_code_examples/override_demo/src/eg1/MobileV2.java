package eg1;

public class MobileV2 extends MobileV1 {

	public void gaming() {
		System.out.println("Gaming feature from V2");
	}

	public void browsing() {
		System.out.println("Browsing from V2");
	}

	public void camera() {
		System.out.println("Click photos and record videos using camera from V2");
	}
	@Override
	  void displayMenu() {
	System.out.println("Menu in V2 updated to GRID view");	
	}
}

//public->protected->default->private

//private final static cannot be overridden