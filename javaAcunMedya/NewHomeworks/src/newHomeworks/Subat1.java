package newHomeworks;

import java.util.Scanner;

public class Subat1 {
    public static void main(String[] args) {
        //Part-1
        //Dizi (Array), aynı türdeki birden fazla veriyi
        // tek bir değişken altında saklamamızı sağlayan bir veri yapısıdır.

        //int[] num1 = new int[5];
        //int[] num2 = {10, 20, 30, 40, 50};

        //Part-2
        Scanner scanner = new Scanner(System.in);

        int[] sayilar = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını girin: ");
            sayilar[i] = scanner.nextInt();
        }

        System.out.print("Girilen dizi: ");
        for (int i = 0; i < 5; i++) {
            System.out.print( sayilar[i] + " ");
        }
        //Part-3
        System.out.println();
        System.out.print("Kaç elemanlı bir dizi oluşturmak istiyorsunuz? ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını girin: ");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Dizideki en büyük sayı: " + max);

        scanner.close();

    }
}
