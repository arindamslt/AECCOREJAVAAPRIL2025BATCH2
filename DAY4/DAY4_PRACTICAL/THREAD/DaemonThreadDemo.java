package THREAD;
class TestThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=400;i<=550;i++)
			{
				System.out.println("THREAD1:"+i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
class TestThread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=650;i<=800;i++)
			{
				System.out.println("THREAD2:"+i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
public class DaemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   TestThread ts=new TestThread();
   TestThread1 ts1=new TestThread1();
   ts.setDaemon(true);
   ts.start();
   ts1.start();
   try
   {
	   for(int i=1;i<=50;i++)
	   {
		   System.out.println("MAIN:"+i);
		   Thread.sleep(100);
	   }
	   
   }
   catch(InterruptedException ie)
   {
	   ie.printStackTrace();
   }
	}

}
