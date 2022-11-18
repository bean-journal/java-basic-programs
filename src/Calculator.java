import java.util.Scanner;

// Java Program to make a Simple Calculator
class Calculator {
  public static void main(String[] args) {

    char operator;
    int num1, num2, result;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number : ");
    num1 = scanner.nextInt();

    System.out.print("\nChoose operation to perform (+, -, *, /) : ");
    operator = scanner.next().charAt(0);

    System.out.print("\nEnter second number : ");
    num2 = scanner.nextInt();

    scanner.close();

    switch (operator) {

      //ADDITION
      case '+':
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        break;

      //SUBTRACTION
      case '-':
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        break;

      //MULTIPLICATION
      case '*':
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        break;

      //DIVISION
      case '/':
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
        break;

      //INVALID OPERATOR
      default:
        System.out.println("\n Invalid operation selected. Please try again.");
        break;
    }
  }
}