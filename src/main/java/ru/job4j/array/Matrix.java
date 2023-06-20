package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < table.length; row++) {
            for (int cell = 0; cell < table.length; cell++) {
                table[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return table;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString((multiple(5))));
    }
}
