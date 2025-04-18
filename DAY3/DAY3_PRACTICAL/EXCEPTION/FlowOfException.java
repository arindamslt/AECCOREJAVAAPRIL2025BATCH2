package EXCEPTION;
class TestException
{
	public int x=25;
	public int y=0;
	public void test()
	{
		try
		{
		System.out.println("X:"+x);//STATEMENT1
		int z=x/y;
		System.out.println("Z:"+z);//statement2
		System.out.println("INSIDE TRY");//statement3
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();//statement4
		}
		/*catch(NullPointerException ne)
		{
			ne.printStackTrace();
		}*/
		//System.out.println("OUTSIDE TRY");//statement5
		System.out.println(10/0);
	}
}
public class FlowOfException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TestException te=new TestException();
  te.test();
	}

}
