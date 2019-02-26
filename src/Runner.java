public class Runner implements Runnable 
{
	public static void main(String[] args)
	{
		new Thread(new Runner("Runner1")).start();
		new Thread(new Runner("Runner2")).start();
	}
	private String name;
	public Runner(String name)
	{
		this.name = name;
	}
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		message("Hello.");
		message("Goodbye");
	}
	private synchronized void message(String n)
	{
		System.out.print(name + " - " + n + " \n");
	}
}