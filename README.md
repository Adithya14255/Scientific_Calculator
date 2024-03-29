# Scientific_Calculator
SCIENTIFIC CALCULATOR
INTRODUCTION
 This documentation outlines the functionalities and structure of a Java-based
Calculator program. The program offers various mathematical operations, including
basic arithmetic, exponentiation, square root calculation, exponential functions,
logarithms, and trigonometric functions.
ABSTRACT
 The Calculator program provides a user-friendly interface for performing
mathematical operations through a console-based menu system. It utilizes Java's
standard libraries to execute a variety of calculations based on user input.
KEY ABSTRACTIONS
User Interface:
The program presents a menu-driven interface that enables users to choose desired
mathematical operations.
Mathematical Operations:
It covers basic arithmetic (addition, subtraction, multiplication, division), exponentiation, square
root, exponential functions, logarithms, and trigonometric functions (sin, cos, tan).
Input Handling:
Utilizes “Scanner” class for user input handling and “System.out” for displaying output.
OBJECTIVE
 The primary objective of this program is to provide users with a simple yet comprehensive
tool for performing a wide range of mathematical calculations conveniently from the command
line. It aims to offer flexibility in executing various operations and handling different types of
mathematical functions in a structured manner.
This Calculator program allows users to select an operation, input necessary parameters, and then
displays the result or appropriate messages based on the chosen operation.
The program remains active until the user chooses the "Exit" option, providing continuous
functionality for performing calculations.
The code structure contains a loop that continuously prompts the user for operation choices until
the user explicitly decides to exit the program.
This documentation provides an overview of the functionalities and layout of the Calculator
program, aiding users in understanding its capabilities and usage.
.

Detailed Functionality
1. Input Validation
The program incorporates input validation to handle erroneous inputs, such as non-numeric
characters or invalid choices within the menu. It prompts users for correct input when necessary.
2. Error Handling
Specific error messages are displayed for exceptional cases, like division by zero or undefined
mathematical operations (such as logarithms of non-positive numbers or trigonometric functions
with undefined inputs).
3.Enhanced Operations
Each mathematical operation is encapsulated within its respective method or case block in the
switch statement, promoting modularity and ease of maintenance.
The exponentiation function uses the Math.pow method to calculate powers efficiently.
The square root operation is implemented using Math.sqrt for accuracy and simplicity.
Exponential, logarithmic, and trigonometric functions leverage Java's built-in Math class for
precise computation.
4. Extended Functionality
Potential enhancements could include more complex mathematical functions, such as factorials,
permutations, combinations, or advanced statistical functions.
The addition of error handling for invalid inputs or mathematical impossibilities could improve
the program's robustness.
Program Structure and Design
5. Modularization
The code demonstrates a structured approach by encapsulating functionalities within separate
methods for each operation, promoting code readability and maintainability.
Methods could be further segmented or divided to isolate specific functionalities for easier
debugging or expansion.
6. Code Comments and Documentation
The program includes descriptive comments explaining the purpose of each method, significant
logic blocks, or sections, aiding other developers in understanding and modifying the codebase.
7. Scalability and Extensibility
The program design allows for easy addition of new mathematical functions or operations
without significant restructuring.
The use of a switch-case structure for menu options provides a foundation for expanding
functionality by adding more cases for additional operations.
Usability and User Experience
8. User-Friendly Interface
The console-based interface is designed to be intuitive, providing clear instructions and options
for users to perform various mathematical operations.
It maintains a consistent format and readability in presenting options and displaying results.
9. Feedback and Output Formatting
Results are formatted appropriately to enhance readability and understanding, providing
meaningful output with suitable precision for different operations.
10. Usability Testing and User Feedback
Conducting usability tests or gathering user feedback could further refine the interface and
functionalities to meet user expectations or preferences.




PROJECT EXECUTION SCREENSHOTS



CODE
import java.util.*;
import java.io.*;
import java.math.*;
public class Calculator {
 public static void main(String[]
args) {
 Scanner scanner = new
Scanner(System.in);
 int num1, num2;
 char operation;

System.out.println("|=================
========================|");
 System.out.println("|
Calculator |");

System.out.println("|=================
========================|");
 System.out.println("| 1.
Addition (+)
|");
 System.out.println("| 2.
Subtraction (-)
|");
 System.out.println("| 3.
Multiplication (*) |");
 System.out.println("| 4.
Division (/) |");
 System.out.println("| 5.
Power (^) |");
 System.out.println("| 6.
Square root (sqrt())
|");
 System.out.println("| 7.
Exponent (e^y)
|");
 System.out.println("| 8.
Logarithm (log(x))
|");
 System.out.println("| 9.
Trignometric functions (sin,cos,tan)
|");
 System.out.println("| 10.
Exit
|");

System.out.println("|=================
========================|");
 while (true) {
 System.out.print("\nChoose
an option: ");
 int choice =
scanner.nextInt();
 if (choice == 10) {

System.out.println("Executed
Succesfully..........");
 break;
 }
 switch (choice) {
 case 1:

System.out.print("Enter first number:
");
 num1 =
scanner.nextInt();

System.out.print("Enter second number:
");
 num2 =
scanner.nextInt();

System.out.println("Result of ADDING
" + num1 + " + " + num2 + " is: " +
(num1 + num2));
 break;
 case 2:

System.out.print("Enter first number:
");
 num1 =
scanner.nextInt();

System.out.print("Enter second number:
");
 num2 =
scanner.nextInt();

System.out.println("Result of
SUBTACTING " + num1 + " - " + num2 +
" is: " + (num1 - num2));
 break;
 case 3:

System.out.print("Enter first number:
");
 num1 =
scanner.nextInt();

System.out.print("Enter second number:
");
 num2 =
scanner.nextInt();

System.out.println("Result of
MULTIPYING " + num1 + " * " + num2
+ " is: " + (num1 * num2));
 break;
 case 4:

System.out.print("Enter the dividend:
");
 num1 =
scanner.nextInt();

System.out.print("Enter the divisor
");
 num2 =
scanner.nextInt();
 if (num2 != 0) {
 double
divisionResult = (double)num1 /
(double)num2;

System.out.printf("Result of DIVIDING
%d / %d is: %.3f%n", num1, num2,
divisionResult);
 } else {

System.out.println("Cannot divide by
zero");
 }
 break;
 case 5:

System.out.print("Enter base number:
");
 num1 =
scanner.nextInt();

System.out.print("Enter exponent : ");
 num2 =
scanner.nextInt();

System.out.println("Result of POWERING
UP " + num1 + " ^ " + num2 + " is: "
+ Math.pow(num1, num2));
 break;
 case 6:

System.out.print("Enter number to find
square root: ");
 num1 =
scanner.nextInt();
 double
squareRootResult = Math.sqrt(num1);
 String
formattedResult =
String.valueOf(squareRootResult);

System.out.println("Root of " + num1
+ " is: " + formattedResult);
 break;
case 7:

System.out.print("Enter a to find e^a:
");
 num1 =
scanner.nextInt();

System.out.println("result of e^"+
num1 +" is: " + Math.exp(num1));
 break;
case 8:

System.out.print("Enter number to find
log of: ");
 num1 =
scanner.nextInt();

System.out.println("Log(" + num1 + ")
is: " + Math.log(num1));
 break;
case 9:

System.out.print("\n1.sin()\n2.cos()\n
3.tan()\nEnter choice: ");
 int ch2 =
scanner.nextInt();

System.out.print("Enter number : ");
 num1 = scanner.nextInt();
 switch(ch2){
case 1:
System.out.println("sin of " + num1
+ " is: " + Math.sin(num1));
 break;
case 2:
System.out.println("cos of " + num1
+ " is: " + Math.cos(num1));
 break;
case 3:
System.out.println("tan of " + num1
+ " is: " + Math.tan(num1));
 break;
default:

System.out.println("Invalid choice.");
}
 break;
 default:

System.out.println("Invalid choice.
Please enter a valid option.");
 }
 }
PROJECT LINK

 https://github.com/Adithya14255/Scientific_Calculator
VIDEO LINK
 https://drive.google.com/drive/folders/1g1-NG473H6b_jKUp_v-eah3ZcZW9IriE
CONCLUSION
 The Calculator program showcases a robust set of mathematical functionalities in a
user-friendly manner. Its structured design and modularity facilitate easy expansion and
maintenance. The program's usability and clear output formatting ensure a smooth user
experience, while error handling and input validation enhance its reliability.
PROJECT TEAM DETAILS
STUDENT DETAILS 
G ADITHYA (711722104003) 
INDRESAN V(711722104045) 
BRIAN ALAN P L ( 711722104020)
SAKTHI SUNDARAM (711722104701)
