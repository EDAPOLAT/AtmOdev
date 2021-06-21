package odev.atm;

public class KurumsalMusteri extends Musteri{

	private String sirketIsmi;

	public KurumsalMusteri() {
		super();
	}

	 

	public KurumsalMusteri(String tcNo, String adSoyad, double hesapBakiyesi, String musteriNo, String sirketIsmi) {
		super(tcNo, adSoyad, hesapBakiyesi, musteriNo);
		this.sirketIsmi = sirketIsmi;
	}



	public String getSirketIsmi() {
		return sirketIsmi;
	}

	public void setSirketĘsmi(String sirketIsmi) {
		this.sirketIsmi = sirketIsmi;
	}

	 

	 
}
