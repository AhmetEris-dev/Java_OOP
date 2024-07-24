package com.ahmete._12_Okul;
// nesne değişkenleri: sinifAd, lokasyon, ogrenciler(ArrayList).
// constructor:  sinifAd, lokasyon + sinifAd, lokasyon, ogrenciler(ArrayList).
// sınıfa öğrenciEkle metodu olmalı. Ogrenci nesnesi alarak ekleme olabilir, veya okulNo, ad,soyad,notOrt bilgilerini
// alıp öğrenci oluşturma işini eklerken de yapabiliriz.
// sınıftaki öğrencileri listeleyecek bir metod

import java.util.ArrayList;
import java.util.Locale;

public class Sinif {
	
	private String sinifAd;
	private String lokasyon;
	private ArrayList<Ogrenci> ogrencilerArrayList;
	
	public Sinif(String sinifAd, String lokasyon) {
		this.sinifAd = sinifAd;
		this.lokasyon = lokasyon;
		ogrencilerArrayList=new ArrayList<>();
	}
	
	public Sinif(String sinifAd, String lokasyon, ArrayList<Ogrenci> ogrenciler) {
		this.sinifAd = sinifAd;
		this.lokasyon = lokasyon;
		this.ogrencilerArrayList = ogrenciler;
	}
	
	public String getSinifAd() {
		return sinifAd;
	}
	
	public void setSinifAd(String sinifAd) {
		this.sinifAd = sinifAd;
	}
	
	public String getLokasyon() {
		return lokasyon;
	}
	
	public void setLokasyon(String lokasyon) {
		this.lokasyon = lokasyon;
	}
	
	public ArrayList<Ogrenci> getOgrencilerArrayList() {
		return ogrencilerArrayList;
	}
	
	public void setOgrencilerArrayList(ArrayList<Ogrenci> ogrencilerArrayList) {
		this.ogrencilerArrayList = ogrencilerArrayList;
	}
	public void ogrenciEkle(Ogrenci ogrenci) {
		ogrencilerArrayList.add(ogrenci);
	}
	public void ogrenciEKle(String okulno,String ad,String soyad,Double notOrt){
		ogrencilerArrayList.add(new Ogrenci(ad,notOrt,okulno,soyad));
	}
	public void ogrencileriListele(){
		System.out.println("********"+getSinifAd().toUpperCase()+" SINIF LİSTESİ ");
		for (Ogrenci ogrenci:ogrencilerArrayList){
			System.out.println(ogrenci);
		}
	}
	
	@Override
	public String toString() {
		return "Sinif{" + "sinifAd='" + getSinifAd() + '\'' + ", lokasyon='" + getLokasyon() + '\'' + ", ogrencilerArrayList=" + getOgrencilerArrayList() + '}';
	}
}