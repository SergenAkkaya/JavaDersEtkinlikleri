public class AlistirmaSorulari_5 {
    public static void main(String[] args) {
        int terimSayisi = 15;

        double toplamA = 0;
        double paydaA = 1;
        for (int i = 0; i < terimSayisi; i++) {
            toplamA += 1.0 / paydaA;
            paydaA *= 3;
        }
        System.out.println(toplamA);
        System.out.println("----------");

        double toplamB = 0;
        double paydaB = 1;
        for (int i = 0; i < terimSayisi; i++) {
            toplamB += 7.0 / paydaB;
            paydaB *= 3;
        }
        System.out.println(toplamB);
        System.out.println("----------");

        double toplamC = 0;
        double payC = 1;
        double paydaC = 1;
        for (int i = 0; i < terimSayisi; i++) {
            toplamC += payC / paydaC;
            payC *= 2;
            paydaC *= 3;
        }
        System.out.println(toplamC);
        System.out.println("----------");

        double toplamD = 0;
        double paydaD = 1;
        for (int i = 0; i < terimSayisi; i++) {
            double terim = 1.0 / paydaD;
            if (i % 2 == 1) toplamD -= terim;
            else toplamD += terim;
            paydaD *= 2;
        }
        System.out.println(toplamD);
        System.out.println("----------");

        double toplamE = 0;
        double payE = 1;
        double paydaE = 1;
        for (int i = 0; i < terimSayisi; i++) {
            double terim = payE / paydaE;
            if (i % 2 == 1) toplamE -= terim;
            else toplamE += terim;
            payE *= 2;
            paydaE *= 3;
        }
        System.out.println(toplamE);
        System.out.println("----------");

        double toplamF = 0;
        double paydaF_Kuvvet = 1;
        for (int i = 1; i <= terimSayisi; i++) {
            if (i <= 3) {
                toplamF += 1.0 / (i + 1);
            } else {
                toplamF += 1.0 / paydaF_Kuvvet;
                paydaF_Kuvvet *= 3;
            }
        }
        System.out.println(toplamF);
        System.out.println("----------");
        int N1 = 5;
        for (int i = 1; i <= N1; i++) {
            for (int j = 1; j <= i; j++) System.out.print(2 * i - 1);
            System.out.println();
        }
        System.out.println("----------");

        int N2 = 5;
        for (int i = 0; i < N2; i++) {
            for (int j = 0; j <= N2 - i; j++) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println("----------");

        int N3 = 5;
        for (int i = 1; i <= N3; i++) {
            for (int j = i; j >= 1; j--) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println("----------");

        int N4 = 5;
        for (int i = 1; i <= N4; i++) {
            for (int j = 1; j <= i; j++) System.out.print(i * j + " ");
            System.out.println();
        }
        System.out.println("----------");

        int N5 = 5;
        for (int i = 1; i <= N5; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j % 2 + " ");
            System.out.println();
        }
        System.out.println("----------");

        int N6 = 5;
        int sayac6 = 1;
        for (int i = 1; i <= N6; i++) {
            for (int j = 1; j <= i; j++) System.out.print(sayac6++ + " ");
            System.out.println();
        }
        System.out.println("----------");

        int N7 = 5;
        for (int i = 1; i <= N7; i++) {
            for (int j = 1; j <= N7; j++) System.out.print(i + " ");
            System.out.println();
        }
        System.out.println("----------");

        int N8 = 5;
        for (int i = 0; i < N8; i++) {
            int sayi = (int) Math.pow(2, i);
            for (int j = 0; j <= i; j++) {
                System.out.print(sayi + " ");
                sayi /= 2;
            }
            System.out.println();
        }
        System.out.println("----------");

        int N9 = 5;
        for (int i = 0; i < N9; i++) {
            for (int j = 0; j <= i; j++) System.out.print(10 - 2 * j + " ");
            System.out.println();
        }
        System.out.println("----------");

        int N10 = 5;
        for (int i = 0; i < N10; i++) {
            for (int j = 0; j <= i; j++) System.out.print(i * j + " ");
            System.out.println();
        }
        System.out.println("----------");

        int N11 = 5;
        for (int i = 1; i <= N11; i++) {
            for (int j = i; j <= N11; j++) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println("----------");

        int N12 = 5;
        for (int i = N12; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print((N12 - i + j + 4) + " ");
            System.out.println();
        }
        System.out.println("----------");    }
}