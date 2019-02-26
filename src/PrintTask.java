import java.util.Random;

public class PrintTask implements Runnable {

	private int sleepTime;
	private String threadName;
	private Thread thread;
	private static Random generator = new Random();
	
	public PrintTask(String thName)
	{
		threadName = thName;
		sleepTime  = generator.nextInt(5000);
		thread     = new Thread(this, thName);
		thread.start();
	}
	
	@Override
	public void run()
	{
		try
		{
			System.out.printf(threadName + " Sleeped for " + sleepTime + " Milliseconds " + "\n");
			thread.sleep(sleepTime);
		}
		catch(InterruptedException exception)
		{
			exception.printStackTrace();
		}
		System.out.printf(threadName + " Process finished" + "\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTask tsk1 = new PrintTask("Thread 1");
		PrintTask tsk2 = new PrintTask("Thread 2");
		PrintTask tsk3 = new PrintTask("Thread 3");
		System.out.println("Thread process begin");
	}

}
