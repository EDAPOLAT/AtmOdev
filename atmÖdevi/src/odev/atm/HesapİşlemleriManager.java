package odev.atm;

public class Hesap��lemleriManager implements Hesap�slemleriService {
  
 private double paraMiktar�;
 
   public Hesap��lemleriManager( ) {
	     
   }
   
	@Override
	public double paraYat�rma(Musteri musteri,double paraMiktar�) {
		double result= (musteri.getHesapBakiyesi()+paraMiktar�);
		 System.out.println("G�ncel Bakiyeniz:"+result);
		return result;
	}

	@Override
	public double para�ekme(Musteri musteri,double paraMiktar�) {
		double result= (musteri.getHesapBakiyesi()-paraMiktar�);
		 System.out.println("G�ncel Bakiyeniz:"+result);
		return result;
	}

}
