package COLLECTION;
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // ArrayList arr=new ArrayList();//NOT SYNCHRONIZED
		Vector arr=new Vector();//SYNCHRONIZED
    // Integer n=new Integer(5);
     arr.add(10);
     arr.add(15);
     arr.add(5);
     arr.add(25);
     arr.add(15.5);
     arr.add("SUMAN");
     arr.add(10);
     System.out.println(arr);
    arr.add(2,"RAMAN");
     System.out.println(arr);
     arr.remove(2);
     System.out.println(arr);
     //Collections.sort(arr);
     System.out.println(arr);
     for(Object o:arr)
     {
    	 System.out.println(o);
     }
     System.out.println("TRAVERSE THE ELEMENTS WITH ITERATOR");
     Iterator itr=arr.iterator();
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
     }
	}

}
