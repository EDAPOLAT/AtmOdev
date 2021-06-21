package odev.atm;

public class KurumsalMusteri extends Musteri{

	private String sirketİsmi;

	public KurumsalMusteri() {
		super();
	}

	 

	public KurumsalMusteri(String tcNo, String adSoyad, double hesapBakiyesi, String musteriNo, String sirketİsmi) {
		super(tcNo, adSoyad, hesapBakiyesi, musteriNo);
		this.sirketİsmi = sirketİsmi;
	}



	public String getSirketİsmi() {
		return sirketİsmi;
	}

	public void setSirketİsmi(String sirketİsmi) {
		this.sirketİsmi = sirketİsmi;
	}

	 

	 
}
