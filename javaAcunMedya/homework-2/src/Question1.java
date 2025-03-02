import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[10];
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the "+(i+1)+"th number: ");
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        double average = (double) total / 10;
        System.out.println("Average of the array: "+ average);

        System.out.println("Numbers greater than 50 in array: ");
        for(int num : numbers){
            if(num >50)
            {
                System.out.println(num + " ");
            }
        }
        scanner.close();
    }
}