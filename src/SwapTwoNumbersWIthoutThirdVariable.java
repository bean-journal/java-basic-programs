import java.util.Scanner;

//Java Program To Swap Values Of Two Number Without Using Third Variable
public class SwapTwoNumbersWIthoutThirdVariable {

    public static void main(String[] args) {
        int firstNumber, secondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");

        firstNumber = scanner.nextInt();

        System.out.print("\nEnter second number : ");

        secondNumber = scanner.nextInt();

        scanner.close();

        System.out.println("\nBEFORE SWAPPING");

        System.out.println("First Number = " + firstNumber);

        System.out.println("Second Number = " + secondNumber);

        // SWAPPING
        firstNumber = firstNumber + secondNumber;

        secondNumber = firstNumber - secondNumber;

        firstNumber = firstNumber - secondNumber;

        System.out.println("\nAFTER SWAPPING");

        System.out.println("First Number = " + firstNumber);

        System.out.println("Second Number = " + secondNumber);
    }
}
