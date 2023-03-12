public class HomeWork1 {
    public static void main(String[] args) {
        int number = 333; // Шестнадцатиричное число 16 -> 10
        int result0 = 0;
        result0 = (3 * 16 * 16) + (3 * 16) + (3 * 1);
        System.out.println("0.Десятичное число: " + result0);

        int result1 = 0; // Разложение на разряды
        result1 = (2 * 10 * 10000) + (0 * 10 * 1000) + (0 * 10 * 100) + (3 * 10 * 10) + (4 * 10) + (5 * 1);
        System.out.println("1.Десятичное число разложеное на разряды: " + result1);

        int number2 = 637; // Десятичное число 10 -> 16
        int number3 = 16;
        int result2 = (number2 / number3);
        int result3 = (result2 / number3);
        int result4 = (result3 / number3);
        int result21 = (number2 % number3);
        int result31 = (result2 % number3);
        int result41 = (result3 % number3);
        String result5 = "D";
        System.out.println("2.1 Шестнадцатиричное число: " +  result41 + result31 + result5);

        String number1e = "27D";  // Шестнадцатиричное число 16 -> 10
        int result1e = 0;
        result1e = (2 * 16 * 16) + (7 * 16) + (13 * 1);
        System.out.println("2.2 Десятичное число: " + result1e);

        int number4 = 637; // Десятичное число 10 -> 2
        int number5 = 2;
        int result7 = (number4 / number5); int result7a = (number4 % number5);
        int result8 = (result7 / number5); int result8a = (result7 % number5);
        int result9 = (result8 / number5); int result9a = (result8 % number5);
        int result10 = (result9 / number5); int result10a = (result9 % number5);
        int result11 = (result10 / number5); int result11a = (result10 % number5);
        int result12 = (result11 / number5); int result12a = (result11 % number5);
        int result13 = (result12 / number5); int result13a = (result12 % number5);
        int result14 = (result13 / number5); int result14a = (result13 % number5);
        int result15 = (result14 / number5); int result15a = (result14 % number5);
        int result16 = (result15 / number5); int result16a = (result15 % number5);
        System.out.println("3. Двоичное число: " + result16a + result15a + result14a + result13a + result12a + result11a + result10a + result9a + result8a + result7a);

        int number6 = 11100111; // Двоичное число 2 -> 10
        int result1b = 0;
        result1b = (1 * 128) + (1 * 64) + (1 * 32) + (0 * 16) + (0 * 8) + (1 * 4) + (1 * 2) + (1 * 1);
        System.out.println("4. Десятичное число: " + result1b);

        int number1c = 637; // Десятичное число 10 -> 3
        int number2c = 3;
        int result1c = (number1c / number2c); int result1d = (number1c % number2c);
        int result2c = (result1c / number2c); int result2d = (result1c % number2c);
        int result3c = (result2c / number2c); int result3d = (result2c % number2c);
        int result4c = (result3c / number2c); int result4d = (result3c % number2c);
        int result5c = (result4c / number2c); int result5d = (result4c % number2c);
        int result6c = (result5c / number2c); int result6d = (result5c % number2c);
        System.out.println("5. Троичное число: " +  result6d + result5d + result4d + result3d + result2d + result1d);

    }
}
