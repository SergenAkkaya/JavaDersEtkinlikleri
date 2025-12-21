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

        System.out.println("----------");

        int N4=5;
        for(int i=1; i<=N4; i++){
            for (int j = 1; j<=N4; j++) {
            System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("----------");

        int N5=5;
        for(int i=1; i<=N5; i++){
            for (int j = 1; j<=N5; j++) {
            System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("----------");

        int N6=5;
        for(int i=1; i<=N6; i++){
            for (int j = 1; j<=i; j++) {
            System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("----------");

        int N7=5;
        for(int i=1; i<=N7; i++){
            for (int j = 1; j<=i; j++) {
            System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("----------");

        int N8=5;
        for(int i=N8; 1<=i; i--){
            for (int j =1; j<=i; j++) {
            System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("----------");
        int N9=5;
        for(int i=1; i<=N9; i++){
            for (int j=N8; i<=j; j--) {
            System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("----------");
        int N10=5;
        for (int i = 0; i <=N10; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(N10-i+1);
            }
            System.out.println();
        }
        System.out.println("----------");
        int N11 = 5;
        for (int i = N11; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }
        System.out.println("----------");

        int N12 = 5;
        for (int i = 1; i <= N12; i++) {
            for (int j = i; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
        System.out.println("----------");

        int N13 = 5;
        for (int i = N13; i >= 1; i--) {
            for (int j = i; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
        System.out.println("----------");

        int N14 = 5;
        for (int i = 1; i <= N14; i++) {
            for (int j = 1; j <= i; j++) System.out.print(N14 - j + 1);
            System.out.println();
        }
        System.out.println("----------");

        int N15 = 5;
        for (int i = 0; i < N15; i++) {
            for (int j = N15; j > i; j--) System.out.print(j);
            System.out.println();
        }
        System.out.println("----------");

        int N16 = 5;
        for (int i = N16; i >= 1; i--) {
            for (int j = i; j <= N16; j++) System.out.print(j);
            System.out.println();
        }
        System.out.println("----------");

        int N17 = 5;
        for (int i = 1; i <= N17; i++) {
            for (int j = i; j <= N17; j++) System.out.print(j);
            System.out.println();
        }
        System.out.println("----------");

        int N18 = 5;
        int sayac = 1;
        for (int i = 1; i <= N18; i++) {
            for (int j = 1; j <= i; j++) System.out.print(sayac++);
            System.out.println();
        }
        System.out.println("----------");

        int N19 = 5;
        for (int i = 1; i <= N19; i++) {
            for (int j = 1; j <= N19; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println("----------");

        int N20 = 5;
        for (int i = N20; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println("----------");
    }
}