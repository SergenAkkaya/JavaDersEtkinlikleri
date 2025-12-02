
public class AlistirmaSorulari_3 {
    public static void main(String[] args) {
        int N1 = 4;
        for (int i = 0; i < N1; i++) {
            System.out.println(i*i*i +",");
        }
        System.out.println("-----------");
        int N2 = 5;
        int faktoriyel=1;
        for (int i = 1; i < N2; i++) {
            faktoriyel *=i;
            System.out.print(i+"! :");
            System.out.println(faktoriyel);
        }
        System.out.println("-----------");

        int N3 = 3;
        for (int i = 1; i <=10; i++) {
            int carpim = N3 * i;
            System.out.println(i + " * " + N3 + " : " + carpim);
        }
        System.out.println("-----------");

        int baslangicS = 1;
        int bitisS=10;
        int toplam1=0;
        int ortalama1=0;
        for (int i = baslangicS; i <=bitisS; i++) {
            toplam1+=i;
        }
        ortalama1= toplam1/bitisS;
        System.out.println("Toplam :  " + toplam1 +" Ortalaması : " + ortalama1);
        System.out.println("-----------");


        int taban=2;
        int us=5;
        int sonuc=1;
        for (int i = 1; i <=us; i++) {
            sonuc*=taban;
        }
        System.out.println("2 nin 5. üssü : " + sonuc);

        System.out.println("-----------");

        int ebobS1=12;
        int ebobS2=30;
        int bolen=0;
        for (int i = 1; i <=ebobS1 && i <=ebobS2; i++) {
            if (ebobS1%i==0 && ebobS2%i==0){
                bolen=i;
            }
        }
        System.out.println("EBOB : " + bolen);
        System.out.println("-----------");
        int ekokS1=12;
        int ekokS2=30;
        int ortakKat=0;
        for (int i = 1; i <=(ekokS1*ekokS2); i++) {
            if (i%ekokS1==0 && i%ekokS2==0){
                ortakKat=i;
                break;
            }
        }
        System.out.println("EKOK : " + ortakKat);
        System.out.println("-----------");
        int PbolenSayi=48;
        System.out.print("Pozitif Bölenler : ");
        for (int i = 1; i <=PbolenSayi; i++) {
            if (PbolenSayi%i==0){
                System.out.print(i +", ");
            }
        }
        System.out.println("");
        System.out.println("-----------");

        int NF1=10;
        int fib1=0;
        int fib2=1;
        System.out.print("Fibonacci Serisi : " + fib1 +", " + fib2);
        for (int i = 2; i <NF1; i++) {
            int fibNext=fib1+fib2;
            System.out.print(", " + fibNext);
            fib1=fib2;
            fib2=fibNext;
        }


        System.out.println("");
        System.out.println("-----------");

        int NFTSayisi=5;
        int fibo1=0;
        int fibo2=1;
        int fiboEleman=0;
        if (NFTSayisi==1){
            fiboEleman=fibo1;
        } else if (NFTSayisi==2) {
            fiboEleman=fibo2;
        } else {
            for (int i = 2; i <NFTSayisi; i++) {
                int fiboNext=fibo1+fibo2;
                fibo1=fibo2;
                fibo2=fiboNext;
                fiboEleman=fiboNext;
            }
            System.out.println("Fibonacci Serisi " + NFTSayisi + ". Elemanı : " + fiboEleman);
        }

        System.out.println("");
        System.out.println("-----------");

        int asalSayi=25;
        boolean asalMı=true;
        for (int i = 2; i <=asalSayi/2; i++) {
            if (asalSayi%i==0){
                asalMı=false;
                break;
            }
        }
        if (asalMı) {
            System.out.println(asalSayi + " asal bir sayıdır.");
        } else {
            System.out.println(asalSayi + " asal bir sayı değildir.");
        }


        System.out.println("");
        System.out.println("-----------");

        for (int sayi = 2; sayi <=100; sayi++) {
            asalMı=true;
            for (int i = 2; i <=sayi/2; i++) {
                if (sayi%i==0){
                    asalMı=false;
                    break;  
                }
            }
            if (asalMı) {
                System.out.print(sayi + ", ");
            }
        }


        System.out.println("");
        System.out.println("-----------");

        int sayi1=4;
        int sayi2=35;
        int ebob=0;
        for (int i = 1; i <=sayi1 && i <=sayi2; i++) {
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
        }
        if (ebob==1){
            System.out.println(sayi1 + " ve " + sayi2 + " aralarında asaldır.");
        } else {
            System.out.println(sayi1 + " ve " + sayi2 + " aralarında asal değildir.");
        }

        System.out.println("");
        System.out.println("-----------");


        int asalCarpanSayi=280;
        System.out.print(asalCarpanSayi + " sayısının asal çarpanları : ");
        for (int i = 2; i <=asalCarpanSayi; i++) {
            while (asalCarpanSayi%i==0){
                System.out.print(i +", ");
                asalCarpanSayi/=i;
            }
        }

        System.out.println("");
        System.out.println("-----------");

        
    }
}