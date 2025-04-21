package COLLECTION;

import java.util.ArrayList;

public class UserDefinedCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee("E1","ROBIN","MANAGER",65000.00);
Employee e2=new Employee("E2","AJOY","ANALYST",45000.00);
Employee e3=new Employee("E3","SUMAN","ANALYST",55000.00);
Employee e4=new Employee("E4","ANNANYA","CLERK",25000.00);
ArrayList<Employee> arr=new ArrayList<Employee>();
arr.add(e1);
arr.add(e2);
arr.add(e3);
arr.add(e4);
for(Employee empl:arr)
{
	System.out.println(empl.getEid()+"===>"+empl.getEname()+"==>"+empl.getSal()+"===>"+empl.getDesig());
}
	}

}
