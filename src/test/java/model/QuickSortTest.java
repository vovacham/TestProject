package model;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {

    //Тестирование сортировки равномерного массива
    @Test
    public void sortTest1() {
        // Given
        int[] array1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] array1Sort = array1.clone();
        Arrays.sort(array1Sort);
        // When
        int[] test1 = Utility.sortArray(array1);
        // Then
        Assert.assertArrayEquals(test1, array1Sort);
    }

    //Тестирование сортировки уже отсортированного массива
    @Test
    public void sortTest2() {
        // Given
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2Sort = array2.clone();
        Arrays.sort(array2Sort);
        // When
        int[] test2 = Utility.sortArray(array2);
        // Then
        Assert.assertArrayEquals(test2, array2Sort);
    }

    //Тестирование сортировки массива с повторяющимися элеменами
    @Test
    public void sortTest3() {
        // Given
        int[] array3 = {7, 7, 7, 5, 5, 5, 7, 7, 7};
        int[] array3Sort = array3.clone();
        Arrays.sort(array3Sort);
        // When
        int[] test3 = Utility.sortArray(array3);
        // Then
        Assert.assertArrayEquals(test3, array3Sort);
    }

    //Тестирование сортировки случайного массива
    @Test
    public void sortTest4() {
        for (int i = 0; i < 100; i++) {
            //Given
            int[] array = Utility.newRandomArray(20, 100);
            int[] arraySort = array.clone();
            Arrays.sort(arraySort);
            //When
            int[] test = Utility.sortArray(array);
            //Then
            Assert.assertArrayEquals(test, arraySort);
        }
    }
}