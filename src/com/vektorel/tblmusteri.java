package com.vektorel;

public class tblmusteri {

	private int id;
	private String ad;
	private String soyad;
	private int yetki;
	
	
	//methodlari yazdiktan sonra bulunan ekrana sag tiklayip
	//Source --> Generate Getters and Setters --> Sag Ust kosede Select All dedikten sonra eclipse idesi kendi methodlari ekliyor.
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getYetki() {
		return yetki;
	}
	public void setYetki(int yetki) {
		this.yetki = yetki;
	}
	

	
}
