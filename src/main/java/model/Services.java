package model;

import java.util.Arrays;

public class Services {

    public static int[] newArray(int num, int max) {
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * max);
        }
        return array;
    }

    public static int[] sortArray(int[] array) {
        int[] result = array.clone();
        QuickSort.sort(result, 0, array.length - 1);
        return result;
    }

    public static String arrayToString(int[] array) {
        String s = Arrays.toString(array);
        String result = s.substring(1, s.length() - 1).replaceAll(",", "");
        return result;
    }

}
