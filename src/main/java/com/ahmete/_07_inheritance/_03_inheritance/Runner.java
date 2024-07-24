package com.ahmete._07_inheritance._03_inheritance;

import com.ahmete._07_inheritance._03_inheritance.entities.*;
import com.ahmete._07_inheritance._03_inheritance.services.Personel;
import com.ahmete._07_inheritance._03_inheritance.services.Yonetici;

// * işareti entities package altındaki bütün sınıfları import etmeyi sağlar
public class Runner {
	public static void main(String[] args) {
//		Mudur mudur1=new Mudur();
//		Muhendis muhendis1=new Muhendis();
//		Muhasebeci muhasebeci1=new Muhasebeci();
//		Hizmetli hizmetli=new Hizmetli();
//
//		System.out.println(mudur1.ad);
		
//		Mudur mudur2=new Mudur("ayhan","555","1111","8888888888");
//		System.out.println(mudur2);
//
		Mudur mudur3=new Mudur("ahmet");
		Muhendis muhendis1=new Muhendis("ahmet","555",5);
		System.out.println(muhendis1);
		Muhasebeci muhasebeciAliBey=new Muhasebeci("ali bey");
		System.out.println(muhasebeciAliBey.getInfo());
		
		Personel personel1=new Personel("tekin");
		
		System.out.println(mudur3.yoneticiOzelligi);
		System.out.println(mudur3.ad);
		mudur3.yoneticiMetodu();
		// personel sınıfından nesne oluşturursan sadece personeldeki özellikleri kullanabilirsin.
		Personel personel2=new Personel("personel1-personel");
		personel2.ad="ali";
		Personel personel3=new Yonetici("personel2-yönetici");
		personel3.ad="mehmet";
		Personel personel4=new Mudur("personel3-mudur");
		// yönetici sınıfından nesne oluşturusan hem ust sınıfın özelliğine hemde yönetici sınıfı özelliklerine
		// ulaşabilirsin.
//		Yonetici yonetici1=new Yonetici("ahmet");
		isYap(personel2);
		isYap(personel3);
		
		
	}
	public static void isYap(Personel p){
		p.getInfo();
		System.out.println((p.ad+" iş yaptı."));
	}
	
}