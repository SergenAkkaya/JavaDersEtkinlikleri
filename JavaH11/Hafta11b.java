import java.util.Scanner;

public class Hafta11b {
    public static void main(String[] args) {
        int [] dizi = {1,2,3,4,5,3,1,5,5};

        Scanner input = new Scanner(System.in);

        System.out.print("Aranan Sayı : ");
        int aranan = input.nextInt();
        boolean varmi = false;
        for(int i = 0; i < dizi.length; i++){
            if(aranan == dizi[i]){
                System.out.println(i+ ". Sırada var");
                varmi = true;
            }
        }
        if(!varmi)
            System.out.println("Dizide yok");
    }
}