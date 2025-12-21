public class AlistirmaSorulari_10 {
    public static void main(String[] args) {

        int[] dizi1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < dizi1.length; i++) {
            System.out.print((dizi1[i] * dizi1[i]) + " ");
        }
        System.out.println();
        System.out.println("----------");

        int[] dizi2 = {3, 7, 2, 6, 5, 8};
        for (int i = 0; i < dizi2.length; i++) {
            if (dizi2[i] % 2 != 0) dizi2[i] += 1;
            else dizi2[i] -= 2;
            System.out.print(dizi2[i] + " ");
        }
        System.out.println();
        System.out.println("----------");

        int[] dizi3 = {10, 5, 20, 8, 15};
        int max3 = dizi3[0], min3 = dizi3[0];
        for (int x : dizi3) {
            if (x > max3) max3 = x;
            if (x < min3) min3 = x;
        }
        System.out.println(max3 - min3);
        System.out.println("----------");

        int[] dizi4 = {3, 8, 15, 2, 10};
        int enBuyukFark4 = 0;
        for (int i = 0; i < dizi4.length - 1; i++) {
            int fark = Math.abs(dizi4[i] - dizi4[i+1]);
            if (fark > enBuyukFark4) enBuyukFark4 = fark;
        }
        System.out.println(enBuyukFark4);
        System.out.println("----------");

        double[] dizi5 = {1.5, 2.5, 3.5, 4.5, 5.5};
        double toplam5 = 0;
        for (double d : dizi5) toplam5 += d;
        double ort5 = toplam5 / dizi5.length;
        for (double d : dizi5) {
            if (d < ort5) System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("----------");

        int[] dizi6 = {-10, 5, 13, -2, 8};
        int yakin6 = dizi6[0];
        for (int x : dizi6) {
            if (Math.abs(x) < Math.abs(yakin6)) yakin6 = x;
        }
        System.out.println(yakin6);
        System.out.println("----------");

        int[] dizi7 = {1, 2, 2, 3, 4, 4, 5};
        for (int i = 0; i < dizi7.length; i++) {
            int sayac = 0;
            for (int j = 0; j < dizi7.length; j++) {
                if (dizi7[i] == dizi7[j]) sayac++;
            }
            if (sayac == 1) System.out.print(dizi7[i] + " ");
        }
        System.out.println();
        System.out.println("----------");

        int[] dizi8 = {5, 10, 15, 20};
        int aranan8 = 15;
        boolean varMi8 = false;
        for (int x : dizi8) {
            if (x == aranan8) {
                varMi8 = true;
                break;
            }
        }
        System.out.println(varMi8 ? "Aranan eleman dizide var" : "Aranan eleman dizide yok");
        System.out.println("----------");

        int[] dizi9 = {1, 2, 3, 2, 4, 2, 5};
        int aranan9 = 2, sayac9 = 0;
        for (int x : dizi9) {
            if (x == aranan9) sayac9++;
        }
        System.out.println(sayac9);
        System.out.println("----------");

        int[] dizi10 = {3, 6, 2, 2, 2, 2, 3, 3, 5, 5, 5};
        int maxTekrar10 = 1, suankiTekrar10 = 1, eleman10 = dizi10[0];
        for (int i = 0; i < dizi10.length - 1; i++) {
            if (dizi10[i] == dizi10[i+1]) suankiTekrar10++;
            else suankiTekrar10 = 1;
            if (suankiTekrar10 > maxTekrar10) {
                maxTekrar10 = suankiTekrar10;
                eleman10 = dizi10[i];
            }
        }
        System.out.println(eleman10 + " degeri " + maxTekrar10 + " kez");
        System.out.println("----------");

        int[] dizi11 = {3, 5, 7, 2, 1};
        for (int i = 0; i < dizi11.length / 2; i++) {
            int temp = dizi11[i];
            dizi11[i] = dizi11[dizi11.length - 1 - i];
            dizi11[dizi11.length - 1 - i] = temp;
        }
        for (int x : dizi11) System.out.print(x + " ");
        System.out.println();
        System.out.println("----------");

        int[] dizi12 = {5, 7, 2, 1, 0, 6};
        int son12 = dizi12[dizi12.length - 1];
        for (int i = dizi12.length - 1; i > 0; i--) {
            dizi12[i] = dizi12[i - 1];
        }
        dizi12[0] = son12;
        for (int x : dizi12) System.out.print(x + " ");
        System.out.println();
        System.out.println("----------");
    }
}