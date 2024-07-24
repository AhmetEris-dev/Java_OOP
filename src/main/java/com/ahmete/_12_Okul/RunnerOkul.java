package com.ahmete._12_Okul;

public class RunnerOkul {
	public static void main(String[] args) {
		Ogrenci ogr1=new Ogrenci("ahmet",50.0,"1","eriş");
		Ogrenci ogr2=new Ogrenci("selin",55.5,"2","kar");
		Ogrenci ogr3=new Ogrenci("gizem",56.6,"3","can");
		Ogrenci ogr4=new Ogrenci("tarık",57.8,"4","yen");
		
		Sinif sinif1=new Sinif("1a","1. kat 101 nolu derslik");
		Sinif sinif2=new Sinif("2a","1. kat 101 nolu derslik");
		Sinif sinif3=new Sinif("3a","1. kat 101 nolu derslik");
		Sinif sinif4=new Sinif("4a","1. kat 101 nolu derslik");
		
		//sınıfa ogrenci ekleme
		sinif1.ogrenciEkle(ogr1);
		sinif1.ogrenciEkle(ogr2);
		sinif1.ogrenciEkle(ogr3);
		sinif1.ogrenciEkle(ogr4);
		
		// 2. sınıf ogrencileri,
		Ogrenci ogr5=new Ogrenci("ogr1",50.0,"5","eriş");
		Ogrenci ogr6=new Ogrenci("ogr2",50.0,"6","kar");
		Ogrenci ogr7=new Ogrenci("ogr3",50.0,"7","can");
		Ogrenci ogr8=new Ogrenci("ogr4",50.0,"8","yen");
		
		sinif2.ogrenciEkle(ogr5);
		sinif2.ogrenciEkle(ogr6);
		sinif2.ogrenciEkle(ogr7);
		sinif2.ogrenciEkle(ogr8);
		
		sinif1.ogrencileriListele();
		sinif2.ogrencileriListele();
		
		Okul okul1=new Okul("gazi ilkokulu","cankaya/ankara");
		okul1.sinifEkle(sinif1);
		okul1.sinifEkle(sinif2);
		
		okul1.okulkOgrencileriListele();
		
		//2.sınıftaki 3.ogrencinin adını yazdıralım
		System.out.println(sinif2.getOgrencilerArrayList().get(3).getAd());
	}
}