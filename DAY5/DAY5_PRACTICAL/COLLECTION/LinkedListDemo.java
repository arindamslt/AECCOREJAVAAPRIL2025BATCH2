package COLLECTION;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> lt=new LinkedList<String>();
lt.add("RAJAT");
lt.add("ALOKE");
lt.add("JAYANTA");
lt.add("RUPAM");
lt.add(2,"RIYA");
for(Object o:lt)
{
	System.out.println(o);
}
	}

}
