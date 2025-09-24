package levelOneBeginner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    // Method to perform calculation
    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException(" Cannot divide by zero.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException(" Invalid operator! Please use +, -, *, /");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n===============================");
        System.out.println("\t Advanced Calculator");
        System.out.println("===============================");

        boolean keepRunning = true;

        while (keepRunning) {
            try {
                // Input first number
                System.out.print("\n Enter first number: ");
                double num1 = scan.nextDouble();

                // Input second number
                System.out.print(" Enter second number: ");
                double num2 = scan.nextDouble();

                // Operator input
                System.out.print(" Choose an operator (+, -, *, /): ");
                char operator = scan.next().charAt(0);

                // Calculation
                double result = calculate(num1, num2, operator);

                // Display result
                System.out.println("\n Result: " + num1 + " " + operator + " " + num2 + " = " + result);

            } catch (InputMismatchException e) {
                System.out.println("\n Invalid input! Please enter numbers only.");
                scan.nextLine(); // clear scanner buffer
            } catch (Exception e) {
                System.out.println("\n Error: " + e.getMessage());
            }

            // Ask user if they want to continue
            System.out.print("\n🔄 Do you want to perform another calculation? (y/n): ");
            char choice = scan.next().toLowerCase().charAt(0);

            if (choice == 'n') {
                keepRunning = false;
            }
        }

        System.out.println("\n Thanks for using Advanced Calculator!");
        scan.close();
    }
}
