package com.ahmete._00_OOP_Giris;

import com.ahmete._03_Constant.Constants;

public class Araba {
	// Özellikler, Üye Değişkenler, Field, Nesne Değişkenleri
	public String marka;
	public String model;
	public String yil;
	public int km; // primitive datatype'ların default değerleri devreye girer. (int için 0)
	// Ama wrapper classların (Integer) default değeri NULL'dır. Onun üzerine ilk değer verilmeden işlem yapılamaz.
	public int hiz;
	
	public Motor motor;
	// Araba has a motor.
	// ( HAS A ilişkisi)
	// Compound-Birleşik Sınıfla oluşan ilişki.
	
	
	
	//default constructor metod: Sınıf ismiyle aynı isme sahip, geri dönüş ile ilgili herhangi bir değer içermeyen bir metod'tur.
	// bu metod ile bu sınıftan nesneler üretilecek.
	// bu metodu elle yazmasanız bile derleme aşamasından sonra oluşan .class dosyasına otomatik olarak eklenir.
	public Araba() {
		System.out.println("Araba() Constructor Çalıştı...");
	}
	
	public Araba(String marka, String model) {
		//this.marka : Sınıfın nesne değişkeni olan markayı göstermek için kullanılır.
		this.marka = marka;
		this.model = model;
	}
	
	public Araba(int hiz, int km, String marka, String model, String yil) {
		this.hiz = hiz;
		this.km = km;
		this.marka = marka;
		this.model = model;
		this.yil = yil;
	}
	
	// Davranışlar: Üye Metodlar
	public void dur(){
		hiz=0;
	}
	public void hizlan(int hizlanmaMiktari){
		hiz+=hizlanmaMiktari;
		
		if(hiz> Constants.Constants.MAX_SPEED){
			hiz=Constants.MAX_SPEED;
		}
		System.out.println(Constants.ARABA_UYARI_HIZ+" "+hiz);
	}
	public void yavasla(int yavaslamaMiktari){
		hiz-=yavaslamaMiktari;
		if(hiz<Constants.MIN_SPEED){
			hiz=Constants.MIN_SPEED;
		}
		System.out.println("Araba yavaşladı. Yeni hiz: "+hiz);
	}
	public void git(int gidilecekKm){
		km+=gidilecekKm;
	}
	
	
	public String getInfo() {
		return "Araba{" + "hiz=" + hiz + ", marka='" + marka + '\'' + ", model='" + model + '\'' + ", yil='" + yil + '\'' + ", km=" + km + '}';
	}
}