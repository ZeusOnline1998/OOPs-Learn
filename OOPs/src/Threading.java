class MyThread extends Thread{
	
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println("MyThread: "+i);		
	}
}


class YourThread implements Runnable{
	
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println("YourThread: "+i);		
	}
}


public class Threading {

	public static void main(String[] args) {
		MyThread m = new MyThread();
		
//		Runnable r = new YourThread();
//		Thread task = new Thread(new YourThread());
//		task.start();
		
		new Thread(new MyThread()).start();
//		
//		m.start();
//		try {
//			m.join();
//		}
//		catch (Exception e){
//			e.printStackTrace();
//		}
//		y.start();
//		for(int i=1;i<=10;i++)
//			System.out.println("Main: "+i);		
//		
		
	}

}
