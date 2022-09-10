
public class AbstractLearn2 {

	public static void main(String[] args) {
		
		MiPhone mi = new MiPhone();
		Iphone ip = new Iphone();
		
		show(mi);
		show(ip);

	}

	public static void show(Phone obj) {
		obj.showConfig();
	}
}


abstract class Phone{
	
	public abstract void showConfig();
}

class MiPhone extends Phone{
	
	public void showConfig() {
		System.out.println("MIUI, Android");
	}
}


class Iphone extends Phone{
	
	public void showConfig() {
		System.out.println("IOS, Apple");
	}
}