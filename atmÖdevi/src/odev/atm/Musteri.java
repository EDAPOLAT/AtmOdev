package odev.atm;

public class Musteri {

    private String musteriNo;
	private String tcNo;
	private String adSoyad;  
	private double hesapBakiyesi; 
	
   public Musteri() {
		 
	}

	public Musteri(String tcNo, String adSoyad,   double hesapBakiyesi,String musteriNo) {
		super();
		this.tcNo = tcNo;
		this.adSoyad = adSoyad; 
		this.hesapBakiyesi = hesapBakiyesi;
		this.musteriNo=musteriNo;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	 
 

	public double getHesapBakiyesi() {
		return hesapBakiyesi;
	}

	public void setHesapBakiyesi(double hesapBakiyesi) {
		this.hesapBakiyesi = hesapBakiyesi;
	}

	public String getMusteriNo() {
		return musteriNo;
	}

	public void setMusteriNo(String musteriNo) {
		this.musteriNo = musteriNo;
	}
	
	
}
