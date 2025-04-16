package OOPS;
class Student
{
	public int rollno=1;
	public String sname="SUMAN";
	public void show()
	{
		System.out.println("ROLLNO:"+rollno);
		System.out.println("NAME:"+sname);
	}
}
class Exam extends Student
{
	public String sub1="PHYS";
	public String sub2="CHEM";
	public String sub3="MATH";
  public void display()
  {
	  System.out.println("SUBJECT1"+sub1);
	  System.out.println("SUBJECT2"+sub2);
	  System.out.println("SUBJECT3"+sub3);
  }
  public int score(int p,int c,int m)
  {
	  return(p+c+m);
  }
}
class Semester extends Exam
{
	public String sem="IVTH";
	public String yr="2ND";
	public void details()
	{
		System.out.println("SEMESTER:"+sem);
		System.out.println("YEAR:"+yr);
	}
	
}

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Semester sm=new Semester();
  sm.show();
  sm.display();
  sm.details();
  int total=sm.score(70,80,90);
  System.out.println("TOTAL:"+total);
	}

}
