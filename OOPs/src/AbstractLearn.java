


public class AbstractLearn {

	public static void main(String[] args) {
		
		Phone3 obj = new Phone3();
		
		obj.call();
		obj.sms();
		obj.browse();
		obj.email();
		
		
			
	}
	
}


abstract class Phone1{
	
	public void call() {
		System.out.println("Calling...");
	}
	
	public abstract void sms();
	public abstract void browse();
	public abstract void email();
	
}

abstract class Phone2 extends Phone1{
	
	public void sms() {
		System.out.println("Messaging...");
	}
	
	
}

class Phone3 extends Phone2{
	
	public void browse() {
		System.out.println("Browsing...");
	}
	
	public void email() {
		System.out.println("Emailing...");
	}
}







