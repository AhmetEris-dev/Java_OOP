package com.ahmete._07_inheritance._01_composition;
// Araba sınıfı compound sınıfır (composition)
// bu ilişki turunde(composition 2 sınıf birbirine cok sıkı bağlıdırlar.
// her 2 nesnede birlikte uretilir
// Araba nesnesi motor nesnesi olmadan var olamaz.

public class Araba {
	private Motor motor;
	private String marka;
	
	public Araba(String tip,String marka){
		this.motor=new Motor(tip);
		this.marka=marka;
	}
	public void arabaBilgisi(){
		System.out.println("Araba markası "+marka);
		System.out.println("Motor tipi "+motor.getTip());
	}
}