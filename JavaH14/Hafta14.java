public class Hafta14 {
    public static void main(String[] args) {
        String metin = "Yeni Yüzyıl";
        System.out.println("Karakter : " + metin.length());

        System.out.println("3. Karakter : " +  metin.charAt(3));

        for (int i = 0; i < metin.length(); i++) {
            System.out.println(metin.charAt(i));
        }

        String KelimeSayaci = "Selam kardes naber?";
        System.out.println(KelimeSayaci);
        int sayac=1;

        for (int i = 0; i <KelimeSayaci.length(); i++) {
            if(KelimeSayaci.charAt(i) == ' ')
                sayac++;
        }
        System.out.println("Kelime Sayısı : " + sayac );


        System.out.println("Boş mu? : " + metin.isEmpty());



        
    }
}