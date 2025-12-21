public class AlistirmaSorulari_7 {
    public static void main(String[] args) {
        System.out.println(kupAl(3));
        System.out.println("----------");

        System.out.println(enBuyuguBul(10, 25, 15));
        System.out.println("----------");

        System.out.println(toplamHesapla(5));
        System.out.println("----------");

        System.out.println(ustAl(2, 5));
        System.out.println("----------");

        System.out.println(yuvarlamaIcinGereken(34));
        System.out.println("----------");

        System.out.println(obebBul(12, 18));
        System.out.println("----------");

        System.out.println(okekBul(12, 18));
        System.out.println("----------");

        System.out.println(asalMi(17));
        System.out.println("----------");

        System.out.println(rakamlarToplami(1234));
        System.out.println("----------");

        System.out.println(hesapMakinesi(5, 7, '-'));
        System.out.println("----------");
    }

    public static int kupAl(int sayi) {
        return sayi * sayi * sayi;
    }

    public static int enBuyuguBul(int s1, int s2, int s3) {
        int enb = s1;
        if (s2 > enb) enb = s2;
        if (s3 > enb) enb = s3;
        return enb;
    }

    public static int toplamHesapla(int n) {
        int toplam = 0;
        for (int i = 1; i <= n; i++) toplam += i;
        return toplam;
    }

    public static int ustAl(int a, int b) {
        int sonuc = 1;
        for (int i = 0; i < b; i++) sonuc *= a;
        return sonuc;
    }

    public static int yuvarlamaIcinGereken(int sayi) {
        int sonrakiYuzluk = ((sayi / 100) + 1) * 100;
        return sonrakiYuzluk - sayi;
    }

    public static int obebBul(int s1, int s2) {
        while (s2 != 0) {
            int temp = s2;
            s2 = s1 % s2;
            s1 = temp;
        }
        return s1;
    }

    public static int okekBul(int s1, int s2) {
        return (s1 * s2) / obebBul(s1, s2);
    }

    public static boolean asalMi(int sayi) {
        if (sayi < 2) return false;
        for (int i = 2; i <= sayi / 2; i++) {
            if (sayi % i == 0) return false;
        }
        return true;
    }

    public static int rakamlarToplami(int sayi) {
        int toplam = 0;
        while (sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        return toplam;
    }

    public static double hesapMakinesi(double s1, double s2, char op) {
        if (op == '+') return s1 + s2;
        if (op == '-') return s1 - s2;
        if (op == '*') return s1 * s2;
        if (op == '/') return s1 / s2;
        return 0;
    }
}