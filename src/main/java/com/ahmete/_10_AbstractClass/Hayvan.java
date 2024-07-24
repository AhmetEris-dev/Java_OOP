package com.ahmete._10_AbstractClass;
// abstract sınıflardan nesne üretilmez. miras alınması ıcın kullanılan sıfılar abstract sınıflardır
// public abstract class Hayvan {
// abstract sınıf içinde abstract metodlar olabilir
// abstract metodlar abstract sınıflar içinde olabilir. abstract olmayan sınıflarda abstract metod olmaz!!!
// absctract sınıf içinde hem absctract hemde abstract olmayan metodlar olabilir.
public abstract class Hayvan {
	private String ad;
	private int kilo;
	private int boy;
	
	public Hayvan(String ad, int boy, int kilo) {
		this.ad = ad;
		this.boy = boy;
		this.kilo = kilo;
	}
	
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public int getBoy() {
		return boy;
	}
	
	public void setBoy(int boy) {
		this.boy = boy;
	}
	
	public int getKilo() {
		return kilo;
	}
	
	public void setKilo(int kilo) {
		this.kilo = kilo;
	}
	
	// abstract metodun gövdesi olmaz
	// abstract metot yazmaktaki amac: miras alan sınıfların bu metodu impelente etmeye zorlanmasıdır.
	// abstract metodlar noktalı virgül ile sonlandırılır.
	public abstract void sesCikar();
//	{
//		System.out.println("Hayvan ses cıkardı");
//
//	}

}