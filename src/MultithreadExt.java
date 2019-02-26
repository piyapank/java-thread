public class MultithreadExt extends Thread {
	private String threadName;
	private Thread thread;
	public MultithreadExt(String thName)
	{
		super(thName);
	}
	public void run()
	{
		for(int i = 0 ; i < 2; i++)
		{
			System.out.println(getName() + " ");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Startup Multithread!");
		new MultithreadExt("Thread1 .").start();
		new MultithreadExt("Thread2 ..").start();
		new MultithreadExt("Thread3 ...").start();
	}
}
