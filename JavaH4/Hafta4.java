public class Hafta4 {
    public static void main(String[] args) {
        //for (int i = 0; i <=10; i++) {
        //    System.out.println(i);
        //}
        /*int i=0;
        while (i<10) {
            System.out.println(i);
            i++;
        }
        System.out.println("---------------------------------");
        int toplam=0;
        int j=0;
        int N=10;
        while (j<=N) {
            toplam+=j;
            j++;
        }
        System.out.println(toplam);
        System.out.println("---------------------------------");

        int toplam_2=1;
        int k=1;
        int faktoriyel=7;
        while (k<=faktoriyel) {
            toplam_2*=k;
            k++;
        }
        System.out.println(toplam_2);
        
        System.out.println("---------------------------------");
        int toplam_3=1;
        int a=2;
        int b=4;
        int l=0;
        while(l<b){
            toplam_3*=a;
            l++;
        }
        System.out.println(toplam_3);
        
        System.out.println("---------------------------------");
        int sayi=30494;
        while(sayi !=0){
        int rakam = sayi%10;
        System.out.println(rakam);
        sayi /=10;
        }
        System.out.println("---------------------------------");
        int sayi=30494;
        int toplam_sayi=0;
        while(sayi !=0){
        int rakam = sayi%10;
        toplam_sayi+=rakam;
        sayi /=10;
        }
        System.out.println(toplam_sayi);
        System.out.println("---------------------------------");
        */
        char karakter = 'a';
        int N=5;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(karakter+" ");
            }
            System.out.print(i);
            karakter++;
            System.out.println();
        }
    }
}