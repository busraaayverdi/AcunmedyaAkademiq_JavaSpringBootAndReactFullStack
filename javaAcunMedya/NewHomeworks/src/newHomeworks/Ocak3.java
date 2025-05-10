package newHomeworks;

import java.util.Scanner;

public class Ocak3 {
    public static void main(String[] args) {
        //Part1
        //Koşullu ifadeler, belirli bir şartın sağlanıp sağlanmadığını kontrol eder ve programa farklı yollar çizerek karar mekanizması oluşturur.
        //Eğer 100 TL’den fazla paranız varsa, istediğiniz kahveyi alabilirsiniz.
        //Eğer 100 TL’den az paranız varsa, sadece küçük boy kahve alabilirsiniz.
        //Eğer hiç paranız yoksa, kahve alamazsınız.

        //Part2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        //Part3

        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();

        if (num1 > 0) {
            System.out.println("The number is positive.");
        } else if (num1 < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number eguals 0 .");
        }


    }
}
