import java.util.Scanner;

// Java Program To Add N Numbers Using Array
public class AddNNumbersUsingArray {
    public static void main(String[] args) {

        int totalNumbers, sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Total Numbers to Add : ");

        totalNumbers = scanner.nextInt();

        int[] array = new int[totalNumbers];

        System.out.println("Enter "+totalNumbers+" numbers to add ");

        int temp;
        for (int i = 0; i < totalNumbers; i++){
            temp = scanner.nextInt();

            array[i] = temp;

            sum += temp; 
        }

        scanner.close();

        System.out.println("Sum Of All the Numbers = "+sum);
    }
}
