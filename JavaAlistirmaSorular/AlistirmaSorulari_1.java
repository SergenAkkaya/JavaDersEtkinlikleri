public class AlistirmaSorulari_1 {
    public static void main(String[] args) {
        // Soru 1 = Doğum yılı ve boy , kilo , cinsiyet ve öğrenci numarası bilgilerini
        // değişkenlerine atayarak ekrana yazdıran bir program yazınız.
        int dogumYili = 2006;
        double boy = 1.70; // metre cinsinden
        double kilo = 90.5; // kilogram cinsinden
        char cinsiyet = 'E'; // E:rkek, K:Kadın
        String ogrenciNumarasi = "25151513042";

        System.out.println("Doğum Yılı: " + dogumYili);
        System.out.println("Boy: " + boy + " m");
        System.out.println("Kilo: " + kilo + " kg");
        System.out.println("Cinsiyet: " + cinsiyet);
        System.out.println("Öğrenci Numarası: " + ogrenciNumarasi); 

        // Soru 2 = İki tamsayının toplamını bulan bir program yazınız.
        int sayi1 = 15;
        int sayi2 = 30;
        int toplam = sayi1 + sayi2;
        System.out.println("İki sayının toplamı: " + toplam);

        // Soru 3= Bir tamsayının karesini ve küpünü hesaplayan bir program yazınız.
        int sayi = 5;
        int kare = sayi * sayi;
        int kup = sayi * sayi * sayi;
        System.out.println("Sayının karesi: " + kare);
        System.out.println("Sayının küpü: " + kup);

        // Soru 4= İki tamsayının ortalamasını bulan bir program yazınız.
        int sayiA = 20;
        int sayiB = 40;
        double ortalama = (sayiA + sayiB) / 2.0;
        System.out.println("İki sayının ortalaması: " + ortalama);

        // Soru 5= Formüle göre bir Celcius değerini kelvin'e çeviren bir program yazınız.
        double celcius = 25.0;
        double kelvin = celcius + 273.15;
        System.out.println("Celcius değeri: " + celcius + " °C");
        System.out.println("Kelvin değeri: " + kelvin + " K");

        // Soru 6 = Formüle göre bir Kelvin değerini Celcius'a çeviren bir program yazınız.
        double kelvinDegeri = 300.0;
        double celciusDegeri = kelvinDegeri - 273.15;
        System.out.println("Kelvin değeri: " + kelvinDegeri + " K");
        System.out.println("Celcius değeri: " + celciusDegeri + " °C");

        // Soru 7 = Bir ürün fiyatına %18 KDV ekledikten sonra ki KDV'li fiyatı hesaplayan bir program yazınız.
        double urunFiyati = 100.0;
        double kdvOrani = 0.18;
        double kdvTutar = urunFiyati * kdvOrani;
        double kdvliFiyat = urunFiyati + kdvTutar;
        System.out.println("Ürün Fiyatı: " + urunFiyati + " TL");
        System.out.println("KDV Tutarı: " + kdvTutar + " TL");
        System.out.println("KDV'li Fiyat: " + kdvliFiyat + " TL");

        // Soru 8 = Faturanın KDV’li toplam tutarı ve faturanın KDV tutarı bilgilerini kullanarak,
        // KDV oranının yüzde kaç olduğunu hesaplayan ve konsola yazdıran JAVA programını yazınız.
        double kdvliToplamTutar = 118.0; // KDV'li toplam tutar
        double kdvTutari = 18.0; // KDV tutarı
        double kdvOraniHesapla = (kdvTutari / (kdvliToplamTutar - kdvTutari)) * 100;
        System.out.println("KDV Oranı: %" + kdvOraniHesapla);

        // Soru 9 = Yükseklik ve yarıçap uzunluklarına göre bir silindirin hacmini hesaplayan ve sonucu konsola yazdıran JAVA programını yazınız.
    
        double yaricap = 3.0; // yarıçap uzunluğu
        double yukseklik = 5.0; // yükseklik uzunluğu
        double hacim = Math.PI * Math.pow(yaricap, 2) * yukseklik;
        System.out.println("Silindirin Hacmi: " + hacim);

        // Soru 10 = Dolar miktarına ve dolar kuruna göre, dövizin Türk Lirası karşılığını hesaplayarak konsola yazdıran JAVA programını yazınız.
    
        double dolarMiktari = 100.0; // Dolar miktarı
        double dolarKuru = 47.5; // Dolar kuru
        double turkLirasiKarsiligi = dolarMiktari * dolarKuru;
        System.out.println("Türk Lirası Karşılığı: " + turkLirasiKarsiligi + " TL");

        // Soru 11 = formüle göre oC (santigrat derece) değerine karşılık gelen oF (Fahrenheit) değerini hesaplayan ve konsola yazdıran JAVA programını yazınız.

        double santigrat = 30.0; // oC değeri
        double fahrenheit = (santigrat * 9/5) + 32;
        System.out.println("Fahrenheit Değeri: " + fahrenheit + " °F");

        // Soru 12 =formüle göre V1 (ilk hız), V2 (son hız) ve t (süre) değerlerine göre, bir aracın ivmesini hesaplayan ve konsola yazdıran JAVA programını yazınız.

        double V1 = 0.0; // ilk hız
        double V2 = 100.0; // son hız
        double t = 9.58; // süre (saniye)
        double ivme = (V2 - V1) / t;
        System.out.println("Aracın İvmesi: " + ivme + " m/s²");
        

        // Soru 13 =formüle göre bir aracın hız (m/s) ve hareket süresi (s) değerlerine göre bu aracın bu sürede kaç metre yol aldığını hesaplayıp konsola yazdıran JAVA programını yazınız.
    
        double hiz = 27.78; // hız (m/s)
        double hareketSuresi = 10.0; // hareket süresi (saniye)
        double alinanYol = hiz * hareketSuresi;
        System.out.println("Alınan Yol: " + alinanYol + " metre");

        // Soru 14 = formüle göre bir aracın aldığı yol ve hareket süresi değerlerine göre bu aracın hızını hesaplayıp konsola yazdıran JAVA programını yazınız.
    
        double alinanYol2 = 100.0; // alınan yol (metre)
        double hareketSuresi2 = 10.0; // hareket süresi (saniye)
        double hiz2 = alinanYol2 / hareketSuresi2;
        System.out.println("Aracın Hızı: " + hiz2 + " m/s");

        // Soru 15 = formüle göre kilometre cinsinden bir mesafenin mil cinsinden karşılığını hesaplayarak konsola yazdıran JAVA programını yazınız.
    
        double kilometre = 50.0; // mesafe (kilometre)
        double mil = kilometre * 0.621371;
        System.out.println("Mesafe: " + mil + " mil");

        // Soru 16 = formüle göre mil cinsinden bir mesafenin kilometre cinsinden karşılığını hesaplayarak konsola yazdıran JAVA programını yazınız.
        double mil2 = 31.07; // mesafe (mil)
        double kilometre2 = mil2 / 0.621371;
        System.out.println("Mesafe: " + kilometre2 + " kilometre");

        // Soru 17= Bir ürünün birim fiyatı ve satın alınan adet bilgilerine göre toplam maliyetini hesaplayan ve konsola yazdıran JAVA programını yazınız.
    
        double birimFiyat = 20.0; // ürünün birim fiyatı
        int adet = 5; // satın alınan adet
        double toplamMaliyet = birimFiyat * adet;
        System.out.println("Toplam Maliyet: " + toplamMaliyet + " TL");

        // Soru 18 = Bir ürünün kilogram fiyatı ve satın alınan gramaj bilgilerine göre toplam maliyetini hesaplayıp konsola yazdıran JAVA programını yazınız.
        
        double kilogramFiyat = 50.0; // ürünün kilogram fiyatı
        double gramaj = 250.0; // satın alınan gramaj (gram)
        double toplamMaliyet2 = (kilogramFiyat / 1000) * gramaj;
        System.out.println("Toplam Maliyet: " + toplamMaliyet2 + " TL");

        // Soru 19 = İki tamsayıdan, birinci sayının son rakamının ikinci sayının son rakamına bölümünden kalanı konsola yazdıran JAVA programını yazınız.
        int num1 = 27;
        int num2 = 14;
        int kalan = (num1 % 10) % (num2 % 10);
        System.out.println("Kalan: " + kalan);

        // Soru 20 = Vize, final, quiz ve proje notunu kullanarak bir öğrencinin dönem sonu ağırlıklı
        //notunu hesaplayan ve konsola yazdıran JAVA programını yazınız. (Vize %25, quiz %10,
        //proje %5 ve final %60 oranında dönem sonu notuna etki etmektedir.)
    
        double vizeNotu = 80.0;
        double finalNotu = 90.0;
        double quizNotu = 70.0;
        double projeNotu = 85.0;
        double donemSonuNotu = (vizeNotu * 0.25) + (quizNotu * 0.10) + (projeNotu * 0.05) + (finalNotu * 0.60);
        System.out.println("Dönem Sonu Notu: " + donemSonuNotu);

        // Soru 21 = Virgüllü bir sayının virgülden sonraki kısmını konsola yazdıran JAVA programını yazınız.
    
        double sayiVirgul = 45.678;
        int virgulSonrasi = (int)((sayiVirgul - (int)sayiVirgul) * 1000); // Virgülden sonraki kısmı al
        System.out.println("Virgülden sonraki kısım: " + virgulSonrasi);

        // Soru 22 = Birden fazla basamaklı bir sayının birler basamağını bulan ve konsola yazdıran JAVA programını yazınız.
        int cokBasamakliSayi = 12345;
        int birlerBasamagi = cokBasamakliSayi % 10;
        System.out.println("Birler Basamağı: " + birlerBasamagi);

        // Soru 23 = Üç basamaklı bir sayının rakamlarının toplamını bulan ve konsola yazdıran JAVA programını yazınız.
        int ucBasamakliSayi = 456;
        int birler = ucBasamakliSayi % 10;
        int onlar = (ucBasamakliSayi / 10) % 10;
        int yuzler = ucBasamakliSayi / 100;
        int rakamlarToplami = birler + onlar + yuzler;
        System.out.println("Rakamların Toplamı: " + rakamlarToplami);

        // Soru 24 = İki basamaklı bir sayının rakamlarını terse çeviren JAVA programını yazınız
        
        int ikiBasamakliSayi = 78;
        int birler2 = ikiBasamakliSayi % 10;
        int onlar2 = ikiBasamakliSayi / 10;
        int tersSayi = (birler2 * 10) + onlar2;
        System.out.println("Ters Çevrilmiş Sayı: " + tersSayi);

        // Soru 25 = İki değişkenin değerini birbiriyle değiştiren JAVA programını yazınız.
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Değişken a'nın yeni değeri: " + a);
        System.out.println("Değişken b'nin yeni değeri: " + b);

        // Soru 26 = İki iç açısı bilinen bir üçgenin üçüncü iç açısını bulan ve konsola yazdıran JAVA programını yazınız.
        int aci1 = 60;
        int aci2 = 80;
        int aci3 = 180 - (aci1 + aci2);
        System.out.println("Üçüncü İç Açı: " + aci3 + " derece");

        // Soru 27= tahmin sorusu
        int tahminI = 70;
        int tahminJ = 60;
        int tahminK = 120;
        double tahminL = 20.0;
        System.out.println("i = " + tahminI);
        System.out.println("j = " + tahminJ);
        System.out.println("k = " + tahminK);
        System.out.println("l = " + tahminL);

        // Soru 28= Toplam dakika miktarı değerini aşağıdaki örnekte olduğu gibi saat ve dakika cinsinden konsola yazan JAVA programını yazınız.

        int toplamDakika = 130;
        int saat = toplamDakika / 60;
        int dakika = toplamDakika % 60;
        System.out.println("Saat: " + saat + ", Dakika: " + dakika);

        // Soru 29 = Şu anki toplam nüfus ve yıllık nüfus artış yüzdesi bilgilerine göre 3 yıllık nüfus projeksiyonu yapan programı yazınız.

        int suAnkiNufus = 1000000;
        double yillikArtisYuzdesi = 2.0; // yüzde
        for (int yil = 1; yil <= 3; yil++) {
            suAnkiNufus += suAnkiNufus * (yillikArtisYuzdesi / 100);
            System.out.println(yil + ". yıl nüfus: " + suAnkiNufus);
        }

        // Soeu 30 = Bir aracın gideceği mesafe (km), bir litre benzin ile kaç km yol gittiği ve benzinin
        //litre fiyatı bilgilerine göre, bu mesafenin araç sahibine kaç TL'ye malolacağını hesaplayan ve
        //konsola yazdıran JAVA programını yazınız.

        double gidilecekMesafe = 150.0; // km
        double aracYakitVerimliligi = 15.0; // km/l
        double benzinLitreFiyati = 7.5; // TL/litre
        double gerekenBenzinMiktari = gidilecekMesafe / aracYakitVerimliligi;
        double toplamMaliyet3 = gerekenBenzinMiktari * benzinLitreFiyati;
        System.out.println("Toplam Maliyet: " + toplamMaliyet3 + " TL");

    }
}