package OOPS;
abstract class Shape1
{
	public abstract void area(double r);
	
}
class Square1 extends Shape1
{
	public void area(double r)
	{
		System.out.println("AREA SQUARE:"+(r*r));
	}
}
class Circle1 extends Shape1
{
	public void area(double r)
	{
		System.out.println("AREA OF CIRCLE:"+Math.PI*r*r);
	}
}
public class DynamicBindingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Shape1 sp1;
  Shape1 sp2;//OBJECT REFERENCE
  Square1 sq=new Square1();
  Circle1 cr=new Circle1();
  sp1=sq;
  sp2=cr;
  sp1=sp2;//DYNAMIC BINDING
  sp1.area(5.6);;
	}

}
