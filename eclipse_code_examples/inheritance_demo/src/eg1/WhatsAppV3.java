package eg1;

public class WhatsAppV3 extends WhatsAppV2 {

	public void voiceCall() {
		System.out.println("Voice call over internet from V3");
	}
	
	public void videoCall() {
		System.out.println("Video call from V3");
	}
	
	
	public WhatsAppV3() {
		System.out.println("V3 constructor");
	}
}
