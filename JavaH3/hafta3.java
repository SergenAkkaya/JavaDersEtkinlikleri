public class hafta3 {
    public static void main(String[] args) {
        int gunNo = 4;
        switch(gunNo){
            case 1 -> System.out.println("Pazartesi");
            case 2 -> System.out.println("Salı");
            case 3 -> System.out.println("Çarşamba");
            case 4 -> System.out.println("Perşembe");
            case 5 -> System.out.println("Cuma");
            case 6 -> System.out.println("Cumartesi");
            case 7 -> System.out.println("Pazar");
            default -> System.out.println("1-7 arası olmalı");
        }//Yeni break kullanımı
        System.out.println("-------------------------------");

            int sayi=1;
            String sonuc = (sayi % 2 ==0) ? "Çift" : "Tek";
            System.out.println(sonuc);
        System.out.println("-------------------------------");

            int a = 4 , b = 9;
            int max = (a>b)? a :b;
            System.out.println("Max :" + max);
        //kısa if yapısı
        System.out.println("-------------------------------");

        //Döngüler//
        for (int index = 1; index <=10; index++) {
            if(index % 3 == 0)
            System.out.println(index);
        }
        System.out.println("-------------------------------");
        int toplam=0;
        for(int j = 1 ; j <=100; j++){
            toplam += j ;
        }
        System.out.println(toplam);
        System.out.println("-------------------------------");
        int n =10;
        int toplam1 =0;
        for (int i = 1; i < n; i++) {
            toplam1 +=i;
        }
        System.out.println(toplam1);
        System.out.println("-------------------------------");
        int f = 5;
        int faktoriyel=1;
        for (int i = 1; i <= f; i++) {
            faktoriyel = faktoriyel*i;
        }
        System.out.println(faktoriyel);
        System.out.println("-------------------------------");
        
        int nF = 10;
        int aF = 0;
        int bF = 1;

        for (int i = 0; i < nF; i++) {
            System.out.println(aF);
            int c = aF + bF;
            aF = bF;
            bF = c;          
        }
        System.out.println("-------------------------------");
        for (int i = 10000; i > 0 ; i--) {
            if(i % 3 == 0 && i % 7 == 0){
                System.out.println(i);
                break;
            }
        }
        System.out.println("-------------------------------");


        for (int i = 0; i < 5; i++) {
            System.out.println(i +". adım");
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
        }
        System.out.println("-------------------------------");
        int N = 5;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        
    }
}