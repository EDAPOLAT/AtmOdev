package odev.atm;

public class HesapIslemleriManager implements HesapIslemleriService {
  
 private double paraMiktarı;
 
   public HesapIslemleriManager( ) {
	     
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
