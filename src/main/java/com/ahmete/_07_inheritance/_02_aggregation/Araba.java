package com.ahmete._07_inheritance._02_aggregation;
/*
aggegation: compositiondaki sıkı bağlılık yerine daha gevşek bir baglılık sunar
Araba has a motor.
burada bileşen ayrı bir şekilde nesne oluşturularak gönderilebiliyor.bagımsız bir işekilde oluşturulabilmesi gevşek
bağlılık sunar
 */
public class Araba {
	private Motor motor;
	private  String marka;
	
	public Araba(String marka, Motor motor) {
		this.marka = marka;
		this.motor = motor; // motor nesnesi dısarıdan parametre ile alınır
	}
	public void arabaBilgisi(){
		System.out.println("Araba markası "+marka);
		System.out.println("Motor tipi "+motor.getTip());
	}
}