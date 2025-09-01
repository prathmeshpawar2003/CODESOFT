import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();
        while (subjects <= 0) {
            System.out.print("Please enter a positive number of subjects: ");
            subjects = sc.nextInt();
        }

        int total = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + " (0-100): ");
            int marks = sc.nextInt();
            while (marks < 0 || marks > 100) {
                System.out.print("Please enter valid marks (0-100) for subject " + i + ": ");
                marks = sc.nextInt();
            }
            total += marks;
        }

        double average = (double) total / subjects;
        char grade;
        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 40) grade = 'D';
        else grade = 'F';

        System.out.println();
        System.out.println("Result:");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

