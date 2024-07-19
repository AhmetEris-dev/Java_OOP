package com.ahmete._05_OtoGaleri;

public class OtoGaleri {
	// Nesne değişkenleri:
	private Araba[] arabalar;
	private int galeridekiArabaSayisi;
	private String ad;
	private String tel;
	private String yetkiliKisi;
	
	public OtoGaleri(int kapasite) {
		this.arabalar = new Araba[kapasite];
	}
	
	public void arabaEkle(Araba araba) {
		if (galeridekiArabaSayisi < arabalar.length) {
			arabalar[galeridekiArabaSayisi] = araba;
			galeridekiArabaSayisi++;
		}
		else {
			System.out.println("Galeri dolu. Araç eklenemedi.");
		}
	}
	
	public void arabaListele() {
		/*for (int i = 0; i < galeridekiArabaSayisi; i++) {
			System.out.println(arabalar[i]);
		}*/
		for (Araba araba : arabalar) {
			if (araba != null) {
				System.out.println(araba);
			}
		}
	}
	
	@Override
	public String toString() {
		return "OtoGaleri{" + "ad='" + getAd() + '\'' + ", galeridekiArabaSayisi=" + galeridekiArabaSayisi + ", tel='" + getTel() + '\'' + ", yetkiliKisi='" + getYetkiliKisi() + '\'' + '}';
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getYetkiliKisi() {
		return yetkiliKisi;
	}
	
	public void setYetkiliKisi(String yetkiliKisi) {
		this.yetkiliKisi = yetkiliKisi;
	}
}