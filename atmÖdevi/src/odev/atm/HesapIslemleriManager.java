package odev.atm;

public class HesapIslemleriManager implements HesapIslemleriService {
   
  
   
	@Override
	public double paraYatirma(Musteri musteri,double paraMiktari) {
		double result= (musteri.getHesapBakiyesi()+paraMiktari);
		 System.out.println("G�ncel Bakiyeniz:"+result);
		return result;
	}

	@Override
	public double paraCekme(Musteri musteri,double paraMiktari) {
		double result= (musteri.getHesapBakiyesi()-paraMiktari);
		 System.out.println("G�ncel Bakiyeniz:"+result);
		return result;
	}

}
