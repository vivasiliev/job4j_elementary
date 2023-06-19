package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length - 1; index++) {
             result = result == data[index];
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] data = {true, false, false};
        boolean result = Check.mono(data);
        System.out.println(result);
    }
}
