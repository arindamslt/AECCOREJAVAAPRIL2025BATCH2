package P1;
class Tests
{
	public int x=25;
	private int y=30;
	protected int z=60;
	int d=45;
	public void show_x()
	{
		System.out.println("X:"+x);
	}
	private void show_y()
	{
		System.out.println("Y:"+y);
	}
	protected void show_z()
	{
		System.out.println("Z:"+z);
	}
	void show_d()
	{
		System.out.println("D:"+d);
	}
}
public class Samepckt extends Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Samepckt sm=new Samepckt();
     sm.show_x();
     sm.show_z();
     sm.show_d();
	}

}
