import java.util.Scanner;

//Java Program To Check Whether a Number is Even or Odd
public class CheckEvenOrOddNumber {
    public static void main(String[] args) {
        int a;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter No To Check : ");

        a = scanner.nextInt();

        scanner.close();

        if(a % 2 == 0){
            System.out.println("\n"+a+" is an EVEN number.");
        }
        else{
            System.out.println("\n"+a+" is a ODD number.");
        }
    }
}
