import java.util.ArrayList;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("İstanbul");
        cities.add("Antalya");
        cities.add("İzmir");
        cities.add("Bursa");
        cities.add("Denizli");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a city: ");
        String enteredCity = scanner.nextLine();

        int indeks = cities.indexOf(enteredCity);

        if (indeks != -1) {
            System.out.println(enteredCity + " is in list and its index is : " + indeks);
        } else {
            System.out.println(enteredCity + " is not in list.");
        }

        scanner.close();

    }
}