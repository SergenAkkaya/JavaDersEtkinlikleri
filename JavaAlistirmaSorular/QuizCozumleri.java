public class QuizCozumleri {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        int N = 60, toplam = 0;
        for (int i = 1; i <= N; i++) {
            int islem = i * i - i;
            toplam += islem;
        }
        System.out.println(toplam);
        System.out.println("------------------------------------------");
        for (int i = 1; i <=N; i++) {
            if(N % i == 0 && i % 2!= 0){
                System.out.println(i+", ");
            }
        }
        System.out.println("------------------------------------------");
        N=5;
        for (int i = 1; i <=N; i++) {
            for(int j=1; j<=i;j++){
                if(i % 2 == 0)
                System.out.print("b");
                else
                System.out.print("a");
            }
            System.out.println(i);
        }
    }
}
