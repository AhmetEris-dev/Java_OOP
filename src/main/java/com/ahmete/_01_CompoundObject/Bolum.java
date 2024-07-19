package com.ahmete._01_CompoundObject;

public class Bolum {
	String kod;
	String ad;
	
	Hoca bolumBaskani;
	Ders[] dersler;
	Ogrenci[] ogrenciler;
	
	public Bolum(String ad, String kod) {
		System.out.println("Bolum Constructor metod çalıştı.");
		this.ad = ad;
		this.kod = kod;
		
		dersler=new Ders[50];
		ogrenciler=new Ogrenci[200];
	}
	
}