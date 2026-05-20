import java.util.Scanner; // Import the Scanner class

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt(); // Read user input

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        sc.close(); // Good practice to close the scanner
    }
}