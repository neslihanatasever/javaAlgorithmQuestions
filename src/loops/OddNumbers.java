package loops;

import java.util.Scanner;
public class OddNumbers {
    public static void main(String[] args) {
        int n;
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Sayı giriniz: ");
            n = scanner.nextInt();
            if (n % 2 == 1) {
                total += n;
            }
        } while (n > 0);
        System.out.printf("toplam" + total);
    }
}
