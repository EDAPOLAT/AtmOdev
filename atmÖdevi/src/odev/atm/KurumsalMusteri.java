package odev.atm;

public class KurumsalMusteri extends Musteri{

	private String sirketĘsmi;

	public KurumsalMusteri() {
		super();
	}

	 

	public KurumsalMusteri(String tcNo, String adSoyad, double hesapBakiyesi, String musteriNo, String sirketĘsmi) {
		super(tcNo, adSoyad, hesapBakiyesi, musteriNo);
		this.sirketĘsmi = sirketĘsmi;
	}



	public String getSirketĘsmi() {
		return sirketĘsmi;
	}

	public void setSirketĘsmi(String sirketĘsmi) {
		this.sirketĘsmi = sirketĘsmi;
	}

	 

	 
}
