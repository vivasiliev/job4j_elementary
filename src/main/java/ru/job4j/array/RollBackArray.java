package ru.job4j.array;

import java.util.Arrays;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int lastIndex = array.length - index - 1;
            result[index] = array[lastIndex];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = new int[] {3, 4, 5, 6, 7, 8};
        int[] result = rollback(input);
        System.out.println(Arrays.toString(result));
    }
}
