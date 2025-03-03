import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            try {
                System.out.println("\n===== Simple Calculator Program =====");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");
                
                int choice = scanner.nextInt();

                if (choice == 5) {
                    System.out.println("Exiting the calculator. Goodbye!");
                    continueLoop = false;
                    break;
                } 
                if (choice < 1 || choice > 5) {
                    System.out.println("Invalid choice. Please select a number between 1 and 5.");
                    continue; // Restart the loop
                }

                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                double result = 0;
                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error! Division by zero is not allowed.");
                        } else {
                            result = num1 / num2;
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        }
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear the entire input buffer
            }
        }
        scanner.close();
    }
            }
