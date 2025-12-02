public class AlistirmaSorulari_6 {
    public static void main(String[] args) {
        int sayi = 9483589;
        int rakam = 0;
        while (sayi != 0) {
            rakam = sayi % 10;
            sayi /= 10;
        }
        System.out.println(rakam);
        System.out.println("-----------------------");
        int sayi2lik = 100100;
        int rakam2lik = 0;
        int toplam2lik = 0;
        int iki_ussu = 1;
        while (sayi2lik != 0) {
            rakam2lik = sayi2lik % 10;
            toplam2lik += iki_ussu * rakam2lik;
            sayi2lik /= 10;
            iki_ussu *= 2;
        }
        System.out.print(toplam2lik);
    }
}
