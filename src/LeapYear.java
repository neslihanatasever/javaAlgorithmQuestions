import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int yil = scanner.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " artık bir yıldır.");
                } else {
                    System.out.println(yil + " artık bir yıl değildir.");
                }
            } else {
                System.out.println(yil + " artık bir yıldır.");
            }
        } else {
            System.out.println(yil + " artık bir yıl değildir.");
        }
    }
}
