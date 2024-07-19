package com.ahmete._01_CompoundObject;

public class Ders {
	String kod;
	String ad;
	int kredi;
	
	Hoca hoca; //Dersin hocası olur.
	Bolum bolum; // Ders bir bölüme ait olur.
	Ogrenci[] ogrenciler; // Dersi alan öğrenciler olur.
	
	public Ders(String ad, String kod, int kredi) {
		this.ad = ad;
		this.kod = kod;
		this.kredi = kredi;
		ogrenciler = new Ogrenci[20];
	}
}