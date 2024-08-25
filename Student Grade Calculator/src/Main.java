import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Assuming there are 5 subjects
        int totalSubjects = 5;
        int[] scores = new int[totalSubjects];
        int sumOfMarks = 0;

        // Input marks for each subject
        for (int subject = 0; subject < totalSubjects; subject++) {
            System.out.print("Enter the marks obtained in subject " + (subject + 1) + ": ");
            scores[subject] = input.nextInt();
            sumOfMarks += scores[subject];
        }

        // Calculate average percentage
        double percentage = (double) sumOfMarks / totalSubjects;

        // Determine grade
        String finalGrade;
        if (percentage >= 90) {
            finalGrade = "A";
        } else if (percentage >= 80) {
            finalGrade = "B";
        } else if (percentage >= 70) {
            finalGrade = "C";
        } else if (percentage >= 60) {
            finalGrade = "D";
        } else {
            finalGrade = "F";
        }

        // Display results
        System.out.println("Total Marks: " + sumOfMarks);
        System.out.println("Average Percentage: " + percentage + "%");
        System.out.println("Grade: " + finalGrade);

        input.close();
    }
}
