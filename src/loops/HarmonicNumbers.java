package loops;

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double result = 0.0;
        for (double i = 1; i <= n; i++) {
            result += (1 / i);
        }
        System.out.println(result);
    }
}

// 1. döngü:  i =1; result = 0 + (1/1) = 1;
// 2. döngü:  i =2; result = 1 + (1/2) = 1,5;