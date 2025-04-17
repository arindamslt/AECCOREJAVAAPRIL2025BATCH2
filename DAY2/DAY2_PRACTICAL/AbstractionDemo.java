package OOPS;
abstract class Shape
{
	public abstract void area(double r);
	
}
class Square extends Shape
{
	public void area(double r)
	{
		System.out.println("AREA SQUARE:"+(r*r));
	}
}
class Circle extends Shape
{
	public void area(double r)
	{
		System.out.println("AREA OF CIRCLE:"+Math.PI*r*r);
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square();
		Circle cr=new Circle();
		sq.area(5.5);
		cr.area(5.5);
  
	}

}
