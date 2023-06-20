package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                rsl += array[row][cell];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] res = {{1, 2}, {1, 2}};
        System.out.println(sum(res));
    }
}
