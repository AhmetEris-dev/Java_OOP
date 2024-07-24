package com.ahmete._11_AbstractClass.entities;

import com.ahmete._11_AbstractClass.services.Personel;

public class Mutemet {
//	public void maasHesapla(Mudur mudur){
//		System.out.println("mudurun maaşı: "+mudur.getMaas()*mudur.getMaasKatSayisi());
//	}
//	public void maasHesapla(Muhendis muhendis){
//		System.out.println("muhendis maaşı: "+muhendis.getMaas()*muhendis.getMaasKatSayisi());
//
//	}
//	public void maasHesapla(Muhasebeci muhasebeci){
//		System.out.println("muhasebeci maaşı: "+muhasebeci.getMaas()*muhasebeci.getMaasKatSayisi());
//
//	}public void maasHesapla(Hizmetli hizmetli){
//		System.out.println("hizmetli maaşı: "+hizmetli.getMaas()*hizmetli.getMaasKatSayisi());
//
//	}

	public void maasHesapla(Personel personel){
		System.out.println(personel.ad+" maaşı: "+personel.getMaas()*personel.getMaasKatSayisi());
	}

}