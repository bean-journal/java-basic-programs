import java.util.Scanner;

// Java Program To Add Two Numbers Taking Input From User

public class AddTwoNumbersUsingScanner {
    public static void main(String[] args) {
        
        int a , b, sum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number ");

        a = scanner.nextInt();

        System.out.println("Enter second number ");

        b = scanner.nextInt();

        scanner.close();

        //ADDITION
        sum = a + b;

        System.out.println("Sum of numbers "+a+" and "+b+" = "+sum);
    }
}
