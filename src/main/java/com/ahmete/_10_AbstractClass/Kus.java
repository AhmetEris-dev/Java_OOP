package com.ahmete._10_AbstractClass;

public class Kus extends Hayvan {
	public Kus(String ad, int boy, int kilo) {
		super(ad, boy, kilo);
	}
	
	@Override
	public void sesCikar() {
		System.out.println(getAd()+"Cik Cik...");
	}
}