package com.gen;

public class Calisanlar extends Insan {

	protected String meslek;
	protected String sirket;
	protected int netmaas;
	
	public Calisanlar(String adi, String soyadi, int dyili, int yas,String meslek,
	String sirket,int netmaas) {
		super(adi, soyadi, dyili, yas);
		this.meslek=meslek;
		this.netmaas=netmaas;
		this.sirket=sirket;
		
		
	}

	public String getMeslek() {
		return meslek;
	}

	public void setMeslek(String meslek) {
		this.meslek = meslek;
	}

	public String getSirket() {
		return sirket;
	}

	public void setSirket(String sirket) {
		this.sirket = sirket;
	}

	public int getNetmaas() {
		return netmaas;
	}

	public void setNetmaas(int netmaas) {
		this.netmaas = netmaas;
	}
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+"Meslek:"+" "+getMeslek()+" "+"Şirket"+" "+getSirket()+" "+"Net maaş:"+" " +getNetmaas();
}
}
