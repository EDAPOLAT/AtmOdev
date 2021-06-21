package odev.atm;

public class KurumsalMusteri extends Musteri{

	private String sirket�smi;

	public KurumsalMusteri() {
		super();
	}

	 

	public KurumsalMusteri(String tcNo, String adSoyad, double hesapBakiyesi, String musteriNo, String sirket�smi) {
		super(tcNo, adSoyad, hesapBakiyesi, musteriNo);
		this.sirket�smi = sirket�smi;
	}



	public String getSirket�smi() {
		return sirket�smi;
	}

	public void setSirket�smi(String sirket�smi) {
		this.sirket�smi = sirket�smi;
	}

	 

	 
}
