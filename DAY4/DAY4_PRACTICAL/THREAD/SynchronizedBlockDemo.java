package THREAD;
class Accounts
{
	double balance=15000.00;
	public  void debit(double amount)
	{
		for(int i=1;i<=50;i++)
		{
			try
			{
			System.out.println("DEBIT:"+i);
			Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		synchronized (this) {
			this.balance=this.balance-amount;
			System.out.println("AFTER DEBIT BALANCE:"+this.balance);
		}
		
		
	}
	public synchronized void credit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("AFTER CREDIT BALANCE:"+this.balance);
	}
}
class Customers1 extends Thread
{
	Accounts acc;
	public Customers1(Accounts acc)
	{
		this.acc=acc;
	}
	public void run()
	{
		acc.debit(9000.00);
		
	}
}
class Customers2 extends Thread
{
	Accounts acc;
	public Customers2(Accounts acc)
	{
		this.acc=acc;
	}
	public void run()
	{
		acc.debit(7000.00);
		
	}
}
class Customers3 extends Thread
{
	Accounts acc;
	public Customers3(Accounts acc)
	{
		this.acc=acc;
	}
	public void run()
	{
		acc.credit(5000.00);
		
	}
}
public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Accounts acc=new Accounts();
Customers1 cs1=new Customers1(acc);
Customers2 cs2=new Customers2(acc);
Customers3 cs3=new Customers3(acc);
cs1.start();
cs2.start();
cs3.start();
	}

}
