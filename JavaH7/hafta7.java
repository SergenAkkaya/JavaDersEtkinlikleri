public class hafta7 {
    static double ortalamaBul(int sayi1 , int sayi2){
        double ortalama = (sayi1+sayi2)/2.0;
        return ortalama;
    }
    static char harfNotuBul( double not ) {
        char harfNotu;
        if(not>=0 && not<50)
            harfNotu = 'D';
        else if( not >=50 && not<60)
        harfNotu='C';
        else if ( not >=60 && not < 70)
        harfNotu = 'B';
        else if(not >= 70 && not <=100)
        harfNotu='A';
        else
        harfNotu='F';
        return harfNotu;
        
    }
    static double hacimBul ( double yaricap , double yukseklik)
    {
        double pi = 3.14;
        double sonuc = pi*(yaricap*yaricap)*yukseklik;
        return sonuc;
    }
    public static void main(String[] args) {
        int a=5 , b=7;
        double sonuc= ortalamaBul(a, b);
        System.out.println("Ortalama : "+ sonuc);

        char harf = harfNotuBul(57);
        System.out.println("Harf Notu: "+ harf);
        double hacim=hacimBul(5, 5);
        System.out.println("Üçgen Hacmi :" + hacim);
    }
}