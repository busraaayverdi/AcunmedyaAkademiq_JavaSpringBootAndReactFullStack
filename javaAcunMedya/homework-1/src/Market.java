import java.util.Scanner;
public class Market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstProduct =50;
        int secondProduct =30;
        int thirdProduct =80;
        int total =0;
        while (true){
            System.out.println("Please select the product you want:");
            System.out.println("1) Apple: "+firstProduct+ " TL");
            System.out.println("2) Grape: "+secondProduct+ " TL");
            System.out.println("3) Watermelon: "+thirdProduct+ " TL");
            System.out.println("4) Proceed to payment: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    total += firstProduct;
                    break;
                case 2:
                    total += secondProduct;
                    break;
                case 3:
                    total += thirdProduct;
                    break;
                case 4:
                    System.out.println("The acoount to be paid is " + total + " TL ");
                    System.out.println("Do you have a discount coupon? Yes-Y or No-N");
                    char discountCoupon = scanner.next().charAt(0);
                    if (discountCoupon =='Y'){
                        double discount = total * 0.10;
                        total -= discount;
                        System.out.println("Discount applied, amount to be paid: "+ total+" TL");
                    }else {
                        System.out.println("The amount to be paid: "+ total+" TL" );
                    }
                    return;
                default:
                    System.out.println("Invalid choice. Try again...");
            }
        }

    }
}