package com.ahmete._01_CompoundObject;

public class Runner {
	public static void main(String[] args) {
		Bolum bolum1=new Bolum("Yazılım Müh.","YZMH");
		Ogrenci ogrenci1=new Ogrenci("Muzaffer Bilek","20240105");
		Ders ders1=new Ders("Computer Science","YZMH-101",5);
		Ogrenci[] ogrenciArray=new Ogrenci[10];
		ogrenciArray[0]=ogrenci1;
		Ders[] dersArray=new Ders[4];
		dersArray[0]=ders1;
		Hoca hoca1=new Hoca("Selim AK",bolum1,ogrenciArray,"Prof.",dersArray);
		
		bolum1.bolumBaskani=hoca1;
		bolum1.dersler[0]=ders1;
		bolum1.ogrenciler[0]=ogrenci1;
		
		
		ogrenci1.bolum=bolum1;
		ogrenci1.aldigiDersler[0]=ders1;
		ogrenci1.danisman=hoca1;
		
		ders1.hoca=hoca1;
		ders1.bolum=bolum1;
		ders1.ogrenciler[0]=ogrenci1;
		
		
		
		// öğrenci1'in aldığı ilk dersin adı nedir?
		System.out.println("öğrenci1'in aldığı ilk dersin adı:"+ogrenci1.aldigiDersler[0].ad);
		// öğrenci1'in adlığı ilk dersin hocasının adı?
		System.out.println("öğrenci1'in adlığı ilk dersin hocasının adı:"+ogrenci1.aldigiDersler[0].hoca.ad);
		// öğrenci1'in adlığı ilk dersin hocasının bolumunun kodu?
		System.out.println("öğrenci1'in adlığı ilk dersin hocasının bolumunun kodu: "+ogrenci1.aldigiDersler[0].hoca.bolum.kod);
	}
}