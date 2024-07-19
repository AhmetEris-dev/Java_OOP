package com.ahmete._06_Kutuphane;
/*
uyeNo
ad
soyad
telno
dtarih
adres
tc
kayittarihi
puan
oduncAldıgıKitapSayisi
 */

public class Uye {
	//Sınıf değişkeni
	private static int uyeIndex;
	//Nesne değişkenleri
	private int uyeNo;
	private String ad;
	private String soyad;
	private String telNo;
	private String dtarih;
	private String adres;
	private String tc;
	private String kayitTarihi;
	private int puan;
	private int oduncAldigiKitapSayisi;
	
	public Uye() {
	}
	
	public Uye(String ad, String adres, String dtarih, String kayitTarihi,  String soyad, String tc, String telNo) {
		this.ad = ad;
		this.adres = adres;
		this.dtarih = dtarih;
		this.kayitTarihi = kayitTarihi;
		this.oduncAldigiKitapSayisi = 0;
		this.puan = 100;
		this.soyad = soyad;
		this.tc = tc;
		this.telNo = telNo;
		this.uyeNo = ++uyeIndex;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getAdres() {
		return adres;
	}
	
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public String getDtarih() {
		return dtarih;
	}
	
	public void setDtarih(String dtarih) {
		this.dtarih = dtarih;
	}
	
	public String getKayitTarihi() {
		return kayitTarihi;
	}
	
	public void setKayitTarihi(String kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}
	
	public int getOduncAldigiKitapSayisi() {
		return oduncAldigiKitapSayisi;
	}
	
	public void setOduncAldigiKitapSayisi(int oduncAldigiKitapSayisi) {
		this.oduncAldigiKitapSayisi = oduncAldigiKitapSayisi;
	}
	
	public int getPuan() {
		return puan;
	}
	
	public void setPuan(int puan) {
		this.puan = puan;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public String getTc() {
		return tc;
	}
	
	public void setTc(String tc) {
		this.tc = tc;
	}
	
	public String getTelNo() {
		return telNo;
	}
	
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	public int getUyeNo() {
		return uyeNo;
	}
	
	public void setUyeNo(int uyeNo) {
		this.uyeNo = uyeNo;
	}
	
	
	@Override
	public String toString() {
		return "Uye{" + "ad='" + getAd() + '\'' + ", uyeNo=" + getUyeNo() + ", soyad='" + getSoyad() + '\'' + ", telNo='" + getTelNo() + '\'' + ", dtarih='" + getDtarih() + '\'' + ", adres='" + getAdres() + '\'' + ", tc='" + getTc() + '\'' + ", kayitTarihi='" + getKayitTarihi() + '\'' + ", puan=" + getPuan() + ", oduncAldigiKitapSayisi=" + getOduncAldigiKitapSayisi() + '}';
	}
}