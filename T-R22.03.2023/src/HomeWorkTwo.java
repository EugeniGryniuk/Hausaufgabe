import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пожалуйста, число №1: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите пожалуйста, число №2: ");
        int numberTwo = scanner.nextInt();

        int numberThree = numberOne + numberTwo;

        System.out.println("Результат = " + numberThree);

        System.out.println("Число которое вы ввели нечетное? ");
        boolean isNumberEven = isNumberEven(numberThree);
        System.out.println("Ответ: " + !isNumberEven);

    }
    public static boolean isNumberEven(int userNumber) {
        int zeroOrNot = userNumber % 2;


        return zeroOrNot == 0;
    }
}
