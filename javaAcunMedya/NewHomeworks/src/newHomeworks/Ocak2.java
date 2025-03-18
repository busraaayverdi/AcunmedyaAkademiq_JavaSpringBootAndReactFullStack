package newHomeworks;

import java.util.Scanner;

public class Ocak2 {
    public static void main(String[] args) {
//        byte	1   -128 ile 127 arasında tamsayı saklar.
//        short	2	-32,768 ile 32,767 arasında tamsayı saklar.
//        int	4	-2³¹ ile 2³¹-1 arasında tamsayı saklar.
//        long	8	-2⁶³ ile 2⁶³-1 arasında tamsayı saklar.
//        float	4	Ondalıklı sayılar için kullanılır (7 basamak hassasiyet).
//        double	8	Ondalıklı sayılar için kullanılır (15 basamak hassasiyet).
//        char	2	Tek bir karakter saklar (Unicode destekli).
//        boolean	1 (değişken)	true veya false değerlerini alır.


//PART2
        // Double veri tipi int den daha üstün olduğu için sonuç 13.5 çıkar.

//PART3
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter your second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.println("Sum of numbers: " + sum);

        scanner.close();


    }
}
