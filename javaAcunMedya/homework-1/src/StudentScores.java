import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[5];
        int average = 0;
        int sum = 0;
        boolean lowGrade = false;

        System.out.print("Enter the grade for subject 1: ");
        grades[0] = scanner.nextInt();
        int highestGrade = grades[0];
        int lowestGrade = grades[0];
        sum += grades[0];

        for (int i = 1; i < grades.length; i++) {
            System.out.print("Enter the grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
            sum += grades[i];

            if (grades[i] > highestGrade) {
                highestGrade = grades[i];
            }
            if (grades[i] < lowestGrade) {
                lowestGrade = grades[i];
            }
            if (grades[i] < 30) {
                lowGrade = true;
            }
        }

        average = sum / grades.length;
        System.out.println("Average grade: " + average);

        if (average > 50) {
            System.out.println("You passed the course.");
        } else {
            System.out.println("You failed the course.");
        }

        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);

        if (lowGrade) {
            System.out.println("Warning: You have courses with low grades!");
        }

        scanner.close();
    }
}