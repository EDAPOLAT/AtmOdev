package odev.atm;

public class HesapI�lemleriManager implements HesapIslemleriService {
  
 private double paraMiktar�;
 
   public HesapI�lemleriManager( ) {
	     
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
