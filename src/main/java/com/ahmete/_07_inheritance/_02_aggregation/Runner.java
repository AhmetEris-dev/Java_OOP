package com.ahmete._07_inheritance._02_aggregation;

public class Runner {
	public static void main(String[] args) {
		
		Motor motor1 = new Motor("benzinli");
		Araba araba = new Araba("bmw", motor1);
		araba.arabaBilgisi();
	}
	
}