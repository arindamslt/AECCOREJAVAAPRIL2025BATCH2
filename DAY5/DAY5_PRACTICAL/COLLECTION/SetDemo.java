package COLLECTION;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashSet<String> hs=new HashSet<String>();
//LinkedHashSet<String> hs=new LinkedHashSet<String>();
TreeSet<String> hs=new TreeSet<String>();
hs.add("BHASKAR");
hs.add("DIPALI");
hs.add("SUMAN");
hs.add("AYAN");
hs.add("SOUMYA");
hs.add("RUPAM");
hs.add("SUMAN");
for(Object o:hs)
{
	System.out.println(o);
}
	}

}
