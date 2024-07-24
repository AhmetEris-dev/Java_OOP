package com.ahmete._08_Polymorphism;

public class Runner {
	public static void main(String[] args) {
		Kedi tekir=new Kedi("Tekir",60,4);
		tekir.sesCikar();
		
		Kopek karabas=new Kopek("Karabaş",110,20);
		karabas.sesCikar();
		
		Hayvan h1=new Kedi("Sarman",65,5);
		h1.sesCikar();
	}
	
}