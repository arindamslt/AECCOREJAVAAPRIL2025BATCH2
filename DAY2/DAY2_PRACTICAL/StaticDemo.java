package OOPS;
class useStatic
{
	public static int x=25;
	public static void show()
	{
		System.out.println("X:"+x);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  useStatic.show();
  System.out.println(useStatic.x);
	}

}
