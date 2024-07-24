package com.ahmete._09_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListOrnek {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList<>();
		arrayList.add("İstanbul");
		arrayList.add(5);
		arrayList.add(true);
		arrayList.add(null);
		arrayList.add('!');
		
		System.out.println(arrayList);
		System.out.println("********************");
		for (int i = 0; i <arrayList.size() ; i++) {
			System.out.println(i+" .eleman="+ arrayList.get(i));
		}
		arrayList.add(1,"londra");
		System.out.println("********************");
		for (int i = 0; i <arrayList.size() ; i++) {
			System.out.println(i+" .eleman="+ arrayList.get(i));
		}
		arrayList.remove(4);
		System.out.println(arrayList);
		ArrayList<Integer> sayilar=new ArrayList<>();
		Random random=new Random();
		for (int i = 0; i <10 ; i++) {
			sayilar.add(random.nextInt(0,101));
		}
		System.out.println(sayilar);
		
		System.out.println("*******************");
		
		Kisi kisi1=new Kisi("mehmet","ertop");
		Kisi kisi2=new Kisi("murat","sacak");
		Kisi kisi3=new Kisi("harun","sakin");
		
		ArrayList<Kisi> kisiler=new ArrayList<>();
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		System.out.println(kisiler);
	}
}