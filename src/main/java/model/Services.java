package model;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {

    /** Хранилище данных */
    private static Map<Integer, String[]> mapId = new ConcurrentHashMap<>();

    /**
     * Возврат значения элемента из mapId
     */
    public static String[] getValueFromMapId(int id) {
        return mapId.get(id);
    }

    /**
     * Добавление элемента в mapId
     */
    public static void addMapId(Integer id, String[] array) {
        mapId.put(id, array);
    }

    /**
     * Генерация случайного массива
     */
    public static int[] newRandomArray(int num, int max) {
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * max);
        }
        return array;
    }

    /**
     * Возврат отсортированной копии массива
     */
    public static int[] sortArray(int[] array) {
        int[] result = array.clone();
        QuickSort.sort(result, 0, array.length - 1);
        return result;
    }

    /**
     * Строчное отображение массива без фигурных скобок
     */
    public static String arrayToString(int[] array) {
        String s = Arrays.toString(array);
        String result = s.substring(1, s.length() - 1); //.replaceAll(",", "");
        return result;
    }
}
