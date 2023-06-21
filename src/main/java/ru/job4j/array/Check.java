package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (int index = 1; index < data.length; index++) {
            if (data[0] != data[index]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean[] data = {true, false, false};
        boolean result = Check.mono(data);
        System.out.println(result);
    }
}
