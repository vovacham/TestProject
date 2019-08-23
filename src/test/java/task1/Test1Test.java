package task1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Test1Test {

    public int[] newArray(int num, int max) {  //num - кол-во элементов массива, max - максимальный элемент
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * max);
        }
        return array;
    }

    @Test
    public void sort() {
        int[] array;
        int[] arraySort;

        int[] array1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] array1Sort = array1;
        Arrays.sort(array1Sort);

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2Sort = array2;
        Arrays.sort(array2Sort);

        int[] array3 = {7, 7, 7, 5, 5, 5, 7, 7, 7};
        int[] array3Sort = array3;
        Arrays.sort(array3Sort);

        Assert.assertEquals(array1, array1Sort);
        Assert.assertEquals(array2, array2Sort);
        Assert.assertEquals(array3, array3Sort);


        for (int i = 0; i < 100; i++) {
            array = newArray(20, 100);
            arraySort = array;
            Arrays.sort(arraySort);
            Test1.sort(array, 0, array.length - 1);
            Assert.assertEquals(array, arraySort);
        }
    }
}