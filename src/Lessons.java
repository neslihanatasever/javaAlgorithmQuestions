import java.util.Scanner;
public class Lessons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik sınav puanını giriniz: ");
        double matematik = scanner.nextDouble();

        System.out.print("Fizik sınav puanını giriniz: ");
        double fizik = scanner.nextDouble();

        System.out.print("Kimye sınav puanını giriniz: ");
        double kimya = scanner.nextDouble();

        System.out.print("Türkçe sınav puanını giriniz: ");
        double turkce = scanner.nextDouble();

        System.out.print("Tarih sınav puanını girin: ");
        double tarih = scanner.nextDouble();

        System.out.print("Müzik sınav puanını girin: ");
        double muzik = scanner.nextDouble();

        // Ortalama hesaplama
        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Matematik: " + matematik);
        System.out.println("Fizik: " + fizik);
        System.out.println("Kimya: " + kimya);
        System.out.println("Türkçe: " + turkce);
        System.out.println("Tarih: " + tarih);
        System.out.println("Müzik: " + muzik);

        System.out.println("Ortalama: " + ortalama);

        scanner.close();
    }
}

