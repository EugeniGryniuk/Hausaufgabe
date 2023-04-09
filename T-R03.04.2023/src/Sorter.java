class Sorter {
    public static void sort(int[] array, boolean ascendingOrder) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((ascendingOrder && array[i] > array[j]) || (!ascendingOrder && array[i] < array[j])) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}