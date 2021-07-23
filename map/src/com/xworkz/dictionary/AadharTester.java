package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AadharTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Long, Long> aadharMap = new HashMap<Long, Long>();	
		aadharMap.put(665639485351l,8073721260l);//put
		aadharMap.put(112223485351l,9900334455l);
		aadharMap.put(445566778899l,7766553244l);
		aadharMap.put(123456787654l,9901234576l);
		aadharMap.put(987654321234l,7899554433l);
		aadharMap.put(567895432126l,8877665544l);
		System.out.println(aadharMap.size());//size

		System.out.println(aadharMap.containsKey(665639485351l));//containsKey
		System.out.println(aadharMap.containsValue(9901234576l));//containsValue
		//aadharMap.clear();
		aadharMap.remove(567895432126l);
		System.out.println(aadharMap.size());//size
		
		Set<Long> keySet=aadharMap.keySet();
		
        Iterator<Long> itr =keySet.iterator();		
		while(itr.hasNext()) {
			Long str=itr.next();
			Long value=aadharMap.get(str);//get
			System.out.println(str +" "+value);
		}
		Collection<Long> comp=aadharMap.values();
		Iterator<Long> iterator =comp.iterator();		
		while(iterator.hasNext()) {
			Long temp=iterator.next();
			System.out.println(temp);
		}
	}

}
