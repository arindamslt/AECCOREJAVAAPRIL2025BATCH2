package OOPS;
class Outer
{
	int x=25;
	class Inner
	{
		int y=60;
		public void add()
		{
			System.out.println(x+y);
		}
	}
}
public class OuterInnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Outer out=new Outer();
  Outer.Inner inn=out.new Inner();
  inn.add();
	}

}
