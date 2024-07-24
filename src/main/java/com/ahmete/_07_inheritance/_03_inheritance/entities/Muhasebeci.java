package com.ahmete._07_inheritance._03_inheritance.entities;

import com.ahmete._07_inheritance._03_inheritance.services.Personel;

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