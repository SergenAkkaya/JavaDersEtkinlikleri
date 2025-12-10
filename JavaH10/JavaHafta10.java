import java.util.Scanner;

public class JavaHafta10 {
    public static void main(String[] args) {
        int [] sayilar = {10,20,30,40,50,60};
        String [] isimler = {"ahmet","mehmet","kamil","mal emin"};
        char [] karakterler={'a','b','c','d'};
        double [] VirgulluS={12.2,4.5,10.5,23.5};



        System.out.println(sayilar[0]);
        System.out.println(sayilar[1]);
        System.out.println(sayilar[2]);
        System.out.println(sayilar[3]);
        System.out.println(sayilar[4]);
        System.out.println(sayilar[5]);

        System.out.println("-------------------");
        sayilar[2]=12;

        System.out.println(sayilar[2]+"Yeni değer");

        System.out.println("-------------------");

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

        System.out.println("-------------------");

        for (int i = sayilar.length-1; i > 0; i--) {
            System.out.println(sayilar[i]);
        }

        System.out.println("-------------------");


        int [] dizi = new int[10];

        dizi[0]=3;
        dizi[1]=2;
        
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }

        System.out.println("-------------------");

        int [] toplamlar= {10,12,23,23,21,12,123,4};
        int toplam=0;
        for (int i = 0; i < toplamlar.length; i++) {
            toplam+=toplamlar[i];
        }

        System.out.println("Toplam : "+ toplam);
        System.out.println("-------------------");

        toplam=0;
        for (int i = 0; i < toplamlar.length; i++) {
            if(toplamlar[i]%2==1){
                toplam+=toplamlar[i];
            }
        }
        System.out.println("Tekler :" + toplam);
        System.out.println("-------------------");

        toplam=0;
        int sayac=0;
        for (int i = 0; i < toplamlar.length; i++) {
            if(toplamlar[i]%2==1){
                toplam+=toplamlar[i];
                sayac++;
            }
        }
        toplam= toplam/sayac;
        System.out.println("Ortalaması: "+ toplam);
        System.out.println("-------------------");


        toplam=0;
        sayac=0;
        for (int i = 0; i < toplamlar.length; i++) {
            if(toplamlar[i]<0){
                sayac++;
            }
        }
        System.out.println("Negatif Adedi: "+ sayac);
        System.out.println("-------------------");

        Scanner input = new Scanner(System.in);

        int [] KullaniciDegerleri = new int[10];
        toplam=0;
        for (int i = 0; i < KullaniciDegerleri.length; i++) {
            System.out.print("Sayi Giriniz: ");
            KullaniciDegerleri[i] = input.nextInt();
            toplam+=KullaniciDegerleri[i];

        }
        System.out.println();
        toplam= toplam/ KullaniciDegerleri.length;
        System.out.println("Kullanıcı dizisi ortalaması: "+ toplam);
        System.out.println("-------------------");

        System.out.print("Kaç isim gireceksiniz:");
        int isimAdet = input.nextInt();

        String [] KullaniciIsimleri = new String[isimAdet];

        input.nextLine();

        for (int i = 0; i < KullaniciIsimleri.length; i++) {
            System.out.print("İsim Giriniz: ");
            KullaniciIsimleri[i] = input.nextLine();
        }
        for (int i = 0; i < KullaniciIsimleri.length; i++) {
            System.out.println();
            System.out.print("--- "+KullaniciIsimleri[i]);
        }
        System.out.println();
        System.out.println("-------------------");

        

    }
}