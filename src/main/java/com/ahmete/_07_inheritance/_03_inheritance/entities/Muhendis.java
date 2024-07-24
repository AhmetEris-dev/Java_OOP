package com.ahmete._07_inheritance._03_inheritance.entities;

import com.ahmete._07_inheritance._03_inheritance.services.Personel;

public class Muhendis extends Personel {
	String uzmanlikAlani;
	String caslismaSekli;
	
	
	public Muhendis(String ad, String ceptel, int maasKatSayisi) {
		super(ad, ceptel, maasKatSayisi);
	}
	
	@Override
	public int getMaasKatSayisi() {
		return 4;
	}
}