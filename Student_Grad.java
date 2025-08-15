import java.util.Scanner;

public class Student_Grad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        
        int numSubjects = 5;
        int[] marks = new int[numSubjects];
        String[] subjects = {"Math", "Science", "English", "History", "Computer"};

        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for " + subjects[i] + " (out of 100): ");
            marks[i] = scanner.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
                return;
            }
        }

          // Calculate total and percentage

        int total = 0;
        for (int mark : marks) {
            total += mark;
        }

        double percentage = total / (double) numSubjects;
        String grade;

           // Grade logic

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

          // Output results

        System.out.println("\n--- Student Report Card ---");
        System.out.println("Name: " + name);
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }

        System.out.println("Total Marks: " + total + "/" + (numSubjects * 100));
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

