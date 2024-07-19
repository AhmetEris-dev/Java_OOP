package com.ahmete._02_Constructor;
/**
 * Constructor Metodlar:
 * Bir sınıftan nesne yaratılmasını sağlayan metodlardır.
 */

public class Araba {
	public String marka;
	public String model;
	public String yil;
	public int km;
	public int hiz;
	
	// Default Constructor
	public Araba() {
		System.out.println("Araba() default constructor çalıştı.");
	}
	
	public Araba(String marka, String model) {
		this();
		this.marka = marka;
		this.model = model;
		
		System.out.println("Araba(String, String) 2 parametreli constructor çalıştı.");
	}
	
	public Araba(int km, String marka) {
		this.km = km;
		this.marka = marka;
		System.out.println("Araba(int, String) 2 parametreli constructor çalıştı.");
	}
	
	public Araba(String marka, int hiz) {
		this.marka = marka;
		this.hiz = hiz;
		System.out.println("Araba(String, int) 2 parametreli constructor çalıştı.");
	}
	
	public Araba(int hiz, int km, String marka, String model, String yil) {
		// Bir constructor metod içinden diğer constructor metod nasıl çağrılır?
		this(marka,model);
		
		// this. ile this() farklı işlemler için kullanılır.
		// this. ile o sınıf içindeki nesne değişkenlerine erişim sağlarız.
		// this() metod çağrımı ile o sınıftaki constructorlara erişim sağlarız.
		
		this.hiz = hiz;
		this.km = km;
		this.yil = yil;
		System.out.println("Araba(int , int , String , String , String ) 5 parametreli constructor çalıştı.");
	}
}