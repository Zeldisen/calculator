import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;

        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        addition(number1,number2);
        subtraction(number1,number2);
        multiply(number1,number2);
        division(number1,number2);

    }
    public static void addition(int number1,int number2){
        int numbers = number1 + number2;
        System.out.println(numbers);
    }
    public static void subtraction(int number1,int number2){
        int numbers = number1 - number2;
        System.out.println(numbers);
    }
    public static void multiply(int number1,int number2){
        int numbers = number1 * number2;
        System.out.println(numbers);
    }
    public static void division(int number1,int number2){
        double divisionSum = (double) number1 / number2;
        System.out.println(divisionSum);
    }
}