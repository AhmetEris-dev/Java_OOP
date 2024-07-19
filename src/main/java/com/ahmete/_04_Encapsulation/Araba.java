package com.ahmete._04_Encapsulation;

public class Araba {
	private String marka;
	private String model;
	private String yil;
	private String renk;
	private int km;
	private int hiz;
	private Motor motor;
	
	public Araba() {
	}
	
	public Araba(int hiz, int km, String marka, String model, Motor motor, String renk, String yil) {
		this.hiz = hiz;
		this.km = km;
		this.marka = marka;
		this.model = model;
		this.motor = motor;
		this.renk = renk;
		this.yil = yil;
	}
	
	public int getHiz() {
		return hiz;
	}
	
	public int getKm() {
		return km;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public String getModel() {
		return model;
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	public String getRenk() {
		return renk;
	}
	
	public String getYil() {
		return yil;
	}
	
	public void setHiz(int hiz) {
		this.hiz = hiz;
	}
	
	public void setKm(int km) {
		this.km = km;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	public void setYil(String yil) {
		this.yil = yil;
	}
	
	@Override
	public String toString() {
		return "Araba{" + "hiz=" + getHiz() + ", marka='" + getMarka() + '\'' + ", model='" + getModel() + '\'' + ", yil='" + getYil() + '\'' + ", renk='" + getRenk() + '\'' + ", km=" + getKm() + ", motor=" + getMotor() + '}';
	}
}