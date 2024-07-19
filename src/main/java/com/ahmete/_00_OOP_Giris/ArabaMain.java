package com.ahmete._00_OOP_Giris;

public class ArabaMain {
	public static void main(String[] args) {
		int sayi; //metod  içinde tanımlanan değişkenler local değişkenlerdir.
		
		// Alttaki ifadeler gerçekten de bellekte (heap) nesneyi üretir.
		// Ama bu nesnelere erişemezsiniz.
		/*new Araba();
		new Araba();
		new Araba();*/
		// Ulaşabilmek için referanslarını tutacak değişkenlere atamak gereklidir.
		//Constructor metodlar geriye değer dönme ile ilgili bir tanımlama içermezler.
		//Ancak geriye oluşturulan nesnenin bellek adresini dönerler.
		Araba araba1=new Araba("Audi","A3");
		// araba1 üretilen nesnenin referans değişkenidir. Bellekteki adresini tutar.
		araba1.yil="2020";
		araba1.hiz=0;
		
		Motor motor1=new Motor();
		motor1.motorHacmi=1400;
		motor1.sasiNo="SD547E";
		motor1.beygir=90;
		motor1.tork=250;
		// daha önce oluşturduğumuz araba nesnesine,
		// daha önce oluşturduğumuz motor nesnesini atıyoruz.
		araba1.motor=motor1;
		
		motor1.motorHacmi=1600;
		araba1.motor.motorHacmi=2200;
		System.out.println("araba1.motor.motorHacmi:"+araba1.motor.motorHacmi);
		
		
		Araba araba2=new Araba();
		araba2.marka="Toyota";
		araba2.model="Corolla";
		araba2.yil="2022";
		araba2.km=18_000;
		araba2.hiz=50;
		
		System.out.println(araba1.getInfo());
		System.out.println(araba2.getInfo());
		
		araba1=araba2;
		araba2.marka="Volkswagen";
		System.out.println(araba1.getInfo()); //toyota  //vw
		System.out.println(araba2.getInfo()); //vw      //vw
		
		araba1.marka="Porsche";
		System.out.println(araba1.getInfo());
		System.out.println(araba2.getInfo());
		
		Araba araba3=new Araba(0,10000,"Mazda","G3","2022");
		System.out.println(araba3.getInfo());
		
	}
}