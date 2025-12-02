public class Hafta8 {

    static int toplam(int say1 , int say2){
        return say1+say2;
    }
    static double toplam(double a , double b){
        return a+b;
    }

    static double ortalama(double a, double b){
        double ortalama = (a + b) / 2;
        return ortalama;
    }
    static double ortalama(double a, double b, double c){
        double ortalama = (a + b + c) / 3;
        return ortalama;
    }
    public static void main(String[] args) {
        int sonuc=toplam(10 , 15);
        System.out.println(sonuc);

        double sonucD=toplam(12.5 , 7.5);
        System.out.println(sonucD);


        double sonucO= ortalama(sonuc, sonucD);
        System.out.println(sonucO);
    }
}