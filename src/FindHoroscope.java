import java.util.Scanner;

public class FindHoroscope {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int day, month;
        String astrosign = "";
        boolean isError = false;

        System.out.print("Doğduğunuz ayı dahil edin (rakamla): ");
        month = inp.nextInt();
        System.out.print("Doğduğunuz günü dahil edin: ");
        day = inp.nextInt();

        if (month == 1 && (day >= 1 && day <= 31)) {
            if (day >= 1 && day <= 21) {
                astrosign = ("Oğlak");
            } else {
                astrosign = ("Kova");
            }
        } else if (month == 2 && (day >= 1 && day <= 29)) {
            if (day >= 1 && day <= 19) {
                astrosign = ("Kova");
            } else {
                astrosign = ("Balık");
            }
        } else if (month == 3 && (day >= 1 && day <= 31)) {
            if (day >= 1 && day <= 20) {
                astrosign = ("Balık");
            } else {
                astrosign = ("Koç");
            }
        } else if (month == 4 && (day >= 1 && day <= 30)) {
            if (day >= 1 && day <= 21) {
                astrosign = ("Koç");
            } else {
                astrosign = ("Boğa");
            }
        } else if (month == 5 && (day >= 1 && day <= 31)) {
            if (day >= 1 && day <= 21) {
                astrosign = ("Boğa");
            } else {
                astrosign = ("İkizler");
            }
        } else if (month == 6 && (day >= 1 && day <= 30)) {
            if (day >= 1 && day <= 22) {
                astrosign = ("İkizler");
            } else {
                astrosign = ("Yengeç");
            }
        } else if (month == 7 && (day >= 1 && day <= 31)) {
            if (day >= 1 && day <= 22) {
                astrosign = ("Yengeç");
            } else {
                astrosign = ("Aslan");
            }
        } else if (month == 8 && (day >= 1 && day <= 31)) {
            if (day >= 1 && day <= 22) {
                astrosign = ("Aslan");
            } else {
                astrosign = ("Başak");
            }
        } else if (month == 9 && (day >= 1 && day <= 30)) {
            if (day >= 1 && day <= 22) {
                astrosign = ("Başak");
            } else {
                astrosign = ("Terazi");
            }
        } else if (month == 10 && (day >= 1 && day <= 31)) {
            if (day >= 1 && day <= 22) {
                astrosign = ("Terazi");
            } else {
                astrosign = ("Akrep");
            }
        } else if (month == 11 && (day >= 1 && day <= 30)) {
            if (day >= 1 && day <= 21) {
                astrosign = ("Akrep");
            } else {
                astrosign = ("Yay");
            }
        } else if (month == 12 && (day >= 1 && day <= 31)) {
            if (day >= 1 && day <= 21) {
                astrosign = ("Yay");
            } else {
                astrosign = ("Oğlak");
            }
        } else {
            isError = true;
            System.out.println("Doğru tarih giriniz");
        }

        if (isError == false)
            System.out.println("Burcunuz: " + astrosign);
    }
}