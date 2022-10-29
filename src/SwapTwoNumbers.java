import java.util.Scanner;

//Java Program To Swap Values Of Two Number
public class SwapTwoNumbers {

    public static void main(String[] args) {
        
        int firstNumber, secondNumber, temp;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");

        firstNumber = scanner.nextInt();

        System.out.print("\nEnter second number : ");

        secondNumber = scanner.nextInt();

        scanner.close();

        System.out.println("\nBEFORE SWAPPING");

        System.out.println("First Number = "+firstNumber);

        System.out.println("Second Number = "+secondNumber);

        temp = firstNumber;

        firstNumber = secondNumber;

        secondNumber = temp;

        System.out.println("\nAFTER SWAPPING");

        System.out.println("First Number = "+firstNumber);

        System.out.println("Second Number = "+secondNumber);
    }
}
