package com.ahmete._12_Okul;

public class Ogrenci {
	private String okulNo;
	private String ad;
	private String soyad;
	private double notOrt;
	
	public Ogrenci(String ad, Double notOrt, String okulNo, String soyad) {
		this.ad = ad;
		this.notOrt = notOrt;
		this.okulNo = okulNo;
		this.soyad = soyad;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public double getNotOrt() {
		return notOrt;
	}
	
	public void setNotOrt(double notOrt) {
		if (notOrt>=0 && notOrt<=100){
			this.notOrt = notOrt;
		}
		else if (notOrt<0) {
			this.notOrt=0;
		}
		else if (notOrt>100) {
			this.notOrt=100;
		}
		
	}
	
	public String getOkulNo() {
		return okulNo;
	}
	
	public void setOkulNo(String okulNo) {
		this.okulNo = okulNo;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	@Override
	public String toString() {
		return "Ogrenci{" + "ad='" + getAd() + '\'' + ", okulNo='" + getOkulNo() + '\'' + ", soyad='" + getSoyad() + '\'' + ", notOrt=" + getNotOrt() + '}';
	}
}