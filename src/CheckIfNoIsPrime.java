import java.util.Scanner;

//Java Program To Check Whether a Number is Prime No Or Not
public class CheckIfNoIsPrime {
    public static void main(String[] args) {

        int number;

        boolean isPrime = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number To Check : ");

        number = scanner.nextInt();

        scanner.close();

        if(number == 0 || number == 1){

            System.out.println(number+" is neither a prime number nor a composite number.");

        }
        else{

            for(int i = 2; i <= number / 2; i++){

                if(number % i == 0){

                    isPrime = false;

                    break;

                }

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
