package STRING;

import java.util.stream.Stream;

public class StringMethiodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="";
     System.out.println(s.isEmpty());
     String s1="abcabcabcabc";
     System.out.println(s1.replace('c','d'));
     String s2=" MICROSERVICE ";
     System.out.println(s2);
     System.out.println(s2.trim());
     String s3="TEST";
     System.out.println(s3.indexOf("T"));
     System.out.println(s3.lastIndexOf("T"));
     String s4="BANGALORE";
     System.out.println(s4.substring(5,7));
     System.out.println(s4.charAt(3));
     String msg="HELLO,HOW ARE YOU,I AM FINE";
     String[] arr=msg.split(",");
       /*for(int i=0;i<arr.length;i++)
       {
    	   System.out.println(arr[i]);
       }*/
       for(String sd:arr)
       {
    	   System.out.println(sd);
       }
    
	}

}
