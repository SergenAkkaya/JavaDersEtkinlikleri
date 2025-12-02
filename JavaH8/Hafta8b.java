public class Hafta8b {

    static int fun( int a ){
        a=10;
        return a;
    }
    public static void main(String[] args) {
        int a = 5;
        fun(a);
        System.out.println("Mainde fun'dan sonra "+ a);
    }
}