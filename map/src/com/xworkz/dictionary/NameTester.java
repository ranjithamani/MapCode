package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> nameMap = new HashMap<String, String>();
		nameMap.put("Ranjitha","Pongal");
		nameMap.put("Harshitha","Pulav");
		nameMap.put("Sunitha","Mothi Sweet");
		nameMap.put("Pavithra","Upma");
		nameMap.put("Girija","Dosa");
		System.out.println(nameMap.size());

		System.out.println(nameMap.containsKey("Ranjitha"));
		System.out.println(nameMap.containsValue("Puliyogare"));
		// nameMap.clear();
		nameMap.remove("Ranjitha");
		System.out.println(nameMap.size());// size

		Set<String> keySet = nameMap.keySet();

		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			String value = nameMap.get(str);// get
			System.out.println(str + " " + value);
		}
		Collection<String> comp = nameMap.values();
		Iterator<String> iterator = comp.iterator();
		while (iterator.hasNext()) {
			String temp = iterator.next();
			System.out.println(temp);
		}
	}

}
