package com.ahmete._10_AbstractClass;

public class Kopek extends Hayvan {
	public Kopek(String ad, int boy, int kilo) {
		super(ad, boy, kilo);
	}
	
	@Override
	public void sesCikar() {
//		super.sesCikar();
		System.out.println(getAd()+" Hav Hav...");
	}
}