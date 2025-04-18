package EXCEPTION;
class Calculator
{
	int x=25;
	int y=5;
	public void result()
	{
		try
		{
		   int z;
		    z=x/y;  //calle environment
		  System.out.println("RESULT:"+z);
		}
		catch(ArithmeticException ae)
		{
			//ae.printStackTrace();
			//System.out.println(ae);
			System.out.println(ae.getMessage());
		}
		catch(Exception ex)
		{
			//ex.printStackTrace();
			//System.out.println(ex);
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("ALWAYS EXECUTED");
		}
		
		
	}
	public void show()
	{
		System.out.println("X:"+x);
	}
}
public class UnCheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cl=new Calculator();
		cl.result();//caller environment
		cl.show();

	}

}
