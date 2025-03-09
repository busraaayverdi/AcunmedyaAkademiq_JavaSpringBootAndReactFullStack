package BankAccount;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.05;
        System.out.println("Savings Account Interest: " + interest);
    }
}
