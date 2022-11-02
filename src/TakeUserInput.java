import java.util.Scanner;

// Java Program To Take Input From User
public class TakeUserInput {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // String Input
        System.out.print("Enter any string : ");
        String str = scanner.nextLine();
        System.out.println("Entered String : "+str);

        // Integer Input
        int num1;
        System.out.print("\nEnter an Integer : ");
        num1 = scanner.nextInt();
        System.out.println("Entered Integer : "+num1);

        scanner.close();
    }
}
