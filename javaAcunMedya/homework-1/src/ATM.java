import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        String userPassword = "12345";
        double balance = 10000.0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter your PIN: ");
            String password = scanner.next();

            if (password.equals(userPassword)) {
                System.out.println("Login successful!");

                while (true) {
                    System.out.println("--- ATM Menu ---");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit Money");
                    System.out.println("3. Withdraw Money");
                    System.out.println("4. Exit");
                    System.out.println("Select an option: ");
                    int choice = scanner.nextInt();

                    if (choice == 1) {
                        System.out.println("Your balance: "+ balance+ " TL.");
                        System.out.println("--------------------");

                    } else if (choice == 2) {
                        System.out.println("Enter the amount to deposit: ");
                        double deposit = scanner.nextDouble();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println(deposit+" TL deposited. New balance "+balance+" TL");
                            System.out.println("--------------------");
                        } else {
                            System.out.println("Invalid Amount");
                            System.out.println("--------------------");

                        }
                    } else if (choice == 3) {
                        System.out.print("Enter the amount of draw: ");
                        double withdraw = scanner.nextDouble();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println(withdraw+" TL withdrawn. New balance "+balance+" TL");
                            System.out.println("--------------------");

                        } else {
                            System.out.println("Insufficient balance or invalid amount!");
                            System.out.println("--------------------");

                        }
                    } else if (choice == 4) {
                        System.out.println("Exiting... Have a nice day!");
                        break;
                    } else {
                        System.out.println("Please select a valid option!");
                        System.out.println("--------------------");

                    }
                }
                break;
            } else {
                System.out.println("Incorrect password. Please try again!");
                System.out.println("--------------------");

            }
        }
        scanner.close();
    }
}

