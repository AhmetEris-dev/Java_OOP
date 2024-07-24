package com.ahmete._11_AbstractClass.services;
// sınıfı final olarak tanımlarsanız o sınıftan miras alınmasını engeller
// public finasl class extends object
public abstract class Personel {
	public String ad;
	public String tel;
	public String tc;
	public String ceptel;
	public int yas;
	
	private int maas=17002;
	private int maasKatSayisi=1;
	
	public int getMaas() {
		return maas;
	}
	
	public void setMaas(int maas) {
		this.maas = maas;
	}
	// final olarak tanımlanırsa alt sınıflarda o metod a override edilemez yada tekrar yazılamaz
	//public final int getMaasKatSayisi() {
	public int getMaasKatSayisi() {
		return maasKatSayisi;
	}
	
	public void setMaasKatSayisi(int maasKatSayisi) {
		this.maasKatSayisi = maasKatSayisi;
	}
	//	public Personel() {
//		System.out.println("personel sınıfı boş constructor calıştı.");
//	}
	
	public Personel(String ad) {
		this.ad = ad;
		System.out.println("personel sınıfı 1 parametreli constructor çalıştı. "+ad);
	}
	
	public Personel(String ad, String ceptel, int maasKatSayisi) {
		this.ad = ad;
		this.ceptel = ceptel;
		this.maasKatSayisi = maasKatSayisi;
	}
	
	// protected ile erişmek için miras alması lazım // eğer miras almazsa erişemez
	public String getInfo() {
		
		return "Personel{" + "ad='" + ad + '\'' + ", tel='" + tel + '\'' + ", tc='" + tc + '\'' + ", ceptel='" + ceptel + '\'' + ", yas=" + yas + ", maasKatSayisi=" + maasKatSayisi + '}';
	}
	
	protected String personelProtectedMetod(){
		return "personelProtectedMetod";
	}
	
}