public class InsertionSort{
        public static void ordenar(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int actual = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > actual) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = actual;
        }
    }

    public static void ordenar(int[] array, int n) {
        if (n <= 1) {
            return;
        }
        ordenar(array, n - 1);
        int ultimo = array[n - 1];
        int j = n - 2;
        while (j >= 0 && array[j] > ultimo) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = ultimo;
    }
}
