package com.gen;

public class Main {
public static void main(String[] args) {
	Insan insan= new Insan("Tuğçe","Çokay",1234,20);
	Ogrenci ogrenci =new Ogrenci("Tuğçe","Çokay",1234,20,"Mühendislik","Bilgisayar","1",2012);
	Calisanlar calisan =new Calisanlar("Tuğçe","Çokay",1234,20,"Bilgisayarmüh","xyz",12345);
	TabanMaas taban=new TabanMaas("Tuğçe","Çokay",1234,20,"Bilgisayarmüh","xyz",12345);
	KomisyonluMaas komisyon=new KomisyonluMaas("Tuğçe","Çokay",1234,20,"Bilgisayarmüh","xyz",12345,10);
	
	System.out.println(insan.toString());
	System.out.println();
	System.out.println(ogrenci.toString());
	System.out.println(calisan.toString());
	System.out.println(taban.toString());
	System.out.println(komisyon.toString());
}
}
