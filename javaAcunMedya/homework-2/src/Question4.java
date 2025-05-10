import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter ten number: ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        numbers.sort(Collections.reverseOrder());
        System.out.println("Sorted numbers: " + numbers);
    }
}