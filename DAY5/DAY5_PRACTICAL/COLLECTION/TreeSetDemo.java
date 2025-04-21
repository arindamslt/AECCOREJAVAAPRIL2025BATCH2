package COLLECTION;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> hs=new TreeSet<String>(new TestComparator());
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
