package calculate;

import java.util.Scanner;

public class Main {

    // We crate a 'Main' method which is uses a scanner object to take user input for two integers and mathematical symbol,
    // and calls the 'calculateResult' method of the calculator class to perform calculation and print the result.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char choice = 'Y';
        while (choice == 'Y'){
            System.out.println("Enter first number: ");
            int a = scanner.nextInt();
            System.out.println("Enter second number: ");
            int b = scanner.nextInt();
            System.out.println("Please enter one of the symbol +, -, *, /: ");
            char symbol = scanner.next().charAt(0);
            calculator.calculateResult(a, b, symbol);
            // User is asked if they would like to perform another calculation, and the program continues to loop
            // until the user enters Y or N
            System.out.println("Would you like to do more calculation? please enter \"Y\" or \"N\" : ");
            choice = scanner.next().charAt(0);

        }
        scanner.close();
    }
}
