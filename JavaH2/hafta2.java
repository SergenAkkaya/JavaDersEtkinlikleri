public class hafta2 {
    public static void main(String[] args) {
        // bir tamsayının 3 ve m5 ile bölünebilme durumunu kontrol eden bir program
        // yazın.
        int sayi = 15; // Kontrol edilecek tamsayı
        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println(sayi + " hem 3'e hem de 5'e tam bölünür.");
        } else if (sayi % 3 == 0) {
            System.out.println(sayi + " sadece 3'e tam bölünür.");
        } else if (sayi % 5 == 0) {
            System.out.println(sayi + " sadece 5'e tam bölünür.");
        } else {
            System.out.println(sayi + " ya 3'e ya da 5'e tam bölünmez.");
        }
        // Haftanın gün numarasına göre gün adını yazdıran bir program yazın if-else
        // kullanarak
        int gunNumarasi = 3; // Haftanın gün numarası
        if (gunNumarasi == 1) {
            System.out.println("Pazartesi");
        } else if (gunNumarasi == 2) {
            System.out.println("Salı");
        } else if (gunNumarasi == 3) {
            System.out.println("Çarşamba");
        } else if (gunNumarasi == 4) {
            System.out.println("Perşembe");
        } else if (gunNumarasi == 5) {
            System.out.println("Cuma");
        } else if (gunNumarasi == 6) {
            System.out.println("Cumartesi");
        } else if (gunNumarasi == 7) {
            System.out.println("Pazar");
        } else {
            System.out.println("Geçersiz gün numarası");
        }
        //switch-case kullanarak
        switch (gunNumarasi) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz gün numarası");
        }
        int gunNo2 = 2;
        
        switch (gunNo2){
            case 1 : 
            case 2 :
            case 3 : 
            case 4 : 
            case 5 : System.out.println("Haftaiçi"); break;
            case 6 : 
            case 7 : System.out.println("Haftasonu"); break;
            default : System.out.println("Gün No 1-7 arasında bir değer olmalı");
        }
    }
}