package com.ahmete._01_CompoundObject;

public class Ogrenci {
	String no;
	String ad;
	
	Bolum bolum;
	Ders[] aldigiDersler;
	Hoca danisman;
	//her yeni nesne oluşturulurken constructor çalışır.
	public Ogrenci(String ad, String no) {
		this.ad = ad;
		this.no = no;
		aldigiDersler=new Ders[8];
	}
}