import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speedLimit = 90;
        System.out.print("Please enter the driver's speed: ");
        int speed = scanner.nextInt();

        if (speed <= speedLimit) {
            System.out.println("Speed limit not exceeded, no fine will be applied.");
        } else if (speed >= 90 && speed < 110) {
            System.out.println("Speed limit exceeded, a fine of 1000 TL will be applied.");
        } else if (speed >= 110 && speed < 130) {
            System.out.println("Speed limit exceeded, a fine of 2000 TL will be applied.");
        } else if (speed >= 130) {
            System.out.println("Speed limit greatly exceeded, the driver's license will be confiscated.");
        }

        scanner.close();
    }
}

