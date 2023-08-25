package loops;

import java.util.Scanner;

public class PowerTwo {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i *= 2){
            System.out.print(i);
        }
    }
}

//Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran program