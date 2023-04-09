import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array);

        boolean ascendingOrder = true;
        Sorter.sort(array, ascendingOrder);

        System.out.println("Отсортированный массив по возрастанию: " + Arrays.toString(array));

        ascendingOrder = false;
        Sorter.sort(array, ascendingOrder);

        System.out.println("Отсортированный массив по убыванию: " + Arrays.toString(array));
    }

    public static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}

