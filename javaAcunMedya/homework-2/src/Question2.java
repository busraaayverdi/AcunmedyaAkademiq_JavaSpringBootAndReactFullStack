import java.util.HashSet;
public class Question2 {
    public static void main(String[] args) {
        int[] array1 = {5, 3, 8, 3, 1, 5, 8};
        HashSet<Integer> repeatres = new HashSet<>();
        HashSet<Integer> numbers = new HashSet<>();

        System.out.print("Repeating numbers: ");
        for (int num : array1) {
            if (numbers.contains(num)) {
                repeatres.add(num);
            } else {
                numbers.add(num);
            }
        }

        for (int num : repeatres) {
            System.out.print(num + " ");
        }
    }
}
