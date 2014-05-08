package com.gen;

public class KomisyonluMaas extends Calisanlar {

	protected int satis;
	public KomisyonluMaas(String adi, String soyadi, int dyili, int yas,
			String meslek, String sirket, int netmaas,int satis) {
		super(adi, soyadi, dyili, yas, meslek, sirket, netmaas);
		this.satis=satis;
	}
	public int getSatis() {
		return satis;
	}
	public void setSatis(int satis) {
		this.satis = satis;
	}
	
@Override
	public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+"Satış komisyonu"+" "+getSatis()+" "+"Son maaş: "+" "+maashesapla(netmaas, satis);
	}
	public int maashesapla(int netmaas,int satis){
		return netmaas+((satis*20)/100);
	}
}
