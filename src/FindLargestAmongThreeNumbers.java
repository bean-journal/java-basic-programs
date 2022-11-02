import java.util.Scanner;

//Java Program To Find Largest among Three Numbers
public class FindLargestAmongThreeNumbers {

    public static void main(String[] args) {

        int firstNum, secondNum, thirdNum;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number : ");

        firstNum = scanner.nextInt();

        System.out.print("\nEnter Second Number : ");

        secondNum = scanner.nextInt();

        System.out.print("\nEnter Third Number : ");

        thirdNum = scanner.nextInt();

        scanner.close();

        if(firstNum >= secondNum && firstNum >= thirdNum){

            System.out.println("\nLARGEST NUMBER IS : "+firstNum);

        }
        else if(secondNum >= firstNum && secondNum >= thirdNum){

            System.out.println("\nLARGEST NUMBER IS : "+secondNum);

        }
        else{

            System.out.println("\nLARGEST NUMBER IS : "+thirdNum);

        }

    }
}
