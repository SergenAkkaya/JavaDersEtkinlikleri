public class AlistirmaSorulari_11 {
    public static void main(String[] args) {

        int[] dizi1 = {3, 6, 9, 12, 15, 18, 20};
        int sayac1 = 0, toplam1 = 0;
        for (int x : dizi1) {
            if (x % 3 == 0 && x % 2 != 0) {
                toplam1 += x;
                sayac1++;
            }
        }
        System.out.println(sayac1 > 0 ? (double) toplam1 / sayac1 : 0);
        System.out.println("----------");

        int[] dizi2 = {5, 10, 15, 20};
        System.out.println(elemanVarMi(dizi2, 15));
        System.out.println("----------");

        int[] dizi3 = {5, 10, 15, 20, 15};
        System.out.println(indeksBul(dizi3, 15));
        System.out.println("----------");

        int[] dizi4 = {5, 10, 15, 20, 15};
        System.out.println(kacKezyeciyor(dizi4, 15));
        System.out.println("----------");

        int[] dizi5 = {2, 7, 12, 42, 12, 7, 2};
        System.out.println(isPalindrome(dizi5));
        System.out.println("----------");

        int[] dizi6 = {3, 8, 5, 8, 2, 8};
        int max6 = dizi6[0], tekrar6 = 0;
        for (int x : dizi6) {
            if (x > max6) {
                max6 = x;
                tekrar6 = 1;
            } else if (x == max6) {
                tekrar6++;
            }
        }
        System.out.println(tekrar6);
        System.out.println("----------");

        int[] dizi7 = {1, 3, 5, 7, 9};
        System.out.println(isSorted(dizi7));
        System.out.println("----------");

        int[] dizi8 = {2, 3, 4, 5, 6, 7, 8, 9};
        int toplam8 = 0, sayac8 = 0;
        for (int x : dizi8) {
            boolean asal = x > 1;
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) { asal = false; break; }
            }
            if (asal) {
                System.out.print(x + " ");
                toplam8 += x;
                sayac8++;
            }
        }
        System.out.println("\n" + (sayac8 > 0 ? (double) toplam8 / sayac8 : 0));
        System.out.println("----------");

        int[] dizi9 = {1, 3, 2, 3, 4, 3, 2, 1};
        int enCok9 = dizi9[0], maxSayac9 = 0;
        for (int i = 0; i < dizi9.length; i++) {
            int sayac = 0;
            for (int j = 0; j < dizi9.length; j++) {
                if (dizi9[i] == dizi9[j]) sayac++;
            }
            if (sayac > maxSayac9) {
                maxSayac9 = sayac;
                enCok9 = dizi9[i];
            }
        }
        System.out.println(enCok9);
        System.out.println("----------");

        int[] dizi10 = {3, 7, 2, 6, 4, 3, 8, 1};
        tekCiftAta(dizi10);
        for (int x : dizi10) System.out.print(x + " ");
        System.out.println();
        System.out.println("----------");

        int[] d11a = {1, 2, 3}, d11b = {1, 2, 3};
        System.out.println(dizilerAyniMi(d11a, d11b));
        System.out.println("----------");

        int[] d12a = {1, 2}, d12b = {3, 4, 5};
        int[] birlesik = diziBirlestir(d12a, d12b);
        for (int x : birlesik) System.out.print(x + " ");
        System.out.println();
        System.out.println("----------");

        int[] dizi13 = {10, 20, 20, 5, 15};
        int m1 = Integer.MIN_VALUE, m2 = Integer.MIN_VALUE;
        for (int x : dizi13) {
            if (x > m1) {
                m2 = m1;
                m1 = x;
            } else if (x > m2) {
                m2 = x;
            }
        }
        System.out.println(m2);
        System.out.println("----------");
    }

    public static boolean elemanVarMi(int[] d, int a) {
        for (int x : d) if (x == a) return true;
        return false;
    }

    public static int indeksBul(int[] d, int a) {
        for (int i = 0; i < d.length; i++) if (d[i] == a) return i;
        return -1;
    }

    public static int kacKezyeciyor(int[] d, int a) {
        int s = 0;
        for (int x : d) if (x == a) s++;
        return s;
    }

    public static boolean isPalindrome(int[] d) {
        for (int i = 0; i < d.length / 2; i++) {
            if (d[i] != d[d.length - 1 - i]) return false;
        }
        return true;
    }

    public static boolean isSorted(int[] d) {
        for (int i = 0; i < d.length - 1; i++) {
            if (d[i] > d[i + 1]) return false;
        }
        return true;
    }

    public static void tekCiftAta(int[] d) {
        for (int i = 0; i < d.length; i++) {
            d[i] = (d[i] % 2 != 0) ? 1 : 0;
        }
    }

    public static boolean dizilerAyniMi(int[] d1, int[] d2) {
        if (d1.length != d2.length) return false;
        for (int i = 0; i < d1.length; i++) {
            if (d1[i] != d2[i]) return false;
        }
        return true;
    }

    public static int[] diziBirlestir(int[] d1, int[] d2) {
        int[] yeni = new int[d1.length + d2.length];
        for (int i = 0; i < d1.length; i++) yeni[i] = d1[i];
        for (int i = 0; i < d2.length; i++) yeni[d1.length + i] = d2[i];
        return yeni;
    }
}