import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operation;
            System.out.println("============================");
            System.out.println("|  Scientific Calculator   |");
            System.out.println("|==========================|");
            System.out.println("| 1. Addition (+)          |");
            System.out.println("| 2. Subtraction (-)       |");
            System.out.println("| 3. Multiplication (*)    |");
            System.out.println("| 4. Division (/)          |");
            System.out.println("| 5. Power (^)             |");
            System.out.println("| 6. Square root (s)       |");
            System.out.println("| 7. Exit                  |");
            System.out.println("|==========================|");
        while (true) {

            System.out.print("\nChoose an option: ");
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("THANKS FOR USING ME");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result of ADDING  " + (int) num1 + " + " + (int) num2 + " is: " + (int) (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result of SUBTACTING  " + (int) num1 + " - " + (int) num2 + " is: " + (int) (num1 - num2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result of MULTIPYING  " + (int) num1 + " * " + (int) num2 + " is: " + (int) (num1 * num2));
                    break;

                case 4:
                    System.out.print("Enter the dividend: ");
                    num1 = scanner.nextDouble();
                    
                    System.out.print("Enter the divisor ");
                    num2 = scanner.nextDouble();
                
                    if (num2 != 0) {
                        double divisionResult = num1 / num2;
                        System.out.printf("Result of DIVIDING  %.0f / %.0f is: %.3f%n", num1, num2, divisionResult);
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                

                case 5:
                    System.out.print("Enter base number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result of POWERING UP  " + (int) num1 + " ^ " + (int) num2 + " is: " + (int) Math.pow(num1, num2));
                    break;
                // Your existing code

                case 6:
                    System.out.print("Enter number to find square root: ");
                    num1 = scanner.nextDouble();
                    double squareRootResult = Math.sqrt(num1);
                    String formattedResult = String.format("%.0f", squareRootResult);
                    System.out.println("Result of SQUARING  " + num1 + " is: " + formattedResult);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        scanner.close();
    }
}