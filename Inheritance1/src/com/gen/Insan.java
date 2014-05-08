package com.gen;

public class Insan {

	protected String adi;
	protected String soyadi;
	protected int dyili;
	protected int yas;

	public Insan(String adi,String soyadi,int dyili,int yas){
	this.adi=adi;
	this.soyadi=soyadi;
	this.dyili=dyili;
	this.yas=yas;
}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getDyili() {
		return dyili;
	}

	public void setDyili(int dyili) {
		this.dyili = dyili;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Adı"+getAdi()+" "+"Soyadı"+getSoyadi()+" "+"Yaşı"+" "+getYas()+" "+"Doğum yılı"+" "+getDyili()+" "+"Yaşı"+" "+getYas();
	}

}
