package com.ahmete._07_inheritance._03_inheritance;

import com.ahmete._07_inheritance._03_inheritance.entities.*;
public class Runner2 {
	public static void main(String[] args) {
		Mudur mudur1=new Mudur("mudur1");
		Muhendis muhendis1=new Muhendis("muhendis1","555",4);
		Muhasebeci muhasebeci1=new Muhasebeci("muhasebeci1");
		Hizmetli hizmetli1=new Hizmetli("hizmetli");
		
		Mutemet mutemet1=new Mutemet();
		mutemet1.maasHesapla(mudur1);
		mutemet1.maasHesapla(muhasebeci1);
		mutemet1.maasHesapla(muhendis1);
		mutemet1.maasHesapla(hizmetli1);
		
		
		Muhendis muhendis2=new Muhendis("muhendis1","555",4);
		muhendis2.setMaas(20000);
		
		mutemet1.maasHesapla(muhendis2);
	}
}