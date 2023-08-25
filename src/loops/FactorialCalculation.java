package loops;

import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyel sayısı: ");
        int n = scanner.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        System.out.printf(n + "faktöriyel" + total);
    }
}
//Java ile faktöriyel hesaplayan program