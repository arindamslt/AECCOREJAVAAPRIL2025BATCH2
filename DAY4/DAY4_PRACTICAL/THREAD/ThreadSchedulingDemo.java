package THREAD;
class FThread extends Thread
{
	public void run() 
	{
		
		for(int i=1;i<=100;i++)
		{
			System.out.println("THREAD1:"+i);
			
		}
		
	}
}
class SThread extends Thread

{
	public void run()
	{
		
		for(int i=101;i<=200;i++)
		{
			System.out.println("THREAD2:"+i);
			
		}
		
	}
	
}
public class ThreadSchedulingDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
  FThread ft=new FThread();
  SThread sd=new SThread();
  ft.setPriority(10);
  sd.setPriority(1);
  ft.start();
  sd.start();
	}

}
