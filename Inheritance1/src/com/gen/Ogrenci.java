package com.gen;

public class Ogrenci extends Insan {

	String fakulte;
	String sinif;
	String bolum;
	int donem;
	
	public String getFakulte() {
		return fakulte;
	}

	public void setFakulte(String fakulte) {
		this.fakulte = fakulte;
	}

	public String getSinif() {
		return sinif;
	}

	public void setSinif(String sinif) {
		this.sinif = sinif;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public int getDonem() {
		return donem;
	}

	public void setDonem(int donem) {
		this.donem = donem;
	}

	public Ogrenci(String adi, String soyadi, int dyili, int yas,String fakulte,
	String bolum,String sinif,int donem) {
		super(adi, soyadi, dyili, yas);
		this.fakulte=fakulte;
		this.bolum=bolum;
		this.donem=donem;
		this.sinif=sinif;
	}
	public void donemkabul(){
		System.out.println(+getDonem()+"Dönemi Öğrencisidir.");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Fakültesi"+" "+getFakulte()+" "+"Bölümü"+" "+getBolum()+" "+"Dönemi"+" "+getDonem();
	}
	
}
