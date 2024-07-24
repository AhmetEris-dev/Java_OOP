package com.ahmete._11_AbstractClass.entities;

import com.ahmete._11_AbstractClass.services.Personel;

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