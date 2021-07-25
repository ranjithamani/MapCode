package com.xworkz.features.functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.xworkz.features.functional.dto.FishDTO;
import com.xworkz.features.functional.dto.constants.*;

public class FishTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FishDTO fish1 = new FishDTO("Salmon", "White", FishType.SALMON, 15, 700d, Gender.MALE);
		FishDTO fish2 = new FishDTO("Flounders", "Silver", FishType.SHAD, 17, 900d, Gender.MALE);
		FishDTO fish3 = new FishDTO("Carp", "Cream", FishType.GRASS, 12, 800d, Gender.MALE);
		FishDTO fish4 = new FishDTO("Catfish", "Silver", FishType.BULL, 16, 1200d, Gender.FEMALE);

		List<FishDTO> list = new ArrayList<FishDTO>();
		list.add(fish1);
		list.add(fish2);
		list.add(fish3);
		list.add(fish4);

		System.out.println(list);
		Comparator<FishDTO> fishNameComparator = new Comparator<FishDTO>() {
			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(list, fishNameComparator);
		
		Iterator<FishDTO> itr = list.iterator();
		while (itr.hasNext()) {
			FishDTO fishDTO = (FishDTO) itr.next();
			System.out.println(fishDTO.getName());
		}
		Comparator<FishDTO> fishColorComparator = new Comparator<FishDTO>() {
			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				// TODO Auto-generated method stub
				return o1.getColor().compareTo(o2.getColor());
			}
		};
		System.out.println("**************************");
		Collections.sort(list, fishColorComparator);
		
		Iterator<FishDTO> itertor = list.iterator();
		while (itertor.hasNext()) {
			FishDTO fishDTO = (FishDTO) itertor.next();
			System.out.println(fishDTO.getColor());
		}
		Comparator<FishDTO> fishLifeSpanComparator = new Comparator<FishDTO>() {
			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				Integer life1=o1.getLifeSpan();
				Integer life2=o1.getLifeSpan();

				return life1.compareTo(life2);
			}
		};
		System.out.println("**************************");
		Collections.sort(list, fishLifeSpanComparator);
		
		Iterator<FishDTO> it = list.iterator();
		while (it.hasNext()) {
			FishDTO fishDTO = (FishDTO) it.next();
			System.out.println(fishDTO.getLifeSpan());
		}
		Comparator<FishDTO> lifeSpanDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				if(o2.getLifeSpan() == o1.getLifeSpan())
					return 0;
				else if(o2.getLifeSpan() > o1.getLifeSpan())
					return -1;
				else 
				
				return 1;
			}
			
		};
		
		Collections.sort(list,lifeSpanDesc.reversed());
		
		Iterator itt = list.iterator();
		for (Iterator iterator = list.iterator();
				iterator.hasNext();) {
			FishDTO fishDTO = (FishDTO) iterator.next();
			System.out.println("Life Span Desc : " + fishDTO.getLifeSpan());
			
		}
		Comparator<FishDTO> fishCostComparator = new Comparator<FishDTO>() {
			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				Double life1=o1.getCost();
				Double life2=o1.getCost();

				return life1.compareTo(life2);
			}
		};
		System.out.println("**************************");
		Collections.sort(list,fishCostComparator);
		
		Iterator<FishDTO> itrr = list.iterator();
		while (itrr.hasNext()) {
			FishDTO fishDTO = (FishDTO) itrr.next();
			System.out.println(fishDTO.getCost());
		}
		
	}
}

