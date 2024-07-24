package com.ahmete._11_AbstractClass.entities;

import com.ahmete._11_AbstractClass.services.Personel;

public class Muhasebeci extends Personel {
	//extends miras almamızı sağlar
	
	
	String muhasebeciUnvani;
	
	public Muhasebeci(String ad) {
		super(ad);
	}
	
	@Override
	public String getInfo() {
		return "Muhasebeci{" + "muhasebeciUnvani='" + muhasebeciUnvani + '\'' + super.getInfo() + '}';
	}
	
	@Override
	public int getMaasKatSayisi() {
		return 3;
	}
}