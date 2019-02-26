
public class Multithread1 implements Runnable {
	private String threadName;
	private Thread thread;
	public Multithread1 (String thName)
	{
		threadName = thName;
		thread = new Thread(this, thName);
		thread.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 2; i ++)
		{
			System.out.println("Thread : " + threadName);;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Startup Multithread!");
		Multithread1 th1 = new Multithread1("Thread1 is started.");
		Multithread1 th2 = new Multithread1("Thread2 is started.");
		Multithread1 th3 = new Multithread1("Thread3 is started.");
	}

}
