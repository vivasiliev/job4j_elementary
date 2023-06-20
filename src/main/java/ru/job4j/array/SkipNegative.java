package ru.job4j.array;

import java.util.Arrays;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
         int[][] res = {{1, -2}, {1, 2, -3}, {1, -2, 3, -4}, {1, 2, -3, -4, 5}};
        System.out.println(Arrays.deepToString((skip(res))));
    }
}
