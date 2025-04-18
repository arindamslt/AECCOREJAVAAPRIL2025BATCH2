package EXCEPTION;
class Calculators
{
	int x=25;
	int y=0;
	public void result() throws ArithmeticException,Exception
	{
		   int z;
		    z=x/y;  //calle environment
		  System.out.println("RESULT:"+z);
		
	
	}
}
public class ThrowsDemo {

	public static void main(String[] args) throws ArithmeticException,Exception{
		// TODO Auto-generated method stub
  Calculators cl=new Calculators();
  cl.result();
	}

}
