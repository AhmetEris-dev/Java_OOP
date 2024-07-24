package com.ahmete._12_Okul;

import java.util.ArrayList;

public class Okul {
	private String okulAd;
	private String okulAdres;
	private ArrayList<Sinif> siniflar;
	
	public Okul(String okulAd, String okulAdres) {
		this.okulAd = okulAd;
		this.okulAdres = okulAdres;
		this.siniflar=new ArrayList<>();
	}
	
	public Okul(String okulAd, String okulAdres, ArrayList<Sinif> siniflar) {
		this.okulAd = okulAd;
		this.okulAdres = okulAdres;
		this.siniflar=siniflar;
	}
	
	public String getOkulAd() {
		return okulAd;
	}
	
	public void setOkulAd(String okulAd) {
		this.okulAd = okulAd;
	}
	public void sinifEkle(Sinif sinif){
		siniflar.add(sinif);
		System.out.println(sinif.getSinifAd()+" adlı sınıf eklendi");
	}
	public void siniflariListele(){
		for (Sinif sinif:siniflar){
			System.out.println("sınıf adı: "+ sinif.getSinifAd()+" sınıf lokasyonu: "+sinif.getLokasyon());
		}
	}
	public void okulkOgrencileriListele(){
		System.out.println("****** "+getOkulAd()+" okulu ogrenci listesi *******");
		for (Sinif sinif:siniflar){
			sinif.ogrencileriListele();
		}
	}
}