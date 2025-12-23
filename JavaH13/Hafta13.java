public class Hafta13 {
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        int[][] matris = { 
                { -1, -2, 4 },
                { 12, 34, 6 },
                { 0, 1, 10 } };

        for (int i = 0; i < matris.length; i++) {
            int Max = matris[i][0];
            for (int j = 0; j < matris[i].length; j++) {
                if (matris[i][j] > Max) {
                    Max = matris[i][j];
                }
            }
            System.out.println((i + 1) + ". Satırda en büyük :" + Max);
        }
        System.out.println("-----------------------------");
        int toplam = 0;
        for (int i = 0; i < matris.length; i++) {
            toplam+=matris[i][i];
        }
        System.out.println("Köşe toplamı: " + toplam);
        System.out.println("-----------------------------");
        int toplam2 = 0;
        for (int i = 0; i < matris.length; i++) {
            toplam2+=matris[i][matris.length-1-i];
        }
        System.out.println("Köşe toplamı: " + toplam2);
        System.out.println("-----------------------------");

        int toplam3=0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if(j > i)
                toplam3+=matris[i][j];
            }
        }
        System.out.println("Ters Üçgen toplamı :" + toplam3);
        System.out.println("-----------------------------");

        function(matris);

        System.out.println("-----------------------------");

    }
    static void function (int[][] dizi){
        int i2 = 0 , j2=0;
        int Max = dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j] > Max) {
                    Max = dizi[i][j];
                    i2=i;
                    j2=j;
                }
            }
        }
        int[] sonuc={i2,j2};
        System.out.print("En büyük elemanın indeksi : ");
        for (int i : sonuc) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}