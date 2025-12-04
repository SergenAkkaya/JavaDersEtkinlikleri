package JavaH9;

import java.util.Scanner;

public class JavaHafta9 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int girilen=0;
        int toplam=0;
        for (int i = 1; i <= 10; i++) {
        System.out.print(i+ ". Sayı gir :");
        girilen = input.nextInt();
        toplam+=girilen;
        }
        System.out.println("Toplam Sayı:" + toplam);
    }
}