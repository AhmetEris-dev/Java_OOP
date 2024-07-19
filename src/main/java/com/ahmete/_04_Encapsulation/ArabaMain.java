package com.ahmete._04_Encapsulation;

public class ArabaMain {
	public static void main(String[] args) {
		Araba araba = new Araba();
		Motor motor1 = new Motor();
		
		motor1.setMotorHacmi(1600);
		motor1.setBeygir(130);
		motor1.setTork(300);
		motor1.setSasiNo("AZWY1254");
		
		
		araba.setHiz(50);
		araba.setKm(10000);
		araba.setMarka("Hyundai");
		araba.setModel("ix35");
		araba.setRenk("Siyah");
		araba.setYil("2020");
		araba.setMotor(motor1);
		
		System.out.println(araba);
		
		
	}
}