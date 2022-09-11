class overri{
	
	public void meth(String s) {
		System.out.println(s+" in overriden method");
	}
}


public class overload extends overri{

	@Override
	public void meth(String s) {
		
		System.out.println(s);
		super.meth(s);
	}
	
	public void meth(int a, int b) {
		System.out.println(a+b);
		
	}
	
	public void meth(int a, int b, int c) {
		System.out.println(a-b+c);
	}
	
	public static void main(String[] args) {
		
		overload o = new overload();
		
		o.meth("Amit");
		o.meth(2,3);
		o.meth(3,4,5);
		
		
	}
}
