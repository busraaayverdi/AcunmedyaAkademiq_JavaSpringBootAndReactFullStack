import java.util.ArrayList;

public class Question9 {
    public static void main(String[] args) {
        // get belirli bir indexteki veriyi döndürür.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        String fruit = fruits.get(1);
        System.out.println("fruit which is index in 1: " + fruit);
        System.out.println("---------------------------------------");
        // set bir ögeyi verilen indexe göre değiştirir.
        ArrayList<String> names = new ArrayList<>();
        names.add("Büşra");
        names.add("Ali");

        names.set(0, "Ayşe");
        System.out.println("New names : " + names);

        System.out.println("---------------------------------------");

        // remove belirli bir indexteki veriyi siler.
        ArrayList<Character> harfler = new ArrayList<>();
        harfler.add('B');
        harfler.add('A');
        harfler.add('C');
        harfler.add('D');

        harfler.remove(1);
        System.out.println("New list " + harfler);

        System.out.println("---------------------------------------");

        // Clear tüm listeyi siler.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(58);
        numbers.add(34);

        numbers.clear();
        System.out.println("New list " + numbers);

        System.out.println("---------------------------------------");

    }
}
