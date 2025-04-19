package THREAD;
class FirstThread extends Thread
{
	public void run()
	{
		try
		{
		  for(int i=1;i<=100;i++)
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
class SecondThread extends Thread
{
	public void run()
	{
		try
		{
		  for(int i=101;i<=175;i++)
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
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   FirstThread ft=new FirstThread();//READY STAGE
   SecondThread sd=new SecondThread();//READY STAGE
   ft.start();
   sd.start();
    try
    {
    	for(int i=176;i<=225;i++)
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
