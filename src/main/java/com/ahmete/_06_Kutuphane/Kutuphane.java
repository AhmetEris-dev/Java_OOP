package com.ahmete._06_Kutuphane;
/*
kitaplar
uyeler
oduncListesi

kitapSayisi
uyeSayisi
oduncSayisi

oduncSuresi
gecikmeGunBasinaDusulecekPuan

 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Kutuphane {
	// Sınıf değişkenleri: Bu sınıftan üretilen tüm Kutuphaneler aynı kapasitelerle üretilecektir.
	private static final int KITAP_KAPASITESI = 200;
	private static final int UYE_KAPASITESI = 50;
	private static final int ODUNC_KAPASITESI = 400;
	private static final int ODUNC_SURESI = 15; //15 gün içinde iade etmeli.
	private static final int CEZA_PUANI = 1; // Geciktirilen her gün için düşülecek puan.
	
	//Nesne değişkenleri
	private Kitap[] kitaplar;
	private Uye[] uyeler;
	private Odunc[] oduncListesi;
	
	private int kitapSayisi;
	private int kitapIndex;
	
	private int uyeSayisi;
	
	private int oduncSayisi;
	
	//Constructor
	public Kutuphane() {
		//constructor ile nesne değişkeni olan dizileri initialize etmeliyiz:
		kitaplar = new Kitap[KITAP_KAPASITESI];
		uyeler = new Uye[UYE_KAPASITESI];
		oduncListesi = new Odunc[ODUNC_KAPASITESI];
	}
	
	//kitapEkle
	/*
	geriye değer dönmeli mi? boolean; başarılı bir şekilde ekleme gerçekleşirse true dönecek, aksi halde false dönecek.
	KITAP_KAPASITESI uygun mu? kontrol edilmeli. Eğer uygun değilse kütüphane doludur şeklinde bir mesaj
	yazdırabiliriz.
	Ekleyeceğimiz kitap daha önce eklenmiş mi? ISBN numarası daha önce kaydedilenler içinde var mı kontrol edilmeli.
	-- Eğer daha önce ekli olan bir kitap ekleniyorsa adet değeri 1 artırılmalı.
	-- Eğer ilk defa ekleniyorsa hangi index(indis)'e eklenecek? kitapSayisi değeri 1 artırılıp indis olarak
	kullanılabilir.
	 */
	public boolean kitapEkle(Kitap eklenecekKitap) {
		if (kitapSayisi < KITAP_KAPASITESI) {
			// ekleme işlemleri yapılır.
			int varOlanKitapIndex = kitapBul(eklenecekKitap);
			if (varOlanKitapIndex != -1) {
				//Daha önceden eklenmiş bir kitap varsa;
				kitaplar[varOlanKitapIndex].setAdet(kitaplar[varOlanKitapIndex].getAdet() + 1);
				kitaplar[varOlanKitapIndex].setStok(kitaplar[varOlanKitapIndex].getStok() + 1);
				kitapSayisi++;
				System.out.println(eklenecekKitap.getAd() + " adlı kitabın ADET değeri 1 artırıldı. Kütüphanedeki " +
						                   "kitap" + " sayisi: " + kitapSayisi);
			}
			else {
				//Daha önceden eklenmiş bir kitap değilse; (Yani kitap ilk kez ekleniyorsa
				kitaplar[kitapIndex] = eklenecekKitap;
				kitapSayisi++;
				kitapIndex++;
				System.out.println(eklenecekKitap.getAd() + " adlı kitap Kütüphaneye eklendi. Kütüphanedeki Kitap " +
						                   "Sayısı" + kitapSayisi);
			}
			return true;
		}
		else {
			// Yeni kitap Kapasiteden dolayı eklenemedi.
			System.out.println("Kütüphane Dolu, Yeni kitap eklenemiyor.");
			return false;
		}
	}
	
	/**
	 * @param eklenecekKitap
	 * @return aradığımız ISBN'li kitap dizide bulunursa bulunduğu index değeri geri dönecek,aradığımız ISBN dizide
	 * bulunamazsa -1 dönecek.
	 */
	public int kitapBul(Kitap eklenecekKitap) {
		for (int i = 0; i < kitapIndex; i++) {
			if (kitaplar[i].getISBN().equals(eklenecekKitap.getISBN())) {
				return i; // aradığımız ISBN'li kitap dizide bulunursa bulunduğu index değeri geri dönecek.
			}
		}
		return -1; // aradığımız ISBN dizide bulunamazsa -1 dönecek.
	}
	
	// kitaplariListele
	public void kitaplariListele() {
		System.out.println("----------KUTUPHANE KITAP LISTESI----------");
		if (kitapIndex == 0) {
			System.out.println("Kütüphane boş.");
		}
		else {
			for (int i = 0; i < kitapIndex; i++) {
				System.out.println(kitaplar[i]);
			}
		}
		System.out.println("-------------------------------------------");
	}
	
	// uyeEkle
	// Kutuphanede uye Kapasitesi uygun mu?
	// Eklenecek uye daha önce kayıt olmuş mu? (uyeMi adında yeni bir metod yazılabilir. Bu metodda uyelerin tc'leri
	// karşılaştırılabilir.
	// -- eğer kayıt olduysa ekleme gerçekleştirilmesin ve uyarı mesajı verelim.
	// -- eğer daha önce kayıt olmadıysa ekleme işlemi gerçekleştirilsin. 10:40
	
	public boolean uyeEkle(Uye eklenecekUye) {
		if (uyeSayisi < UYE_KAPASITESI) {
			if (uyeMi(eklenecekUye)) {
				System.out.println(eklenecekUye.getAd() + " adlı kişi daha önce bu TC ile üye olunduğu için kayıt " +
						                   "edilemiyor.");
				return false;
			}
			else {
				uyeler[uyeSayisi] = eklenecekUye;
				uyeSayisi++;
				System.out.println(eklenecekUye.getAd() + " adlı üye başarıyla eklendi.");
				return true;
			}
		}
		else {
			System.out.println("Kütüphane Üyelikleri Dolu. Yeni üye eklenemiyor.");
			return false;
		}
	}
	
	public boolean uyeMi(Uye eklenecekUye) {
		for (int i = 0; i < uyeSayisi; i++) {
			if (uyeler[i].getTc().equals(eklenecekUye.getTc())) {
				return true;
			}
		}
		return false;
	}
	
	// uyeListele 11:05
	public void uyelerListele() {
		System.out.println("----------KUTUPHANE ÜYE LISTESI----------");
		if (uyeSayisi == 0) {
			System.out.println("Üye Listesi boş.");
		}
		else {
			for (int i = 0; i < uyeSayisi; i++) {
				System.out.println(uyeler[i]);
			}
		}
		System.out.println("-------------------------------------------");
	}
	
	//oduncVer
	// Kitap , Uye
	// ISBN numarasından kitabı bulmalıyız. Eğer varsa indexini dönmeliyiz. kitapBul(String ISBN) şeklinde bir metod
	// yazılabilir.
	// tcNo numarasından üyeyi bulmalıyız. Eğer varsa index dönmeliyiz. uyeBul(String tcNo) şeklinde bir metod
	// yazılabilir.
	// Kitap adeti 0'dan büyük mü?
	// Uyenin oduncAldigiKitapSayisi 2'den küçük mü?
	// odunc Kapasitesi uygun mu?
	// -- Eğer Uygunsa;
	// odunc nesnesi ilgili bilgilerle oluşturulacak ve diziye kaydedilecek.
	// oduncSayisi 1 artırılacak.
	// odunc Verilen Kitabın adet değerini 1 azaltmak gerekli.
	// odunc alan uyenin oduncAldigiKitapSayisi değerini 1 artırmak gerekli.
	public void oduncVer(String ISBN, String tcNo) {
		int bulunanKitapIndex = kitapBul(ISBN);
		int bulunanUyeIndex = uyeBul(tcNo);
		
		if (bulunanKitapIndex == -1 || bulunanUyeIndex == -1) {
			System.out.println("Kitap veya Üye bulunmadı. Değerleri kontrol edin.");
			return; // eğer üye veya kitap bulunamazsa oduncVer metodu burada sonlanır.
		}
		//System.out.println("KitapIndex:" + bulunanKitapIndex + " UyeIndex:" + bulunanUyeIndex);
		
		Kitap oduncVerilecekKitap = kitaplar[bulunanKitapIndex];
		Uye oduncAlacakUye = uyeler[bulunanUyeIndex];
		
		if (oduncVerilecekKitap.getAdet() <= 0) {
			System.out.println("Bu kitap mevcut değil. Ödünç verilemez.");
			return;
		}
		if (oduncAlacakUye.getOduncAldigiKitapSayisi() >= 2) {
			System.out.println(oduncAlacakUye.getAd() + " adlı üye 2 tane kitap ödünç almış. Daha fazla kitabı ödünç " + "alamaz.");
			return;
		}
		if (oduncSayisi >= ODUNC_KAPASITESI) {
			System.out.println("Ödünç Listesi Dolu.");
			return;
		}
		
		
		Odunc yeniOdunc = new Odunc(oduncVerilecekKitap, LocalDate.now().toString(), oduncAlacakUye);
		oduncListesi[oduncSayisi]=yeniOdunc;
		oduncSayisi++;
		oduncVerilecekKitap.setAdet(oduncVerilecekKitap.getAdet()-1);
		oduncAlacakUye.setOduncAldigiKitapSayisi(oduncAlacakUye.getOduncAldigiKitapSayisi()+1);
		System.out.println(oduncAlacakUye.getAd()+" adlı üyeye "+oduncVerilecekKitap.getAd()+" adlı kitap Ödünç " +
				                   "verilmiştir.");
		
		System.out.println("Üyenin aldığı kitap sayısı: "+oduncAlacakUye.getOduncAldigiKitapSayisi());
		System.out.println("Kalan kitap adeti: "+oduncVerilecekKitap.getAdet());
		
	}
	
	public int kitapBul(String ISBN) {
		for (int i = 0; i < kitapIndex; i++) {
			if (kitaplar[i].getISBN().equals(ISBN)) return i;//kitap dizide bulunursa index numarası döner.
		}
		return -1; // kitap dizide bulunmazsa -1 döner.
	}
	
	public int uyeBul(String tcNo) {
		for (int i = 0; i < uyeSayisi; i++) {
			if (uyeler[i].getTc().equals(tcNo)) return i; // üye dizide bulunursa index numarası döner.
		}
		return -1; // üye dizide bulunamazsa -1 döner.
	}
	
	//oduncListele
	
	public void oduncListele(){
		System.out.println("----------KUTUPHANE ÖDÜNÇ LISTESI----------");
		if (oduncSayisi == 0) {
			System.out.println("Ödünç Listesi boş.");
		}
		else {
			for (int i = 0; i < oduncSayisi; i++) {
				System.out.println(oduncListesi[i]);
			}
		}
		System.out.println("-------------------------------------------");
	}
	//teslimAl
	public void teslimAl(int oduncNo){
		if(oduncNo<=0 || oduncNo>oduncSayisi || oduncListesi[oduncNo-1]==null){
			System.out.println("Ödünç no geçersiz.");
			return;
		}
		Odunc odunc=oduncListesi[oduncNo-1];
		System.out.println(odunc);
		
		if(odunc.getTeslimTarihi()!=null){
			System.out.println("Bu kitap zaten teslim alınmış. İşleme devam edilemiyor. ");
			return;
		}
		// Teslim tarihini set edelim:
		LocalDate teslimTarihi=LocalDate.now();
		odunc.setTeslimTarihi(teslimTarihi.toString());
		// teslimEdilenKitap adet bilgisini 1 artır:
		Kitap teslimEdilenKitap = odunc.getKitap();
		teslimEdilenKitap.setAdet(teslimEdilenKitap.getAdet()+1);
		// Üyenin oduncAldigiKitapSayisi bilgisini 1 azalt
		Uye kitapTeslimEdenUye = odunc.getUye();
		kitapTeslimEdenUye.setOduncAldigiKitapSayisi(kitapTeslimEdenUye.getOduncAldigiKitapSayisi()-1);
		// Kitabın üyede kalma süresi:
		LocalDate oduncAlmaTarihi= LocalDate.parse(odunc.getOduncAlmaTarihi()); // String bir tarihi LocalDate
		// formatına çevirdik.
		long uyedeKalmaSuresi = ChronoUnit.DAYS.between(oduncAlmaTarihi, teslimTarihi);
		
		// Eğer üye gecikmeli teslim ederse 1 puan azaltabiliriz.
		// Eğer uyenin puanı 0 ise ödünçKitap alamaz.
		if(uyedeKalmaSuresi>ODUNC_SURESI){
			long gecikmeSuresi=uyedeKalmaSuresi-ODUNC_SURESI;
			int dusulecekPuan= (int) (gecikmeSuresi*CEZA_PUANI);
			kitapTeslimEdenUye.setPuan(kitapTeslimEdenUye.getPuan()-dusulecekPuan);
			System.out.println("TESLİM SÜRESİ "+gecikmeSuresi+" GÜN GECİKMİŞTİR. ÜYEDEN "+ dusulecekPuan+" PUAN " +
					                   "DÜŞMÜŞTÜR. UYENIN YENİ PUANI:"+kitapTeslimEdenUye.getPuan());
		}
		
		// Eğer üye normal tarihinde teslim ederse, 1 puan artırabiliriz.
		// toplam puan 150 olursa teslimSüresi 2 katına çıkabilir.
		// toplam puan 200 olursa alabileceğiKitapSayisi 2 katına çıkabilir.
		System.out.println(kitapTeslimEdenUye.getAd()+" adlı üye "+ teslimEdilenKitap.getAd()+" adlı kitabı teslim " +
				                   "etmiştir");
		
		
	}
	
	//kitapSil
	// 1. stokta 2 kitap varken 1 tanesi ödünçte ise o silinebilir.
	// Ama 2si de ödünçte ise silinemez.
	// 2. eğer kitabın stok 1'den fazla ise hem stok bilgisini,hem de adet 1 azaltalım.
	// 3. eğer kitap stok 1 tane ise kitabı arrayden silmeliyiz. (10:56)
	
	public void kitapSil(String ISBN){
		int silinecekKitapIndex = kitapBul(ISBN);
		if(silinecekKitapIndex==-1){
			System.out.println("Geçersiz ISBN no veya bu ISBN nolu kitap yok.");
			return;
		}
		Kitap silinecekKitap = kitaplar[silinecekKitapIndex];
		
		if(silinecekKitap.getAdet()==0){
			System.out.println("Tüm kitaplar ödünç verilmiş durumda olduğu için Silme işlemine devam edilemiyor");
			return;
		}
		
		if(silinecekKitap.getStok()==1){
			// eğer silinecek kitap son Indexte ise yapılacaklar:
			if(silinecekKitapIndex==kitapIndex-1){
				System.out.println(silinecekKitap.getAd() + " adlı kitap silindi.");
				kitaplar[kitapIndex-1]=null;
				kitapSayisi--;
				kitapIndex--;
				return;
			}
			else {
				// eğer silinecek kitap arada veya başta ise yapılacaklar:
				for (int i = silinecekKitapIndex; i < kitapIndex; i++) {
					kitaplar[i] = kitaplar[i + 1];
				}
				kitaplar[kitapIndex - 1] = null;
				kitapSayisi--;
				kitapIndex--;
				System.out.println(silinecekKitap.getAd() + " adlı kitap silindi.");
				return;
			}
		}
		
		if(silinecekKitap.getStok()>1){
			silinecekKitap.setStok(silinecekKitap.getStok()-1);
			silinecekKitap.setAdet(silinecekKitap.getAdet()-1);
			System.out.println(silinecekKitap.getAd()+" adlı kitap adeti 1 azaltıldı. ");
		}
		
	}
	
	
	
	//uyeSil, uye üzerinde kitap varsa silinimez
	
	
	// uyedekiKitaplar: teslimTarihi null olan ödünç listesinde ödünçlerin içinde uye bilgisinin tc'si aranan tc ile
	// eşleşiyorsa o oduncteki kitap bilgisi yazdırılacak.
	
	//uyeninOduncAldığıTümKitaplar:ödünç listesinde ödünçlerin içinde uye bilgisinin tc'si aranan tc ile
	//	// eşleşiyorsa o oduncteki kitap bilgisi yazdırılacak.
	
	
	
	
	
	
	
	//Metodlar:
	/*
	
	kitapAra(kitapAdı) geriye Kitap[] dönsün.
	
	uyeAra(uyeAD) geriye Uye[]
	 ,
	uyedekiKitaplar, uyeninOduncAldığıTümKitaplar
	 */

}