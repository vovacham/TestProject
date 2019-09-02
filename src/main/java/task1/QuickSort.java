package task1;

public class QuickSort {

    public static void sort(int[] array, int begin, int end) {
        if (array.length == 0 || begin >= end) return;

        int i = begin;
        int j = end;
        int opora = (begin + end) / 2;

        while (i != j) {
            while (i < opora && array[i] <= array[opora]) {
                i++;
            }
            while (j > opora && array[j] >= array[opora]) {
                j--;
            }
            if (i != j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == opora) opora = j;
                else if (j == opora) opora = i;
            }
        }

        if (begin < opora - 1)
            sort(array, 0, opora - 1);

        if (end > opora + 1)
            sort(array, opora + 1, end);
    }
}
