package javaprograms;
//2. Rewrite the student mark sheet programme (From java-homework-week3
//programmes) using if else and while loop.

import java.util.Scanner;
public class MarkSheet {
    public static void main(String[] args) {

        // we use scanner object to take user input for the student's name, roll number, and marks in math, science, and english
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name! ");
        String name = scanner.nextLine();
        System.out.println("Enter roll number: ");
        int rollNo = scanner.nextInt();
        System.out.println("Enter math marks: ");

        // For each mark entered, it checks whether it is within the valid range of 0 to 100.
        int math = scanner.nextInt();
        if (math < 0 || math > 100){
            System.out.println("Invalid input, marks should be between 0 and 100");
            return;
        }
        System.out.println("Enter science marks: ");
        int science = scanner.nextInt();
        if (science < 0 || science > 100){
            System.out.println("Invalid input, marks should be between 0 and 100");
            return;
        }
        System.out.println("Enter english marks: ");
        int english = scanner.nextInt();
        if (english < 0 || english > 100){
            System.out.println("Enter input, marks should be between 0 and 100 ");
            return;
        }

        // It calculates the total marks and percentage based on the marks entered.

        int total = math + science + english;
        double percentage = (double) total / 3;
        String result;
        if (percentage >= 35){   //Use if-else statement to know whether the student has passed or failed based on percentage.
                                 // If the percentage is grater than or equal to 35, the student pass, otherwise fail.
            result = "Pass";

        }else {
            result = "Fail";
        }
        String grade;
        if (percentage >= 80){    //Use if-else statement to assign a grade based on the percentage.

            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        }else {
            grade = "0";

        }
        System.out.println("\nStudent Details:"); //Print out student's details
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Math Marks: " + math);
        System.out.println("Science Marks: " + science);
        System.out.println("English Marks: " + english);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + result);
        System.out.println("Grade: " + grade);

    }

    }



