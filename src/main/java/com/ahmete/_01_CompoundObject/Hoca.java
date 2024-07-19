package com.ahmete._01_CompoundObject;

public class Hoca {
	String ad;
	String unvan;
	
	Bolum bolum;
	Ogrenci[] danisanOgrenciler;
	Ders[] verdigiDersler;
	// Constructor Overloading
	public Hoca() {
	}
	
	public Hoca(String ad, Bolum bolum, String unvan) {
		this.ad = ad;
		this.bolum = bolum;
		this.unvan = unvan;
	}
	
	public Hoca(String ad, Bolum bolum, Ogrenci[] danisanOgrenciler, String unvan, Ders[] verdigiDersler) {
		this.ad = ad;
		this.bolum = bolum;
		this.danisanOgrenciler = danisanOgrenciler;
		this.unvan = unvan;
		this.verdigiDersler = verdigiDersler;
		danisanOgrenciler=new Ogrenci[10];
		verdigiDersler=new Ders[4];
	}
}