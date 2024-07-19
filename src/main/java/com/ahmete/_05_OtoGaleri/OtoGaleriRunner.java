package com.ahmete._05_OtoGaleri;

public class OtoGaleriRunner {
	public static void main(String[] args) {
		OtoGaleri kardeslerOto=new OtoGaleri(10);
		kardeslerOto.setAd("Kardeşler Oto");
		kardeslerOto.setTel("212-444-55-66");
		kardeslerOto.setYetkiliKisi("Ayhan Kardeş");
		
		kardeslerOto.arabaEkle(new Araba(0,20000,"Marka1","Model1",new Motor(90,1600,"ADAS8745",200),"Beyaz","2020"));
		
		
		Motor motor2=new Motor(100,2000,"KDJE8541",200);
		kardeslerOto.arabaEkle(new Araba(0,30000,"Marka2","Model2",motor2,"Siyah","2022"));
		
		
		Motor motor3=new Motor(100,2000,"KEDE8541",200);
		Araba araba=new Araba(0,50000,"Marka3","Model3",motor3,"Siyah","2023");
		kardeslerOto.arabaEkle(araba);
		
		kardeslerOto.arabaListele();
		
		OtoGaleri galericiMahmut=new OtoGaleri(4);
		galericiMahmut.setAd("Galerici Mahmut");
		galericiMahmut.setTel("212-888-55-88");
		galericiMahmut.setYetkiliKisi("Mahmut Galleria");
		galericiMahmut.arabaEkle(araba);
		galericiMahmut.arabaEkle(araba);
		galericiMahmut.arabaEkle(araba);
		galericiMahmut.arabaEkle(araba);
		galericiMahmut.arabaListele();
		
		System.out.println(kardeslerOto);
		System.out.println(galericiMahmut);
	}
}