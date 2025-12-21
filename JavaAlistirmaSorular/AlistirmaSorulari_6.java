public class AlistirmaSorulari_6 {
    public static void main(String[] args) {
        int N1 = 7;
        int i1 = N1;
        while (i1 >= 1) {
            System.out.print(i1 + (i1 > 1 ? ", " : ""));
            i1--;
        }
        System.out.println();
        System.out.println("----------");

        int baslangic2 = 6, bitis2 = 17, toplam2 = 0;
        int i2 = baslangic2;
        while (i2 <= bitis2) {
            if (i2 % 2 == 0) {
                toplam2 += i2;
                System.out.print(i2 + (i2 + 2 <= bitis2 ? " + " : ""));
            }
            i2++;
        }
        System.out.println(" = " + toplam2);
        System.out.println("----------");

        int sayi3 = 74923, enBuyuk3 = 0;
        int gecici3 = sayi3;
        while (gecici3 > 0) {
            int basamak = gecici3 % 10;
            if (basamak > enBuyuk3) enBuyuk3 = basamak;
            gecici3 /= 10;
        }
        System.out.println(enBuyuk3);
        System.out.println("----------");

        int binary4 = 100100, onluk4 = 0, us4 = 0;
        int gecici4 = binary4;
        while (gecici4 > 0) {
            int basamak = gecici4 % 10;
            int j4 = 0, kuvvet4 = 1;
            while (j4 < us4) {
                kuvvet4 *= 2;
                j4++;
            }
            onluk4 += basamak * kuvvet4;
            gecici4 /= 10;
            us4++;
        }
        System.out.println(onluk4);
        System.out.println("----------");

        int sayi5 = 17;
        boolean asalMi5 = true;
        int i5 = 2;
        if (sayi5 < 2) asalMi5 = false;
        while (i5 <= sayi5 / 2) {
            if (sayi5 % i5 == 0) {
                asalMi5 = false;
                break;
            }
            i5++;
        }
        System.out.println(asalMi5 ? "Asaldır" : "Asal Değildir");
        System.out.println("----------");

        int a6 = 4, b6 = 5, sonuc6 = 0;
        int i6 = 0;
        while (i6 < b6) {
            sonuc6 += a6;
            i6++;
        }
        System.out.println(sonuc6);
        System.out.println("----------");

        int a7 = 22, b7 = 4, bolum7 = 0;
        int gecici7 = a7;
        while (gecici7 >= b7) {
            gecici7 -= b7;
            bolum7++;
        }
        System.out.println(bolum7);
        System.out.println("----------");

        int a8 = 22, b8 = 4;
        int kalan8 = a8;
        while (kalan8 >= b8) {
            kalan8 -= b8;
        }
        System.out.println(kalan8);
        System.out.println("----------");
    }
}
