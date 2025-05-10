import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kebab = 25.0;
        double burger = 15.0;
        double pasta = 20.0;
        double salad = 10.0;
        double total = 0.0;
        int choice;
        do {
            System.out.println("What would you like to order?");
            System.out.println("1. Kebab - 25.0 TL");
            System.out.println("2. Burger - 15.0 TL");
            System.out.println("3. Pasta - 20.0 TL");
            System.out.println("4. Salad - 10.0 TL");
            System.out.println("0. Complete order");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    total += kebab;
                    System.out.println("You have added a kebab to your order.");
                    System.out.println("Your total is: " + total+ " TL");
                    System.out.println("----------------------");
                    break;
                case 2:
                    total += burger;
                    System.out.println("You have added a burger to your order.");
                    System.out.println("Your total is: " + total+ " TL");
                    System.out.println("----------------------");
                    break;
                case 3:
                    total += pasta;
                    System.out.println("You have added a pasta to your order.");
                    System.out.println("Your total is: " + total+ " TL");
                    System.out.println("----------------------");
                    break;
                case 4:
                    total += salad;
                    System.out.println("You have added a salad to your order.");
                    System.out.println("Your total is: " + total+ " TL");
                    System.out.println("----------------------");
                    break;
                case 0:
                    System.out.println("Thank you for your order. Your total is: " + total+" TL");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println("----------------------");
                    break;
            }
        } while (choice != 0);
    }
}
