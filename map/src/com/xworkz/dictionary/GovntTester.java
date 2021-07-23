package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GovntTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Double> govtMap = new HashMap<String, Double>();	
		govtMap.put("Doctor",1.8d);//put
		govtMap.put("IAS",1.2d);
		govtMap.put("Teacher",60000d);
		govtMap.put("IPS", 80000d);
		govtMap.put("SDA",26000d);
		govtMap.put("FDA",35000d);
		System.out.println(govtMap.size());//size

		System.out.println(govtMap.containsKey("Teacher"));//containsKey
		System.out.println(govtMap.containsValue(35000d));//containsValue
		//govtMap.clear();
		govtMap.remove("Teacher");
		System.out.println(govtMap.size());//size
		
		Set<String> keySet=govtMap.keySet();
		
        Iterator<String> itr =keySet.iterator();		
		while(itr.hasNext()) {
			String str=itr.next();
			Double value=govtMap.get(str);//get
			System.out.println(str +" "+value);
		}
		Collection<Double> comp=govtMap.values();
		Iterator<Double> iterator =comp.iterator();		
		while(iterator.hasNext()) {
			Double temp=iterator.next();
			System.out.println(temp);
		}
	}

}
