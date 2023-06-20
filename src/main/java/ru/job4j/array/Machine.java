package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int element : coins) {
            while (change >= element) {
                change -= element;
                rsl[size++] = element;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(change(50, 32)));
    }
}