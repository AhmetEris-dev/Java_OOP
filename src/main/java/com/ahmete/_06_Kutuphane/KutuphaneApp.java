package com.ahmete._06_Kutuphane;

public class KutuphaneApp {
	public static void main(String[] args) {
		Kutuphane kutuphane1 = new Kutuphane();
		Kitap kitap1=new Kitap("The Little Prince","9786059681001",120,"Hikaye","KARBON KİTAPLAR","2016","Antoine De " +
				"Saint Exupery");
		kutuphane1.kitapEkle(kitap1);
		kutuphane1.kitapEkle(kitap1);
		
		Kitap kitap2=new Kitap("Moby Dick","9786256691223",496,"Roman","KAPRA YAYINCILIK","2024","Herman Melville");
		kutuphane1.kitapEkle(kitap2);
		Kitap kitap3=new Kitap("Kitap3","9786256695555",200,"Roman","KAPRA YAYINCILIK","2024","Herman Melville");
		kutuphane1.kitapEkle(kitap3);
		
		kutuphane1.kitaplariListele();
//	public Uye(String ad, String adres, String dtarih, String kayitTarihi,  String soyad, String tc, String telNo,
//	int uyeNo) {
		Uye uye1=new Uye("Su","Kadıköy İstanbul","1999","18.07.2024","Yıldırım","11122233345","5552221122");
		Uye uye2=new Uye("Ece","Bakırköy İstanbul","2010","17.07.2024","Keskin","11177733345","5553332211");
		
		kutuphane1.uyeEkle(uye1);
		kutuphane1.uyeEkle(uye1);
		kutuphane1.uyeEkle(uye2);
		
		kutuphane1.uyelerListele();
		
		kutuphane1.oduncVer("9786059681001","11122233345"); // 0 indexli uye 0 indexli kitabı almak istiyor
		
		kutuphane1.oduncVer("9786059681001","11177733345"); // 1 indexli uye 0 indexli kitabı almak istiyor
		
		kutuphane1.oduncVer("9786256691223","11122233345"); // 0 indexli uye 1 indexli kitabı almak istiyor
		
		kutuphane1.oduncVer("9786256691223","11177733345"); // 1 indexli uye 1 indexli kitabı almak istiyor
		
		kutuphane1.oduncVer("9786256695555","11122233345");
		
		kutuphane1.oduncVer("9786256695557","11177733345");
		
		kutuphane1.oduncListele();
		
		kutuphane1.teslimAl(2);
		
		kutuphane1.kitaplariListele();
		
		kutuphane1.kitapSil("9786059681002"); // yanlış ISBN
		kutuphane1.kitapSil("9786256691223"); // adet 0 durumu için
		kutuphane1.kitapSil("9786256695555"); // stok 1 durumu için
		
		kutuphane1.kitaplariListele();
		
		kutuphane1.kitapSil("9786059681001"); // stok 1'den büyük durumlar için
		kutuphane1.kitaplariListele();
		kutuphane1.kitapSil("9786059681001");
		kutuphane1.kitaplariListele();
		kutuphane1.oduncListele();
		kutuphane1.teslimAl(1);
		kutuphane1.teslimAl(3);
		kutuphane1.oduncListele();
		
		kutuphane1.kitaplariListele();
		kutuphane1.kitapSil("9786059681001");
		kutuphane1.kitapSil("9786256691223");
		kutuphane1.kitaplariListele();
		
	}
}