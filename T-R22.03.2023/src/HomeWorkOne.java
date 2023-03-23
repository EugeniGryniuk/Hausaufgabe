import java.util.Scanner;

public class HomeWorkOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пожалуйста, число 1: ");
        int number = scanner.nextInt();
        System.out.println("Введите пожалуйста, число 2: ");
        int number1 = scanner.nextInt();


        System.out.println("До обмена: ");
        System.out.println("number = " + number);
        System.out.println("number1 = " + number1);

        number = number + number1;
        number1 = number - number1;
        number = number - number1;


        System.out.println("После обмена: ");
        System.out.println("number = " + number);
        System.out.println("number1 = " + number1);
    }
}