package com.ahmete._11_AbstractClass.entities;

import com.ahmete._11_AbstractClass.services.Yonetici;

// mudur sınıfından nesne oluşturulurken ilk önce mudur sınıfının miras aldıgı personel sıfınından bir nesne ooluşur
public  class Mudur extends Yonetici {
	// nesne değişkenleri
	// nesne değişkenlerinin erişim belirleyicisi: default
	// default: aynı package içindeki classlardan erişim sağlanabilir
	// farklı package içindeki classlardan erişilemez
	
	
	public String mudurlukDerecesi;
	public String departman;
	
	public Mudur(String ad) {
		
		super(ad);
	}
	
	@Override
	public int getMaasKatSayisi() {
		return 5;
	}
}