import java.util.Scanner;

public class AlistirmaSorulari_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1, s2, s3;
        s1 = scanner.nextInt();
        s2 = scanner.nextInt();
        s3 = scanner.nextInt();
        System.out.println((s1 + s2 + s3) / 3.0);
        System.out.println("----------");

        int sayi2 = scanner.nextInt();
        if (sayi2 > 0) System.out.println("Pozitif");
        else if (sayi2 < 0) System.out.println("Negatif");
        else System.out.println("Sıfır");
        System.out.println("----------");

        int secim3 = scanner.nextInt();
        double sayi3_1 = scanner.nextDouble();
        double sayi3_2 = scanner.nextDouble();
        if (secim3 == 1) System.out.println(sayi3_1 + sayi3_2);
        else if (secim3 == 2) System.out.println(sayi3_1 - sayi3_2);
        else if (secim3 == 3) System.out.println(sayi3_1 / sayi3_2);
        else if (secim3 == 4) System.out.println(sayi3_1 * sayi3_2);
        else if (secim3 == 5) System.out.println(sayi3_1 % sayi3_2);
        System.out.println("----------");

        int toplam4 = 0, adet4 = 0;
        while (toplam4 < 100) {
            toplam4 += scanner.nextInt();
            adet4++;
        }
        System.out.println(toplam4 + " " + adet4);
        System.out.println("----------");

        int toplam5 = 0, adet5 = 0, girilen5;
        while ((girilen5 = scanner.nextInt()) != 0) {
            toplam5 += girilen5;
            adet5++;
        }
        System.out.println(toplam5 + " " + adet5);
        System.out.println("----------");

        double maliyet6 = scanner.nextDouble();
        double satis6 = scanner.nextDouble();
        double oran6 = ((satis6 - maliyet6) / maliyet6) * 100;
        if (oran6 > 0) System.out.println("%" + oran6 + " kar");
        else System.out.println("%" + Math.abs(oran6) + " zarar");
        System.out.println("----------");

        int n7_1 = scanner.nextInt();
        int n7_2 = scanner.nextInt();
        if (Math.abs(n7_1) < Math.abs(n7_2)) System.out.println(n7_1);
        else System.out.println(n7_2);
        System.out.println("----------");

        int secim8 = scanner.nextInt();
        if (secim8 == 1) {
            System.out.println(scanner.nextDouble() * scanner.nextDouble());
        } else if (secim8 == 2) {
            System.out.println((scanner.nextDouble() * scanner.nextDouble()) / 2.0);
        } else if (secim8 == 3) {
            double r = scanner.nextDouble();
            System.out.println(3.14 * r * r);
        }
        System.out.println("----------");

        int m = scanner.nextInt(), w = scanner.nextInt(), g = scanner.nextInt(), p = scanner.nextInt();
        int enb = Math.max(Math.max(m, w), Math.max(g, p));
        int enk = Math.min(Math.min(m, w), Math.min(g, p));
        double ort = (m + w + g + p) / 4.0;
        System.out.println(enb + " " + enk + " " + ort);
        System.out.println(ort >= 70 ? "Başarılı" : "Başarısız");
        System.out.println("----------");

        int bas10 = scanner.nextInt(), bit10 = scanner.nextInt(), art10 = scanner.nextInt();
        if ((bas10 < bit10 && art10 < 0) || (bas10 > bit10 && art10 > 0)) {
            System.out.println("Uyarı!");
        } else {
            int toplam10 = 0;
            for (int i = bas10; (art10 > 0 ? i <= bit10 : i >= bit10); i += art10) {
                System.out.print(i + " ");
                toplam10 += i;
            }
            System.out.println("\n" + toplam10);
        }
        System.out.println("----------");
    }
}
