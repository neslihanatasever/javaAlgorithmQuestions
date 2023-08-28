package loops;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        int number = scanner.nextInt();
        scanner.close();

        if (isAmstrongNumber(number)) {
            System.out.println(number + " bir amstrong sayısıdır");
        } else {
            System.out.println(number + " bir amstrong sayısı değildir");
        }
    }

    public static boolean isAmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = (int) Math.log10(num) + 1;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        return originalNum == sum;
    }
}


/*
bu algoritmada kullanıcıdan bir sayı istiyoruz ve armstrong sayı mı değil mi onu kontrol ediyoruz.

gelen sayının yedeği alınır ("originalNum") çünkü işlem sonunda sayı değişebilir. sonucu karsılastırmak için
orjinal sayıya ihtiyacımız var.
toplam hesaplamak içinde bir değişken tanımladık (sum)
sayının basamak sayısını hesaplamak için bir değişken tanımladık (numDigits)

"isArmstrongNumber" fonksiyonunda, sayının rakamlarının kuvvetlerinin toplamının sayıya eşit olup olmadığı,
kontrol edilir. burada "numDigits" sayının basamak sayısını temsil ediyor. her basamağın kuvvetleri toplamı
hesaplanarak, sonuç orjinal sayı ile karşılaştırılıyor. Eğer eşitse armstrong sayıdır.

 */
