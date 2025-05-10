package BankAccount;

public class CheckingAccount  extends BankAccount{

    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Checking accounts do not earn interest.");
    }
}