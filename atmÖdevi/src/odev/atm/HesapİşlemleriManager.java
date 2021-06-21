package odev.atm;

public class HesapİşlemleriManager implements HesapİslemleriService {
  
 private double paraMiktarı;
 
   public HesapİşlemleriManager( ) {
	     
   }
   
	@Override
	public double paraYatırma(Musteri musteri,double paraMiktarı) {
		double result= (musteri.getHesapBakiyesi()+paraMiktarı);
		 System.out.println("Güncel Bakiyeniz:"+result);
		return result;
	}

	@Override
	public double paraÇekme(Musteri musteri,double paraMiktarı) {
		double result= (musteri.getHesapBakiyesi()-paraMiktarı);
		 System.out.println("Güncel Bakiyeniz:"+result);
		return result;
	}

}
