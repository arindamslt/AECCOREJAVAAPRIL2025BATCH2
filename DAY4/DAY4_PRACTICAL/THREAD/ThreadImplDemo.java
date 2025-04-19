package THREAD;
class FstThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
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
class SndThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
		  for(int i=101;i<=200;i++)
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
public class ThreadImplDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //FstThread fs=new FstThread();
  //SndThread sd=new SndThread();
  //fs.start();
		Thread th1=new Thread(new FstThread());
		Thread th2=new Thread(new SndThread());
		th1.start();
		th2.start();
		try
	    {
	    	for(int i=201;i<=300;i++)
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
