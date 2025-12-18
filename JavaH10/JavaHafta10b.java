import java.util.Scanner;

public class JavaHafta10b {
    static int topla( int [] sayilar ){
        int topla=0;
        for (int i : sayilar) {
            topla += i;
        }
        return topla;
    }

    static int [] tersinibul(int n){
        int [] yeniDizi = new int[n];
        for (int i = 0; i < n; i++) {
            yeniDizi[i] = i+1;
        }
        return yeniDizi; 
    }
    public static void main(String[] args) {
        int [] tamsayi = {3,5,7,2,1,4,5,9,0,8};

        // System.out.println("---------------");
        // for (int i = 0; i < tamsayi.length/2; i++) {
        //     int temp = tamsayi[i];
        //     tamsayi[i] = tamsayi[tamsayi.length - 1 - i ];
        //     tamsayi[tamsayi.length - 1 - i] = temp;
        // }
        // for (int i = 0; i < tamsayi.length; i++) {
        //     System.out.print(tamsayi[i]+ " ");
        // }
        // System.out.println("\n---------------");

        int sonEleman = tamsayi[tamsayi.length - 1];
        for (int i = tamsayi.length - 1; i > 0; i--) {
            tamsayi[i] = tamsayi[i - 1];
        }
        tamsayi[0] = sonEleman;
        for (int i = 0; i < tamsayi.length; i++) {
            System.out.print(tamsayi[i]+ " ");
        }

        System.out.println("\n--Foreach--");

        for (int i : tamsayi) {
            System.out.println(i);
        }

        System.out.println("\n--Foreach--Method işlemi--");

        System.out.println(topla(tamsayi));

        System.out.println("\n--Dizi--Method işlemi--");

        int [] sonuc = tersinibul(5);

        for (int i : sonuc) {
            System.out.println(i);
        }
        System.out.println("\n--Dizi--Arama--");

        Scanner input = new Scanner(System.in);

        int [] sayi = {1,2,3,4,5,6,7,8};

        System.out.print("Aranan Sayıyı giriniz: ");
        int aranan = input.nextInt();

        boolean vamı = false;
        for (int i : sayi) {
            if(i == aranan){
                vamı = true;
                break;
            }
        }
        if(vamı == true)
            System.out.println("Dizi de var");
        else{
            System.out.println("Dizide yook");
        }
    }
}