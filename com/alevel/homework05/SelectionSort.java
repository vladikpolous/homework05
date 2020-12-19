package com.alevel.homework05;


import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,6,7,1,8,3,2};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[]array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    min_index = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[min_index] = temp;
        }
        return array;
    }
}
