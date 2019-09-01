package task1;

public class Test1 {

    public static int[] newArray(int num, int max) {
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * max);
        }
        return array;
    }

    public static int[] sortArray(int[] array) {
        int[] result = array.clone();
        sort(result, 0, array.length - 1);
        return result;
    }


    private static void sort(int[] array, int begin, int end) {
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
