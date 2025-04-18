package STRING;

public class StringHandellingDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1=new String("SPRING");
s1.concat("HIBERNATE");
String s2=s1.concat("SPRING BOOT");
s2.concat("MICROSERVICE");
System.out.println(s1);
System.out.println(s2);
	}

}
