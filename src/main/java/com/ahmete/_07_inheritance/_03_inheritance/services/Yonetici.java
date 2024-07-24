package com.ahmete._07_inheritance._03_inheritance.services;

public class Yonetici extends Personel{
//	public static void main(String[] args) {
//		Personel personel1=new Personel("zafer");
//		personel1.personelProtectedMetod();
//	}
	public String yoneticiOzelligi;
	
	public Yonetici(String ad) {
		super(ad);
	}
	public void yoneticiMetodu(){
		System.out.println("yönetici metodu calıştı");
	}
	
	@Override
	public String getInfo() {
		System.out.println("yonetici getInfo metodu calıştı");
		return "Yonetici{" + "yoneticiOzelligi='" + yoneticiOzelligi ;
	}
}