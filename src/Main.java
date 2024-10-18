
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;

      

boolean running = true;

        while (running) {

            System.out.println("\nWelcome to the calculator. What method do you want to use?" +
                    "\n1. Addition" +
                    "\n2. Subtraction" +
                    "\n3. Multiplication" +
                    "\n4. Division" +
                    "\n5. Exit");

            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("You choose addtion.");
                    System.out.println("Write first number");
                    number1 = scanner.nextInt();
                    System.out.println("Write second number");
                    number2 = scanner.nextInt();
                    addition(number1, number2);
                    break;

                case 2:
                    System.out.println("You choose subtraction.");
                    System.out.println("Write first number");
                    number1 = scanner.nextInt();
                    System.out.println("Write second number");
                    number2 = scanner.nextInt();
                    subtraction(number1, number2);
                    break;

                case 3:
                    System.out.println("You choose multiplication.");
                    System.out.println("Write first number");
                    number1 = scanner.nextInt();
                    System.out.println("Write second number");
                    number2 = scanner.nextInt();
                    multiplication(number1, number2);
                    break;

                case 4:
                    System.out.println("You choose division");
                    System.out.println("Write first number");
                    number1 = scanner.nextInt();
                    System.out.println("Write second number");
                    number2 = scanner.nextInt();
                    division(number1, number2);
                    break;
                case 5:
                     System.out.println("Exit");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choise");
                    
            }

        }
    }

    public static void addition(int number1, int number2) {
        int result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

    public static void subtraction(int number1, int number2) {
        int result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
    }


    public static void multiplication(int number1, int number2) {
        int result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
    }

    public static void division(int number1, int number2) {
        double result = (double) number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);

    }


}
