package COLLECTION;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Stack<String> lt=new Stack<String>();
 lt.add("RAJAT");
 lt.add("ALOKE");
 lt.add("JAYANTA");
 lt.add("RUPAM");
 lt.add(2,"RIYA");
 lt.push("NAYAN");
 System.out.println("TOPMOST ELEMENT:"+lt.peek());
 lt.pop();
 for(Object o:lt)
 {
	 System.out.println(o);
 }
	}

}
