package odev.atm;

public interface HesapIslemleriService {
  double paraYatırma(Musteri musteri,double paraMiktarı) ;
  double paraÇekme(Musteri musteri,double paraMiktarı);
}
