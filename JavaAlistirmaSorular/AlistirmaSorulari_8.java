public class AlistirmaSorulari_8 {
    public static void main(String[] args) {
        merhabaDunya(3);
        System.out.println("----------");

        System.out.println(fibonacci(9));
        System.out.println("----------");

        rakamlariYazdir(5674);
        System.out.println();
        System.out.println("----------");

        System.out.println(rakamToplami(1234));
        System.out.println("----------");

        System.out.println(basamakSayisi(74923));
        System.out.println("----------");

        System.out.println(seriToplami(3));
        System.out.println("----------");

        System.out.println(enBuyukRakam(74923));
        System.out.println("----------");

        System.out.println(aralikToplami(5, 10));
        System.out.println("----------");

        System.out.println(recursiveCarpma(4, 5));
        System.out.println("----------");

        System.out.println(recursiveKalan(22, 4));
        System.out.println("----------");
    }

    public static void merhabaDunya(int n) {
        if (n <= 0) return;
        System.out.println("Merhaba dünya");
        merhabaDunya(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return 0;
        if (n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void rakamlariYazdir(int n) {
        if (n == 0) return;
        rakamlariYazdir(n / 10);
        System.out.print((n % 10) + " ");
    }

    public static int rakamToplami(int n) {
        if (n == 0) return 0;
        return (n % 10) + rakamToplami(n / 10);
    }

    public static int basamakSayisi(int n) {
        if (n == 0) return 0;
        return 1 + basamakSayisi(n / 10);
    }

    public static double seriToplami(int n) {
        if (n == 1) return 1.0;
        return (1.0 / n) + seriToplami(n - 1);
    }

    public static int enBuyukRakam(int n) {
        if (n < 10) return n;
        return Math.max(n % 10, enBuyukRakam(n / 10));
    }

    public static int aralikToplami(int bas, int bit) {
        if (bas > bit) return 0;
        return bas + aralikToplami(bas + 1, bit);
    }

    public static int recursiveCarpma(int a, int b) {
        if (b == 0) return 0;
        return a + recursiveCarpma(a, b - 1);
    }

    public static int recursiveKalan(int a, int b) {
        if (a < b) return a;
        return recursiveKalan(a - b, b);
    }
}