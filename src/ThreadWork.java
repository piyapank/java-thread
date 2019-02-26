public class ThreadWork 
{
	public static void main(String args[])
	{
		ThreadRun thread1, thread2, thread3, thread4;
		thread1  = new ThreadRun("Thread1 Running.");
		thread2  = new ThreadRun("Thread2 Running.");
		thread3  = new ThreadRun("Thread3 Running.");
		thread4  = new ThreadRun("Thread4 Running.");
		System.err.println("\nStarting threads");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		System.err.println("Threads started\n");
	}
}

class ThreadRun extends Thread
{
	private int sleepTime;
	public ThreadRun(String name)
	{
		super(name);
		sleepTime = (int) ( Math.random() * 5000 );
		System.err.println( "Name: " + name + "; sleep: " + sleepTime );
	}
	public void run()
	{
		try
		{
			System.err.println(getName() + " is sleeping");
			Thread.sleep(sleepTime);
		}
		catch( InterruptedException exception )
		{
			System.err.println( exception.toString() );
		}
		System.err.println(getName() + " done sleeping. ");
	}
}