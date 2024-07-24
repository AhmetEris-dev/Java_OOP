package com.ahmete._08_Polymorphism;

public class RunnerBakici {
	public static void main(String[] args) {
		Kedi tekir=new Kedi("Tekir",60,4);
		Kopek karabas=new Kopek("Karabaş",110,20);
		Kus boncuk=new Kus("Boncuk",20,1);
		
		Bakici bakici=new Bakici();
		bakici.hayvanKonustur(tekir,3);
		bakici.hayvanKonustur(karabas,5);
		bakici.hayvanKonustur(boncuk,2);
	}
}