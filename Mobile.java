package week1.day1;

//AccessSpecifier Class ClassName
public class Mobile {

	String mobileModel = "Samsung M21";
	float mobileWeight=1.234f;
	boolean isFullCharged =false;
	int mobileCost=30000;
			
	//AccessSpecifier returType methodName
	public void makeCall() {
		System.out.println("Make Call");
	}
	
	public void sendMsg() {
		System.out.println("Send Message");
	}
	
	public static void main(String[] args) {
		System.out.println("In Main Method");
		Mobile myMobile = new Mobile();
		System.out.println("Mobile Model: "+myMobile.mobileModel);
		System.out.println("Mobile Weight: "+myMobile.mobileWeight);
		System.out.println("Is Fully Charged: "+myMobile.isFullCharged);
		System.out.println("Mobile Cost: "+myMobile.mobileCost);
		myMobile.makeCall();
		myMobile.sendMsg();
	}
}

