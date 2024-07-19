package com.ahmete._02_Constructor;

public class ArabaMain {
	public static void main(String[] args) {
		
		//Araba araba = new Araba(); // new Araba(): bu kısımdaki Araba() ifadesi default constructor çağrımıdır. Bu
		// sayede nesne üretilmiştir.
		Araba araba1=new Araba(50,40000,"mrk1","mod1","2020");
		
		System.out.println("Bu mesaj beyaz renk?");
		System.out.println("\u001B[36mBu mesaj kırmızı renk?\u001B[0m");
		System.out.println("2. satır");
		/**
		 * Console ekranı için renk kodlarıdır:
		 * Siyah: \u001B[30m
		 * Kırmızı: \u001B[31m
		 * Yeşil: \u001B[32m
		 * Sarı: \u001B[33m
		 * Mavi: \u001B[34m
		 * Mor: \u001B[35m
		 * Camgöbeği: \u001B[36m
		 * Beyaz: \u001B[37m
		 * Renk sıfırlamak için: \u001B[0m
		 */
	}
}