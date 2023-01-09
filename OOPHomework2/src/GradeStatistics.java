import java.util.Scanner;

public class GradeStatistics {
    static Scanner sc = new Scanner(System.in);

    static int[] grades;

    public static void main(String[] args) {
        final int NUM_STUDENT = sc.nextInt();
        int[] grades = readGrades(NUM_STUDENT);

        System.out.println("The average is " + calAverage(grades));
        System.out.println("The minium is " + findMin(grades));
        System.out.println("The maxium is " + findMax(grades));
    }

    static int[] readGrades(int number) {
        boolean isValid;
        int[] grades = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the mark (0-100) for student " + (i + 1));
            grades[i] = sc.nextInt();
            isValid = false;
            do {
                if (grades[i] >= 0 && grades[i] <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                    System.out.println("Enter the grade for student " + i);
                    grades[i] = sc.nextInt();
                }
            } while (!isValid);
        }
        return grades;
    }

    static double calAverage(int[] grades) {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    static int findMin(int[] grades) {
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    static int findMax(int[] grades) {
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }
}
