package com.gen;

public class TabanMaas extends Calisanlar {

	public TabanMaas(String adi, String soyadi, int dyili, int yas,
			String meslek, String sirket, int netmaas) {
		super(adi, soyadi, dyili, yas, meslek, sirket, netmaas);
		
	}
	
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+" "+"Net maaş:"+netmaas;
	}



}
