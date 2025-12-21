public class AlistirmaSorulari_12 {
    public static void main(String[] args) {

        int[][] matris1 = {{-1, 2, -3}, {4, -5, 6}};
        int toplam1 = 0;
        for (int[] satir : matris1) {
            for (int x : satir) if (x < 0) toplam1 += x;
        }
        System.out.println(toplam1);
        System.out.println("----------");

        int[][] matris2 = {{1, 2, 3}, {4, 5, 6}};
        int toplam2 = 0;
        for (int[] satir : matris2) {
            for (int x : satir) if (x % 2 != 0) toplam2 += x;
        }
        System.out.println(toplam2);
        System.out.println("----------");

        int[][] matris3 = {{1, 2}, {3, 4}};
        int toplam3 = 0, adet3 = 0;
        for (int[] satir : matris3) {
            for (int x : satir) {
                toplam3 += x;
                adet3++;
            }
        }
        System.out.println((double) toplam3 / adet3);
        System.out.println("----------");

        int[][] matris4 = {{1, 2, 3}, {4, 5, 6}};
        int adet4 = 0;
        for (int[] satir : matris4) {
            for (int x : satir) if (x % 2 == 0) adet4++;
        }
        System.out.println(adet4);
        System.out.println("----------");

        int[][] matris5 = {{10, 25, 15}, {30, 5, 20}};
        int max5 = matris5[0][0];
        for (int[] satir : matris5) {
            for (int x : satir) if (x > max5) max5 = x;
        }
        System.out.println(max5);
        System.out.println("----------");

        int[][] matris6 = {{1, 2}, {3, 4}};
        int aranan6 = 3;
        boolean varMi6 = false;
        for (int i = 0; i < matris6.length; i++) {
            for (int j = 0; j < matris6[i].length; j++) {
                if (matris6[i][j] == aranan6) {
                    System.out.println(i + "," + j);
                    varMi6 = true;
                    break;
                }
            }
        }
        if (!varMi6) System.out.println("Aranan değer yoktur");
        System.out.println("----------");

        int[][] matris7 = {{1, 2, 1}, {1, 3, 1}};
        int aranan7 = 1, sayac7 = 0;
        for (int[] satir : matris7) {
            for (int x : satir) if (x == aranan7) sayac7++;
        }
        System.out.println(sayac7);
        System.out.println("----------");

        int[][] matris8 = {{1, 2, 3}, {4, 5, 6}};
        for (int j = 0; j < matris8[0].length; j++) {
            int sutunToplam = 0;
            for (int i = 0; i < matris8.length; i++) {
                sutunToplam += matris8[i][j];
            }
            System.out.print(sutunToplam + " ");
        }
        System.out.println();
        System.out.println("----------");

        int[][] matris9 = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < matris9.length; i++) {
            int satirToplam = 0;
            for (int j = 0; j < matris9[i].length; j++) {
                satirToplam += matris9[i][j];
            }
            System.out.print(satirToplam + " ");
        }
        System.out.println();
        System.out.println("----------");

        int[][] matris10 = {{10, 20, 5}, {30, 15, 40}};
        for (int i = 0; i < matris10.length; i++) {
            int satirMax = matris10[i][0];
            for (int j = 0; j < matris10[i].length; j++) {
                if (matris10[i][j] > satirMax) satirMax = matris10[i][j];
            }
            System.out.print(satirMax + " ");
        }
        System.out.println();
        System.out.println("----------");

        int[][] matris11 = {{10, 20, 5}, {30, 15, 40}};
        for (int j = 0; j < matris11[0].length; j++) {
            int sutunMin = matris11[0][j];
            for (int i = 0; i < matris11.length; i++) {
                if (matris11[i][j] < sutunMin) sutunMin = matris11[i][j];
            }
            System.out.print(sutunMin + " ");
        }
        System.out.println();
        System.out.println("----------");
    }
}