public class Question3 {
    public static void main(String[] args) {

        int [] numbers = {8,-7,6,10,-9,29,52,-88,14};
        int positiveSum= 0;
        int negativeSum = 0;

        for (int num : numbers) {
            if(num > 0)
            {
                positiveSum+= num;
            }
            else {
                negativeSum+= num;
            }
        }
        System.out.println("Sum of the positive numbers: "+positiveSum);
        System.out.println("Sum of the negative numbers: "+negativeSum);
    }
}
