public class Hafta11 {
    static void yazdir(int N){
        if(N==0){
            return;
        }
        else{
        yazdir(N-1);
        System.out.println("Hello");
        }
        
    }
    static int fibonacci(int terim){
        if(terim == 0){
            return 0;
        }
        if(terim==1){
            return 1;
        }
        return fibonacci(terim-1) + fibonacci(terim-2);
    }
    static void parcaliyici(int N){
        
        if(N<10){
            System.out.print(N + " ");
        }
        else{
            parcaliyici(N/10);
            System.out.print(N%10 + " ");
        }

    }
    static int parcalatopla(int N){
        if(N==0)
            return 0;
        else
        return N%10 + parcalatopla(N/10);
    }
    static int parcalasay(int N){
        if(N==0)
            return 0;
        return 1 + parcalasay(N/10);
    }

    static double terimtopla(int N){
        if(N==1)
            return 1;
        else
        return 1.0/N + terimtopla(N-1);
    }
    public static void main(String[] args) {
        //yazdir(5);
        //int toplam = fibonacci(5);
        //System.out.println(toplam);
        //parcaliyici(347);
        //int toplam =  parcalatopla(345);
        //System.out.println(toplam);
        // int basamak = parcalasay(1234);
        // System.out.println(basamak);
        double terim = terimtopla(5);
        System.out.println(terim);
    }
}