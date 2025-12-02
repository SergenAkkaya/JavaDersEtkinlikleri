public class Hafta8c {


    static int factorial(int N ){
        if(N==0)
            return 1;
        else
            return N*factorial(N-1);
    }
    static int sum(int N){
        if(N == 1)
            return 1;
        else
            return N+sum(N-1);
    }
    static int us(int a , int b){
        if(b==0)
            return 1;
        else
            return a*us(a,b-1);
    }

    static void Nyazdir(int N){
        if(N>1)
            Nyazdir(N-1);
        System.out.println(N);
    }
    static void NdenYazdir(int N){
        System.out.println(N);
        if(N>0)
            NdenYazdir(N-1);
    }
    public static void main(String[] args) {

    int sonuc= factorial(5);
    System.out.println(sonuc);
    System.out.println("-----");
    int toplam = sum(5);
    System.out.println(toplam);
    System.out.println("-----");
    int usSonuc= us(2,5);
    System.out.println(usSonuc);
    System.out.println("-----");
    Nyazdir(5);
    System.out.println("-----");
    NdenYazdir(5);
    }
}