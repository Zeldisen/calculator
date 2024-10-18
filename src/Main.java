
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        System.out.println("Enter the first number:");
        number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the second number:");
        number2 = scanner.nextInt();

        System.out.println("Thank you! Choose one of the options:");
        System.out.println("1. Addition.");
        System.out.println("2. Subtraction.");
        System.out.println("3. Multiplication.");
        System.out.println("4. Division.");

        int userAnswer = scanner.nextInt();
        switch (userAnswer) {
            case 1:
                System.out.print(number1 + "+" + number2 + "=");
                addition(number1, number2);
                break;
            case 2:
                System.out.print(number1 + "-" + number2 + "=");
                subtraction(number1, number2);
                break;
            case 3:
                System.out.print(number1 + "*" + number2 + "=");
                multiplication(number1, number2);
                break;
            case 4:
                System.out.print(number1 + "/" + number2 + "=");
                division(number1, number2);
                break;
            default:
                System.out.println("Invalid input");
        }

    }

    public static void addition(int number1, int number2) {
        int result = number1 + number2;
        System.out.println(result);
    }


    public static void subtraction(int number1, int number2) {
        int result = number1 - number2;
        System.out.println(result);
    }

    public static void multiplication(int number1, int number2) {
        int result = number1 * number2;
        System.out.println(result);
    }

    public static void division(int number1, int number2) {
        double result = (double) number1 / number2;
        System.out.println(result);


    }


}
