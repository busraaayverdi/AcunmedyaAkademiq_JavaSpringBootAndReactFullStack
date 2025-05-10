package AbstractAndInterface.Interface;

public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();

        creditCard.pay(200);
        paypal.pay(350);
    }
}
