package odev.atm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 
import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) {
		  Musteri musteri=new Musteri();
		  KurumsalMusteri kurumsalMusteri=new KurumsalMusteri();
		  kurumsalMusteri.setMusteriNo("1234");
		  kurumsalMusteri.setTcNo("11111111111");
		  kurumsalMusteri.setAdSoyad("Eda Polat ");
		  kurumsalMusteri.setSirket�smi("Eda Holding");
		  kurumsalMusteri.setHesapBakiyesi(11000);
		  KurumsalMusteri kMusteri1=new KurumsalMusteri("44444444","33333333333",500000,"Asl� Kara","Asl� Holding");
		 
		  BireyselMusteri bireyselMusteri=new BireyselMusteri();
		  bireyselMusteri.setMusteriNo("12121212");
		  bireyselMusteri.setTcNo("22222222222");
		  bireyselMusteri.setAdSoyad("�nci T�rkmen");
		  bireyselMusteri.setEvAdresi("Adana-Merkez");
		  bireyselMusteri.setHesapBakiyesi(5000);
		  
		  BireyselMusteri bireyselMusteri1=new BireyselMusteri("23232323","33333333333",500000,"�znur Polat","Sivas -Merkez");
		  BireyselMusteri bireyselMusteri2=new BireyselMusteri("24242424","44444444444",500000,"Nesli�ah Do�an","�zmir -�e�me");
		   
		  HesapIslemleriManager hesapIslemleriManager=new HesapIslemleriManager(  );

		  
		 
		   Map<String,Musteri> musteriler=new HashMap<>();
		   musteriler.put("1234", musteri);
		   musteriler.put("12121212", musteri);
		   musteriler.put("44444444", musteri);
		   musteriler.put("23232323", musteri);
		   musteriler.put("24242424", musteri);


		   Scanner input = new Scanner(System.in); 
	       System.out.print("M��teri numaran�z� giriniz ");
	       String musteriNo = input.nextLine(); 
	        
		   for(Map.Entry musteriBanka:musteriler.entrySet())
		   {  if(musteriBanka.getKey().equals(musteriNo)) {
			   System.out.println( musteriBanka.getKey()+" "+"M��teri Numaras�na Sahip Kullan�c� Bilgileri  " );
			    
			   if(kurumsalMusteri.getMusteriNo().equals(musteriNo)){
				   System.out.println("TC Kimlik No:"+kurumsalMusteri.getTcNo()+" "+" Ad Soyad:"+kurumsalMusteri.getAdSoyad()+" "+
						   kurumsalMusteri.getSirketIsmi()+" "+"Hesap Bakiyesi"+kurumsalMusteri.getHesapBakiyesi());
				   System.out.print("Para Yat�rma ��lemi i�in 1 de�erini , Para �ekme ��lemi i�in 2 de�erini ekrana giriniz:  ");
			       int islemNo = input.nextInt(); 
			      if(islemNo==1) {
			    	  System.out.println("Yat�rmak istedi�iniz para miktar�n� giriniz:");
			    	  double paraMiktar� = input.nextDouble(); 
			    	   hesapIslemleriManager.paraYatirma(kurumsalMusteri,paraMiktar�);
			      }
			      else if(islemNo==2) {
			    	  System.out.println("�ekmek istedi�iniz para miktar�n� giriniz:");
			    	  double paraMiktari = input.nextDouble(); 
			    	   hesapIslemleriManager.paraCekme(kurumsalMusteri,paraMiktari);
			      }
				   
				    
			   } else if(bireyselMusteri.getMusteriNo().equals(musteriNo)) {
				   System.out.println("TC Kimlik No:"+bireyselMusteri.getTcNo()+" "+" Ad Soyad:"+bireyselMusteri.getAdSoyad()+" "+
						   bireyselMusteri.getEvAdresi()+" "+"Hesap Bakiyesi"+bireyselMusteri.getHesapBakiyesi());
				   System.out.print("Para Yat�rma ��lemi i�in 1 de�erini , Para �ekme ��lemi i�in 2 de�erini ekrana giriniz:  ");
			       int islemNo = input.nextInt(); 
			      if(islemNo==1) {
			    	  System.out.println("Yat�rmak istedi�iniz para miktar�n� giriniz:");
			    	  double paraMiktar� = input.nextDouble(); 
			    	   hesapIslemleriManager.paraYatirma(bireyselMusteri,paraMiktar�);
			      }
			      else if(islemNo==2) {
			    	  System.out.println("�ekmek istedi�iniz para miktar�n� giriniz:");
			    	  double paraMiktari = input.nextDouble(); 
			    	   hesapIslemleriManager.paraCekme(bireyselMusteri,paraMiktari);
			      }
			   }
			     
		 }
	}
		 
	}
 }
 
