package Multilevel;

class calculator implements sd{
	
	@Override
	public float add(float a, float b) {
		return a+b;
	}
	@Override
	public float sub(float a, float b) {
		return a-b;
	}
	@Override
	public float mul(float a, float b) {
		return a*b;
	}
	@Override
	public float div(float a, float b) {
		return a/b;
	}
	
}

class advanced extends calculator{
	
	public float mod(float a, float b) {
		return a%b;
	}
	public float sqr(float a) {
		return a*a;
	}
	public float sqrt(float a) {
		return (float)(Math.sqrt(a));
	}
	
}

class area extends advanced{
	
	public float square(float a) {
		return a*a;
	}
	public float rectangle(float a, float b) {
		return a*b;
	}
	public float circle(float r) {
		return (float)(3.14*r*r);
	}
	
}

public class calculation {
	
	public static void main(String[] args) {
		
		area cal = new area();
		float add = cal.add(1, 2);
		System.out.println(add);
		System.out.println((float)(cal.mod(7,2)));
		System.out.println(cal.circle(3));
	}
	

}
