import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYili = scanner.nextInt();

        if (dogumYili < 1900) {
            System.out.println("Geçerli bir doğum yılı giriniz (1900 ve sonrası).");
            return;
        }

        String[] cinZodyagi = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        int zodyakIndeks = (dogumYili - 1900) % 12;

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi[zodyakIndeks]);
    }
}
