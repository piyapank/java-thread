import java.awt.Graphics;
import java.util.Date;
import java.applet.Applet;

public class ClockApp extends Applet implements Runnable 
{
	Thread clockThread;
	Date currentDate;
	public void start()
	{
		if(clockThread == null)
		{
			clockThread = new Thread(this, "Clock Application");
			clockThread.start();
		}
	}
	
	@SuppressWarnings("deprecation")
	public void stop()
	{
		if(clockThread != null)
		{
			clockThread.stop();
			clockThread = null;
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			currentDate = new Date();
			repaint();
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException exception)
			{
				exception.printStackTrace();
			}
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawString(currentDate.toGMTString(), 20, 50);
	}

}
