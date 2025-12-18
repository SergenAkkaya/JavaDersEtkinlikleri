import java.util.Scanner;

public class hafta11c {
    public static void main(String[] args) {
        /*int [] Ogrenci1 = {70,50,90};
        int [] Ogrenci2 = {90,30,80};
        int [] Ogrenci3 = {40,0,60};

        double progOrt=(Ogrenci1[0]+Ogrenci2[2]+Ogrenci3[0])/3.0;

        System.out.println(progOrt);
        int [][] notlar= {
            {70,50,90},
            {90,30,80},
            {40,0,60}
        };

        for (int [] dizi : notlar) {
            System.out.print("(");
            for (int eleman : dizi) {
                System.out.print( eleman +" " );
            }
            System.out.println(")");
        }

        // System.out.println("Boyut Sayısı : "+notlar.length);
        // System.out.println("1. Elemanın boyutu : " + notlar[0].length);
        // System.out.println("Notlar matrixin [2][2] " + notlar[2][2]);

        // for (int i = 0; i < notlar.length; i++) {
        //     System.out.print(i+ ". Satır { ");
        //     for (int j = 0; j < notlar[i].length; j++) {
        //         System.out.print(notlar[i][j] +" ");
        //     }
        //     System.out.println("}");
        // }

        int toplam=0;
        for (int [] in : notlar) {
            for (int is : in) {
                toplam+=is;
            }
        }
        System.out.println("Notların toplamları : "+ toplam);
        */
       int [][] matris = new int[3][2];
       
       Scanner input = new Scanner(System.in);

       
       for (int i = 0; i < matris.length; i++) {
        for (int j = 0; j < matris[i].length; j++) {
        System.out.print(i + ". boyutun " + j + ". Sayı giriniz: ");
            matris[i][j]=input.nextInt();
        }
       }
        for (int i = 0; i < matris.length; i++) {
           System.out.print(i+ ". Satır { ");
           for (int j = 0; j < matris[i].length; j++) {
                 System.out.print(matris[i][j] +" ");
              }
             System.out.println("}");
        }
    }
}
