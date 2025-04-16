package OOPS;
class Parent6
{
	public void show()
	{
		System.out.println("I AM IN PARENT CLASS");
	}
}
class Child6 extends Parent6
{
	public void show()
	{
		System.out.println("I AM IN CHILD CLASS");
		super.show();
	}
}
public class MethodOverriddingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Child6  ch=new Child6();
  ch.show();
	}

}
