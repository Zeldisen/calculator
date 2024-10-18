
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        boolean isRunning = true;

        while(isRunning) {

            meny();

            int choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("enter your numbers you want to plus");
                    number1 = scanner.nextInt();
                    number2 = scanner.nextInt();
                    addition(number1, number2);
                    break;
                case 2:
                    System.out.println("enter your numbers you want to subtract");
                    number1 = scanner.nextInt();
                    number2 = scanner.nextInt();
                    subtraction(number1, number2);
                    break;
                case 3:
                    System.out.println("enter your numbers you want to multiply");
                    number1 = scanner.nextInt();
                    number2 = scanner.nextInt();
                    multiplication(number1, number2);
                    break;
                case 4:
                    System.out.println("enter your number you want to divide");
                    number1 = scanner.nextInt();
                    number2 = scanner.nextInt();
                    division(number1, number2);
                    break;
                case 5:
                    System.out.println("Goodby!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("invalid choise");

            }


        }

    }

        public static void addition ( int number1, int number2){
            int result = number1 + number2;
            System.out.println(result);
        }


        public static void subtraction ( int number1, int number2){
            int result = number1 - number2;
            System.out.println(result);
        }

        public static void multiplication ( int number1, int number2){
            int result = number1 * number2;
            System.out.println(result);
        }

        public static void division ( int number1, int number2){
            double result = (double) number1 / number2;
            System.out.println(result);
        }
    public static void meny(){
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 to quit");


    }

    }
