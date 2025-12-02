public class AlistirmaSorulari_2 {
    public static void main(String[] args) {
        // Soru 1 = Bir tamsayının negatif mi, pozitif mi yoksa sıfır mı olduğunu
        // konsola yazdıran programı yazınız.
        int number = -10;
        if (number > 0) {
            System.out.println(number + " pozitif bir sayıdır.");
        } else if (number < 0) {
            System.out.println(number + " negatif bir sayıdır.");
        } else {
            System.out.println("Sayı sıfırdır.");
        }

        // Soru 2 = Sıcaklık değerine göre suyun halini (katı, sıvı veya gaz) konsola
        // yazdıran programı yazınız.
        int temperature = 25; // Sıcaklık değeri
        if (temperature <= 0) {
            System.out.println("Su katı haldedir (buz).");
        } else if (temperature > 0 && temperature < 100) {
            System.out.println("Su sıvı haldedir.");
        } else {
            System.out.println("Su gaz haldedir (buhar).");
        }

        // Soru 3 = Bir aracın ilk hız ve son hız değerine göre, konsola “Yavaşlıyor”
        // ,veya “Sabit Hızda” yazdıran JAVA programını yazınız.
        int initialSpeed = 80; // İlk hız
        int finalSpeed = 60; // Son hız
        if (finalSpeed < initialSpeed) {
            System.out.println("Yavaşlıyor.");
        } else if (finalSpeed == initialSpeed) {
            System.out.println("Sabit Hızda.");
        } else {
            System.out.println("Hızlanıyor.");
        }

        // Soru 4 = Tanımlanan üç açı değeriyle bir üçgen oluşup oluşamayacağını konsola
        // yazdıran JAVA programını yazınız.
        int angle1 = 60;
        int angle2 = 70;
        int angle3 = 50;
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("Bu açı değerleriyle bir üçgen oluşturulabilir.");
        } else {
            System.out.println("Bu açı değerleriyle bir üçgen oluşturulamaz.");
        }

        // Soru 5 = Üç tamsayı arasındaki en büyük değeri bulan ve konsola yazdıran JAVA
        // programını yazınız.
        int a = 15;
        int b = 25;
        int c = 10;
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("En büyük sayı: " + max);

        // Soru 6 = Üç tamsayı arasındaki en küçük değeri bulan ve konsola yazdıran JAVA
        // programını yazınız.
        int x = 15;
        int y = 25;
        int z = 10;
        int min;
        if (x <= y && x <= z) {
            min = x;
        } else if (y <= x && y <= z) {
            min = y;
        } else {
            min = z;
        }
        System.out.println("En küçük sayı: " + min);

        // Soru 7 = Bir öğrencinin vize, ödev ve final notunu kullanarak dönem sonu
        // notunu
        // hesaplayan, eğer dönem sonu notu 70 ve üzerindeyse konsola GEÇTİ, değilse
        // KALDI
        // yazdıran programı yazınız.
        double midterm = 75; // Vize notu
        double homework = 80; // Ödev notu
        double finalExam = 65; // Final notu
        double finalGrade = (midterm * 0.3) + (homework * 0.2) + (finalExam * 0.5);
        if (finalGrade >= 70) {
            System.out.println("GEÇTİ");
        } else {
            System.out.println("KALDI");
        }

        // Soru 8 = Tanımlanan genel ağırlıklı not ortalaması (GANO) değeri için
        // aşağıdaki aralıklara
        // göre uygun harf notunu konsola yazdıran programı yazınız.
        // 3.5 ≤ GANO ≤ 4.0 → A
        // 3.0 ≤ GANO < 3.5 → B
        // 2.5 ≤ GANO < 3.0 → C
        // 2.0 ≤ GANO < 2.5 → D
        // 1.5 ≤ GANO < 2.0 → E
        // 0.0 ≤ GANO < 1.5 →
        double GANO = 3.2;
        if (GANO >= 3.5 && GANO <= 4.0) {
            System.out.println("Harf Notu: A");
        } else if (GANO >= 3.0 && GANO < 3.5) {
            System.out.println("Harf Notu: B");
        } else if (GANO >= 2.5 && GANO < 3.0) {
            System.out.println("Harf Notu: C");
        } else if (GANO >= 2.0 && GANO < 2.5) {
            System.out.println("Harf Notu: D");
        } else if (GANO >= 1.5 && GANO < 2.0) {
            System.out.println("Harf Notu: E");
        } else if (GANO >= 0.0 && GANO < 1.5) {
            System.out.println("Harf Notu: F");
        } else {
            System.out.println("Geçersiz GANO değeri.");
        }

        // Soru 9 = A, B, C, D ve E harf notlarından birinin verildiği bir sistemde,
        // öğrencinin harf
        // notuna göre konsola,
        // A için “Çok iyi”
        // B için “İyi”
        // C için “Orta”
        // D için “Kötü”
        // E için “Çok kötü”
        // yazdıran programı yazınız.
        char letterGrade = 'B';
        switch (letterGrade) {
            case 'A':
                System.out.println("Çok iyi");
                break;
            case 'B':
                System.out.println("İyi");
                break;
            case 'C':
                System.out.println("Orta");
                break;
            case 'D':
                System.out.println("Kötü");
                break;
            case 'E':
                System.out.println("Çok kötü");
                break;
            default:
                System.out.println("Geçersiz harf notu.");
        }

        // Soru 10 = Bir ürünün eski fiyatı ve yeni fiyatına göre, konsola “Bu ürüne %X
        // zam
        // gelmiştir” veya “Bu ürüne %X indirim yapılmıştır” ya da “Bu ürünün fiyatı
        // değişmemiştir”
        // yazdıran JAVA programını yazınız.
        double oldPrice = 200.0;
        double newPrice = 180.0;
        if (newPrice > oldPrice) {
            double increasePercentage = ((newPrice - oldPrice) / oldPrice) * 100;
            System.out.printf("Bu ürüne %%%.2f zam gelmiştir.%n", increasePercentage);
        } else if (newPrice < oldPrice) {
            double discountPercentage = ((oldPrice - newPrice) / oldPrice) * 100;
            System.out.printf("Bu ürüne %%%.2f indirim yapılmıştır.%n", discountPercentage);
        } else {
            System.out.println("Bu ürünün fiyatı değişmemiştir.");
        }

        // Soru 11 = SORU 11) Switch-case yapısını kullanarak; 0’dan 9’a kadar
        // tanımlanan bir rakamı yazıyla
        // konsola yazdıran, eğer bu aralık dışındaysa konsola "Bu bir rakam değildir"
        // şeklinde uyarı
        // mesajı yazan programı yazınız.
        // Örneğin; 6 için ALTI mesajı konsola yazdırılmalıdır.
        int digit = 6;
        switch (digit) {
            case 0:
                System.out.println("Sıfır");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Bu bir rakam değildir.");
        }

        // Soru 12 = İki basamaklı iki tamsayının, birler basamağındaki rakamların
        // büyüğünü konsola yazdıran JAVA programını yazınız.
        int num1 = 47;
        int num2 = 83;
        int onesDigit1 = num1 % 10;
        int onesDigit2 = num2 % 10;
        if (onesDigit1 > onesDigit2) {
            System.out.println("Birler basamağındaki büyük rakam: " + onesDigit1);
        } else if (onesDigit2 > onesDigit1) {
            System.out.println("Birler basamağındaki büyük rakam: " + onesDigit2);
        } else {
            System.out.println("Birler basamağındaki rakamlar eşittir: " + onesDigit1);
        }

        // Soru 13= Zam dönemindeki bir firmada 0-5 yıl arası çalışanlara %20, 6-10 yıl
        // arası
        // çalışanlara %25, 11 ve üzeri yıl çalışanlara ise %30 zam yapılacaktır. Buna
        // göre bir çalışanın
        // mevcut maaşı ve çalışma yılına göre alacağı yeni maaşı hesaplayan ve konsola
        // yazdıran
        // programı yazınız.

        double currentSalary = 5000.0;
        int yearsOfService = 7;
        double newSalary;
        if (yearsOfService >= 0 && yearsOfService <= 5) {
            newSalary = currentSalary * 1.20;
        } else if (yearsOfService >= 6 && yearsOfService <= 10) {
            newSalary = currentSalary * 1.25;
        } else if (yearsOfService >= 11) {
            newSalary = currentSalary * 1.30;
        } else {
            System.out.println("Geçersiz çalışma yılı.");
            return;
        }
        System.out.printf("Yeni maaş: %.2f%n", newSalary);

        // Soru 14 = Bir şirket sadece aşağıdaki durumlarda çalışanlarını
        // sigortalamaktadır.
        // Çalışan evli ise
        // Çalışan evli değilse, erkek ve 30 yaşın üzerindeyse
        // Çalışan evli değilse, kadın ve 25 yaşın üzerindeyse
        // Buna göre, bir çalışanın medeni hali, cinsiyeti ve yaşına göre sigortalı olup
        // olmayacağını kontrol eden programı yazınız.
        boolean isMarried = false;
        char gender = 'F'; // 'M' erkek, 'F' kadın
        int age = 28;
        boolean isInsured;
        if (isMarried) {
            isInsured = true;
        } else {
            if (gender == 'M' && age > 30) {
                isInsured = true;
            } else if (gender == 'F' && age > 25) {
                isInsured = true;
            } else {
                isInsured = false;
            }
        }
        if (isInsured) {
            System.out.println("Çalışan sigortalıdır.");
        } else {
            System.out.println("Çalışan sigortalı değildir.");
        }

        // Soru 15 = Okulun kütüphanesinden alınan bir kitap zamanında teslim edilmezse
        // gecikme
        // gün sayısına göre öğrenciye ceza kesilmektedir. Gecikme süresi 1 haftaya
        // kadar olursa
        // günlük 10 TL, 3 haftaya kadar olursa 100 TL ile birlikte günlük 15 TL, 3
        // haftadan daha uzun
        // olursa da 300 TL ile birlikte günlük 20 TL öğrenciye ceza
        // kesilmektedir.Kütüphaneden aldığı kitabı zamanında teslim etmeyen bir
        // öğrencinin, gecikme süresine göre ödemesi
        // gereken toplam ceza tutarını hesaplayan programı yazınız.
        int delayDays = 25; // Gecikme süresi (gün)
        int totalFine;
        if (delayDays <= 7) {
            totalFine = delayDays * 10;
        } else if (delayDays <= 21) {
            totalFine = 100 + (delayDays * 15);
        } else {
            totalFine = 300 + (delayDays * 20);
        }
        System.out.println("Toplam ceza tutarı: " + totalFine + " TL");

        // Soru 16 = Tanımlanan üç kenar uzunluğu ile bir üçgen oluşup oluşamayacağını
        // kontrol
        // ederek sonucu konsola yazdıran programı yazınız. (Üçgen oluşabilmesi için
        // herhangi iki
        // kenarın toplamı diğer kenardan büyük olmalıdır.)
        int side1 = 5;
        int side2 = 10;
        int side3 = 14;
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("Bu kenar uzunluklarıyla bir üçgen oluşturulabilir.");
        } else {
            System.out.println("Bu kenar uzunluklarıyla bir üçgen oluşturulamaz.");
        }

        // Soru 17 = Tanımlanan üç tamsayı değerini kendi aralarında karşılaştırarak
        // küçükten büyüğe olacak şekilde konsola yazdıran programı yazınız.
        int val1 = 42;
        int val2 = 17;
        int val3 = 29;
        int first, second, third;
        if (val1 <= val2 && val1 <= val3) {
            first = val1;
            if (val2 <= val3) {
                second = val2;
                third = val3;
            } else {
                second = val3;
                third = val2;
            }
        } else if (val2 <= val1 && val2 <= val3) {
            first = val2;
            if (val1 <= val3) {
                second = val1;
                third = val3;
            } else {
                second = val3;
                third = val1;
            }
        } else {
            first = val3;
            if (val1 <= val2) {
                second = val1;
                third = val2;
            } else {
                second = val2;
                third = val1;
            }
        }
        System.out.println("Küçükten büyüğe sıralama: " + first + ", " + second + ", " + third);

        // Soru 18 = Tanımlanan üç tamsayı değerinin artan sırada mı, azalan sırada mı
        // yoksa sırasız mı olduğunu kontrol eden programı yazınız.
        int n1 = 7;
        int n2 = 4;
        int n3 = 2;
        if (n1 < n2 && n2 < n3) {
            System.out.println("ARTAN");
        } else if (n1 > n2 && n2 > n3) {
            System.out.println("AZALAN");
        } else {
            System.out.println("SIRASIZ");
        }

        // Soru 19 =Market rafındaki iki farklı firmaya ait bitter çikolatanın gramaj ve
        // fiyat bilgilerine
        // göre fiyat-performans olarak hangi ürünü almanın daha avantajlı olduğunu
        // konsola yazdıran
        // programı yazınız.
        double chocolate1Weight = 150.0; // gram
        double chocolate1Price = 12.0; // TL
        double chocolate2Weight = 200.0; // gram
        double chocolate2Price = 18.0; // TL
        double pricePerGram1 = chocolate1Price / chocolate1Weight;
        double pricePerGram2 = chocolate2Price / chocolate2Weight;
        if (pricePerGram1 < pricePerGram2) {
            System.out.println("Daha avantajlı ürün: Çikolata 1");
        } else if (pricePerGram2 < pricePerGram1) {
            System.out.println("Daha avantajlı ürün: Çikolata 2");
        } else {
            System.out.println("Her iki ürün de aynı fiyat-performansa sahip.");
        }

        // Soru 20 = Tamsayı olarak tanımlanan iki değer ve karakter tipinde tanımlanan operatöre (+, -, *, / veya %) göre, bu iki sayı üzerinde işlem yapan ve sonucu ekrana yazdıran programı yazınız.
        int valA = 20;
        int valB = 5;
        char operator = '/';
        switch (operator) {
            case '+':
                System.out.println("Sonuç: " + (valA + valB));
                break;
            case '-':
                System.out.println("Sonuç: " + (valA - valB));
                break;
            case '*':
                System.out.println("Sonuç: " + (valA * valB));
                break;
            case '/':
                if (valB != 0) {
                    System.out.println("Sonuç: " + (valA / valB));
                } else {
                    System.out.println("Hata: Sıfıra bölme işlemi yapılamaz.");
                }
                break;
            case '%':
                System.out.println("Sonuç: " + (valA % valB));
                break;
            default:
                System.out.println("Geçersiz operatör.");
        }
    }
}