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
        //
        // Given
        //
            int[] array1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
            int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] array3 = {7, 7, 7, 5, 5, 5, 7, 7, 7};
        //
        // When
        //
            int[] array1Sort = array1.clone();
            int[] array2Sort = array2.clone();
            int[] array3Sort = array3.clone();

            Arrays.sort(array1Sort);
            Arrays.sort(array2Sort);
            Arrays.sort(array3Sort);
        //
        // Then
        //
            Assert.assertArrayEquals(Test1.sortArray(array1), array1Sort);
            Assert.assertArrayEquals(Test1.sortArray(array2), array2Sort);
            Assert.assertArrayEquals(Test1.sortArray(array3), array3Sort);

            for (int i = 0; i < 100; i++) {
                int[] array = newArray(20, 100);
                int[] arraySort = array.clone();

                Arrays.sort(arraySort);
                Test1.sortArray(array);
                Assert.assertArrayEquals(array, arraySort);
            }
    }
}