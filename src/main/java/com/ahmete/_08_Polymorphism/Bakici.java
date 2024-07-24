package com.ahmete._08_Polymorphism;

public class Bakici {
	public void hayvanKonustur(Hayvan hayvan,int konusmaSayisi){
		System.out.println("----hayvanKonusutur Metodu");
		for (int i = 0; i <konusmaSayisi ; i++) {
			hayvan.sesCikar();
		}
	}
}