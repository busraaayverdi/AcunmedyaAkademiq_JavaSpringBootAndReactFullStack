package BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("Büşra Ayverdi", 23000.0);
        BankAccount checking = new CheckingAccount("Muhammed İnan", 50890.0);


        savings.calculateInterest();
        checking.calculateInterest();
    }
}
