package odev.atm;

public class BireyselMusteri extends Musteri{
String evAdresi;

public BireyselMusteri( ) {
	super();
	 
} 

public BireyselMusteri(String tcNo, String adSoyad, double hesapBakiyesi, String musteriNo, String evAdresi) {
	super(tcNo, adSoyad, hesapBakiyesi, musteriNo);
	this.evAdresi = evAdresi;
}

public String getEvAdresi() {
	return evAdresi;
}

public void setEvAdresi(String evAdresi) {
	this.evAdresi = evAdresi;
}

 
}
