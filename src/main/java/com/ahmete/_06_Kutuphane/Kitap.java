package com.ahmete._06_Kutuphane;
/*

ISBN
ad
fiyat

tur
sayfasayisi
adet
yazar
yayınevi
yayınyılı

 */

public class Kitap {
	// 1. Nesne Değişkenleri:
	private String ISBN;
	private String ad;
	private String tur;
	private int sayfaSayisi;
	private int adet; // ödünç durumuna göre değişen kitap adeti
	private int stok; //toplamda kütüphanede kayıtlı kitap sayısı
	private String yazar;
	private String yayinEvi;
	private String yayinyili;
	//2. Constructorlar:
	
	public Kitap() {
	}
	
	public Kitap(String ad, String ISBN, int sayfaSayisi, String tur, String yayinEvi, String yayinyili, String yazar) {
		this.ad = ad;
		this.adet = 1;
		this.stok = 1;
		this.ISBN = ISBN;
		this.sayfaSayisi = sayfaSayisi;
		this.tur = tur;
		this.yayinEvi = yayinEvi;
		this.yayinyili = yayinyili;
		this.yazar = yazar;
	}
	//3. Getter & Setter
	
	public int getStok() {
		return stok;
	}
	
	public void setStok(int stok) {
		this.stok = stok;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public int getAdet() {
		return adet;
	}
	
	public void setAdet(int adet) {
		this.adet = adet;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public int getSayfaSayisi() {
		return sayfaSayisi;
	}
	
	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}
	
	public String getTur() {
		return tur;
	}
	
	public void setTur(String tur) {
		this.tur = tur;
	}
	
	public String getYayinEvi() {
		return yayinEvi;
	}
	
	public void setYayinEvi(String yayinEvi) {
		this.yayinEvi = yayinEvi;
	}
	
	public String getYayinyili() {
		return yayinyili;
	}
	
	public void setYayinyili(String yayinyili) {
		this.yayinyili = yayinyili;
	}
	
	public String getYazar() {
		return yazar;
	}
	
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}
	//4. toString()
	
	
	@Override
	public String toString() {
		return "Kitap{" + "ad='" + getAd() + '\'' + ", ISBN='" + getISBN() + '\'' + ", tur='" + getTur() + '\'' + ", sayfaSayisi=" + getSayfaSayisi() + ", adet=" + getAdet() + ", stok=" + getStok() + ", yazar='" + getYazar() + '\'' + ", yayinEvi='" + getYayinEvi() + '\'' + ", yayinyili='" + getYayinyili() + '\'' + '}';
	}
}