import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class hafta15 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        /*
         * System.out.print("Bir cümle giriniz :");
         * String yazi = input.nextLine();
         * String yazilar [] = yazi.split(" ");
         * FileWriter yazici = new FileWriter("deneme.txt", false);
         * 
         * for (int i = 0; i < yazilar.length; i++) {
         * yazici.write(yazilar[i]+ "\n" );
         * }
         * yazici.close();
         */
        /*
         * File dosya = new File("deneme.txt");
         * Scanner okuyucu =new Scanner(dosya);
         * System.out.print("Harf Giriniz : ");
         * String harf = input.nextLine();
         * int sayac = 0;
         * 
         * 
         * while(okuyucu.hasNextLine()){
         * String satir = okuyucu.nextLine();
         * for (int i = 0; i < satir.length(); i++) {
         * if (satir.charAt(i) == harf.charAt(0)) {
         * sayac++;
         * }
         * }
         * }
         * FileWriter yazici = new FileWriter("sonuc.txt", false);
         * yazici.write("Girilen harf dosyada " + sayac + " kere geçiyor.");
         * yazici.close();
         * okuyucu.close();
         * input.close();
         * System.out.println(">>>Sonuç dosyasına eklendi.");
         * 
         */
        /*
         * File dosya = new File("sayilar.txt");
         * Scanner okuyucu = new Scanner(dosya);
         * int toplam = 0;
         * int sayac =0;
         * 
         * while(okuyucu.hasNextInt()){
         * int sayi = okuyucu.nextInt();
         * toplam += sayi;
         * System.out.println(sayi);
         * sayac++;
         * }
         * okuyucu.close();
         * System.out.println("Toplam : " + toplam);
         * System.out.println("Sayı Adedi : " + sayac);
         * double ortalama = toplam / sayac ;
         * System.out.println("Ortalama : "+ ortalama);
         */

        File dosya = new File("sayilar.txt");
        Scanner okuyucu = new Scanner(dosya);

        int maks=okuyucu.nextInt();
        while (okuyucu.hasNextInt()) {
            int sayi = okuyucu.nextInt();
            if(sayi > maks){
                maks = sayi;
            }
        }

        FileWriter yazici = new FileWriter("sonuc.txt", false);
        yazici.write("Girilen max:"+ maks);

        yazici.close();
        okuyucu.close();
    }
}