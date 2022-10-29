import java.util.Scanner;

//Java Program To Check Whether a Number is Prime No Or Not Using While Loop
public class CheckIfNoIsPrimeUsingWhileLoop {
    public static void main(String[] args) {

        int number, i = 2;

        boolean isPrime = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number To Check : ");

        number = scanner.nextInt();

        scanner.close();

        if(number == 0 || number == 1){

            System.out.println(number+" is neither a prime number nor a composite number.");

        }
        else{

            while(i <= number / 2){

                if(number % i == 0){

                    isPrime = false;

                    break;

                }

                i++;

            }

            if(isPrime){

                System.out.println(number + " is a prime number.");

            }
            else{

                System.out.println(number + " is not a prime number.");

            }
        }
    }
}
