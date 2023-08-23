import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        if (mesafe <= 0) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }

        System.out.printf("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        if (yas <= 0) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }

        System.out.printf("Yolculuk tipini giriniz (1=> Tek yön, 2=> Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        if (yolculukTipi != 1 && yolculukTipi != 2) {
            System.out.printf("Hatalı veri girdiniz!");
            return;
        }

        double normalTutar = mesafe * 0.10;
        double indirimliTutar = normalTutar;

        if (yas < 12) {
            indirimliTutar -= normalTutar * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            indirimliTutar -= normalTutar * 0.10;
        } else if (yas >= 65) {
            indirimliTutar -= normalTutar * 0.30;
        }

        if (yolculukTipi == 2) {
            indirimliTutar -= indirimliTutar * 0.20;
            indirimliTutar *= 2;
        }

        System.out.printf("Toplam tutar = " + indirimliTutar + "TL");
    }
}
