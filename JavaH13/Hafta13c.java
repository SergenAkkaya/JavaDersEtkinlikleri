import java.util.Random;

public class Hafta13c {

    static int[][] transpoze(int[][] matris){
        int satir = matris.length;
        int sutun= matris[0].length;
        int[][] yeni = new int[sutun][satir];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                yeni[j][i]=matris[i][j];
            }
        }
        return yeni;
    }

    public static void main(String[] args) {
        Random rnd = new Random();

        int say1=0,say2=0,say3=0;
        for (int i = 0; i < 3000; i++) {
            int uretilen = rnd.nextInt(1, 4);
            if(uretilen==1){
                say1++;
            }
            else if(uretilen==2){
                say2++;
            }
            else{
                say3++;
            }
        }
        System.out.println("1 den " + say1 +" Tane");
        System.out.println("2 den " + say2 +" Tane");
        System.out.println("3 den " + say3 +" Tane");

        int[][] matrisler={{1,2,3,4},
                            {10,20,30,40}};

        int[][] yenimatris = transpoze(matrisler);

        for (int i = 0; i < yenimatris.length; i++) {
            for (int j = 0; j < yenimatris[i].length; j++) {
                System.out.print("{"+yenimatris[i][j]+"}");
            }
            System.out.println();
        }
    }
}