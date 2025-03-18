package newHomeworks;

import java.util.Scanner;

public class Ocak4 {
    public static void main(String[] args) {
        //Part-1
//        Döngüler, belirli bir koşul sağlandığı sürece tekrar eden işlemleri gerçekleştirmek için kullanılır. Böylece kod tekrarını önler ve daha verimli bir programlama sağlar.
//
//        Kullanım Alanları:
//
//        Liste veya dizi elemanlarını gezmek (örneğin, bir dizideki tüm elemanları yazdırmak)
//        Belirli bir sayıda işlem yapmak (örneğin, 1’den 100’e kadar sayıların toplamını bulmak)
//        Kullanıcıdan alınan verilerle çalışmak (örneğin, şifre doğrulama işlemi)
//        Oyun geliştirme, veri analizi ve yapay zeka modellerinde döngüsel işlemleri gerçekleştirmek
//        for Döngüsü: Genellikle belirli bir sayıda işlem yapılacaksa kullanılır.
//        while Döngüsü: Koşul sağlandığı sürece çalışır, genellikle koşul bilinmiyorsa tercih edilir.
        //Part-2
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
        //Part-3
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println(sum);

        scanner.close();
    }
}
