package COLLECTION;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //HashMap<String,Double> hp=new HashMap<String, Double>();
  //LinkedHashMap<String,Double> hp=new LinkedHashMap<String, Double>();
   TreeMap<String,Double> hp=new TreeMap<String, Double>();
  hp.put("TV",25000.00);
  hp.put("TAB",22000.00);
  hp.put("CONVECTION",18000.00);
  hp.put("REFRIGERATOR",25000.00);
  hp.put("MOBILE",12000.00);
  hp.put("TV",32000.00);
  ///System.out.println(hp);
  /*Set set=hp.entrySet();//DATA ARE COPIED TO SET
  Iterator itr=set.iterator();
  while(itr.hasNext())
  {
	  Map.Entry me=(Map.Entry)itr.next();
	  System.out.println(me.getKey()+"===>"+me.getValue());
  }*/
  for(var entry:hp.entrySet())
  {
	   System.out.println(entry.getKey()+"===>"+entry.getValue());
  }
	}

}
