import java.util.Random;
import java.util.Scanner;

public class Hafta13b {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int tahminedilen= rnd.nextInt(256);
        System.out.print("Tahmininizi Giriniz:");
        int tahmin = input.nextInt();
        while(tahmin != tahminedilen ){

            if(tahmin > tahminedilen){
                System.out.print("Daha düşük bir sayı giriniz : ");
                tahmin=input.nextInt();
                System.out.println();
            }
            else if(tahmin<tahminedilen){
                System.out.print("Daha yüksek bir sayı giriniz :");
                tahmin=input.nextInt();
                System.out.println();
            }
        }
        if(tahmin==tahminedilen){
            System.out.println("Tahmininiz doğru : " + tahminedilen);
        }
    }
}