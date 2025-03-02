import java.util.Arrays;

public class Question10 {
    public static void main(String[] args) {

        //Sort -> Diziyi küçükten büyüğe, alfabetik sıralar.
        int[] numbers = {5, 3, 8, 1, 2};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------------------");

        // Binearysearch girilen değerin indexini söyler.
        int[] numbers2 = {30,5,58,99,101,44};
        int index = Arrays.binarySearch(numbers2, 5);
        System.out.println("The index is: " + index);

        System.out.println("---------------------------------------------");

        // Arrays.copyofrange -> girilen değerlerin arasında kalan bölümü kopyalar
        int[] numbers3 = {58,34,21,46,6,5};
        int[] newArray = Arrays.copyOfRange(numbers3, 1, 4);
        System.out.println("Copied Array: " + Arrays.toString(newArray));

        System.out.println("---------------------------------------------");

        // .Equals -> Değerlerin eşitliğini karşılaştırır.
        int [] numbers4 = {58,34,1907};
        int [] numbers5 = {58,34,1907};

        boolean isEqual = Arrays.equals(numbers4, numbers5);
        System.out.println("is this both arrays equals each other? : " + isEqual);

        System.out.println("---------------------------------------------");

        // Fill -> Bir Dizinin Tüm öğelerini belirtilen değer ile doldurur.
        int[] numbers6 = new int[5];
        Arrays.fill(numbers6, 7);
        System.out.println(Arrays.toString(numbers6));
    }
}
