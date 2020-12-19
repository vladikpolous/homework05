package com.alevel.homework05;


import java.util.Arrays;

public class SwapColAndRow {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}};
        System.out.println(Arrays.deepToString(swaps(arr)));
    }

    static int[][] swaps(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        return array;
    }
}
