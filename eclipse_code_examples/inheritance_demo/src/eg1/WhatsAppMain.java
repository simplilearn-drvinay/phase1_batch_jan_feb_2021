package eg1;

public class WhatsAppMain {

	public static void main(String[] args) {
		
		WhatsAppV3 v3=new WhatsAppV3();
		v3.groupMessage();
		v3.videoCall();
		v3.voiceCall();
		v3.voiceMessage();
		v3.message();
		System.out.println(v3.hashCode());
		System.out.println(v3.getClass());
	}

}
