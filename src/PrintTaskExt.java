import java.util.Random;

public class PrintTaskExt extends Thread {
	private int sleepTime;
	private String threadName;
	private Thread thread;
	private static Random generator = new Random();

	public PrintTaskExt(String thName)
	{
		super(thName);
		threadName = thName;
		sleepTime = generator.nextInt(5000);
	}
	
	public void run()
	{
		try
		{
			System.out.printf(threadName + ", Sleeps for " + sleepTime + " Milliseconds." + "\n");
			thread.sleep(sleepTime);
		}
		catch(InterruptedException exception)
		{
			exception.printStackTrace();
		}
		System.out.printf(threadName + " has finished\n");
	}
	
	public static void main(String[] args)
	{
		new PrintTaskExt("Thread 1 .").start();
		new PrintTaskExt("Thread 2 ..").start();
		new PrintTaskExt("Thread 3 ...").start();
		System.out.println("Thread process begin.");
	}

}
