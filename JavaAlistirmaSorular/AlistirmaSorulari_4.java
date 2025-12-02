public class AlistirmaSorulari_4 {
    public static void main(String[] args) {
        System.out.println("----------");

        int N1=5;
        for(int i=1; i<=N1; i++){
            for (int j = 1; j<=N1; j++) {
            System.out.print("1");
            }
            System.out.println();
        }

        System.out.println("----------");

        int N2=5;
        for(int i=1; i<=N2; i++){
            for (int j = 1; j<=N2; j++) {
            if(i%2==1)
                System.out.print("1");
            else
                System.out.print("0");
            }
            System.out.println();
        }

        System.out.println("----------");

        int N3=5;
        for(int i=1; i<=N3; i++){
            for (int j = 1; j<=N3; j++) {
            if(j%2==0)
                System.out.print("1");
            else
                System.out.print("0");
            }
            System.out.println();
        }
    }
}