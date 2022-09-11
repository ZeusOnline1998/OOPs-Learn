interface calc{
	public void add(int a, int b);
}


public class lambda {

	public static void main(String[] args) {
		
		
		calc l = (a,b) -> {
			System.out.println(a+b);
			
		};
		
		l.add(1,2);
		
	}

}
