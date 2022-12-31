import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int mesafe , yas, yolculuk_tipi;
		double normal_tutar, indirimli_bilet, yas_indirimlibilet, gidisdönüs_indirimi, toplam_tutar = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gideceğiniz mesafeyi km cinsinden giriniz. ");
		mesafe = scanner.nextInt();
		
		
		System.out.println("Yaşınızı giriniz giriniz. ");
		yas = scanner.nextInt();
		
		System.out.println("Yolculuk_tipi tipinizi seçiniz (1--> tek yön  2-->gidisdönüs): ");
		yolculuk_tipi = scanner.nextInt();
		
		if(yas>0 && mesafe>0) {
			if(yas<12 && yolculuk_tipi==1) {
				normal_tutar = mesafe * (0.10);
				indirimli_bilet = normal_tutar*(0.50);
				yas_indirimlibilet= normal_tutar - indirimli_bilet;
				System.out.println("Toplam Tutar: " + yas_indirimlibilet); 
		
			}else if(yas<12 && yolculuk_tipi==2) {
				normal_tutar = mesafe * (0.10);
				indirimli_bilet = normal_tutar*(0.50);
				yas_indirimlibilet= normal_tutar - indirimli_bilet;
				gidisdönüs_indirimi = yas_indirimlibilet *(0.20);
				toplam_tutar = (normal_tutar-gidisdönüs_indirimi)*2;
				System.out.println("Toplam Tutar: " + gidisdönüs_indirimi); 
				
			}else if(yas>=12 && yas<24 && yolculuk_tipi==1) {
				normal_tutar = mesafe * (0.10);
				indirimli_bilet = normal_tutar*(0.10);
				toplam_tutar = normal_tutar-indirimli_bilet;
				System.out.println("Toplam tutar: " +toplam_tutar);
				
			}else if(yas>=12 && yas<24 && yolculuk_tipi==2) {
				normal_tutar = mesafe * (0.10);
				indirimli_bilet = normal_tutar*(0.10);
				gidisdönüs_indirimi = indirimli_bilet *(0.20);
				toplam_tutar = (normal_tutar-gidisdönüs_indirimi)*2;
				System.out.println("Toplam Tutar: " + toplam_tutar); 	
				
			}else if(yas>65 && yolculuk_tipi==1) {
				normal_tutar = mesafe * (0.10);
				indirimli_bilet = normal_tutar*(0.30);
				toplam_tutar=normal_tutar-indirimli_bilet;
				System.out.println("Toplam Tutar: " + toplam_tutar); 	
				
			}else if(yas>65 && yolculuk_tipi==2) {
				normal_tutar = mesafe * (0.10);
				indirimli_bilet = normal_tutar*(0.30);
				toplam_tutar = indirimli_bilet*2;
				System.out.println("Toplam Tutar: " + toplam_tutar); 	
			
		
			}else if(yas>=24 && yas<=65 && yolculuk_tipi==1) {
				toplam_tutar = mesafe * (0.10);
				System.out.println("Toplam Tutar: " + toplam_tutar); 	
				
			}else if(yas>=24 && yas<=65 && yolculuk_tipi==2) {
				normal_tutar = mesafe * (0.10);
				toplam_tutar = toplam_tutar*2;
				System.out.println("Toplam Tutar: " + toplam_tutar); 	
			}
			else {
				System.out.println("Hatalı veri verdiniz");
			}
	 
		}
	}
}
