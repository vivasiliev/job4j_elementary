package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean temp = data[0];
        for (int index = 0; index < data.length; index++) {
            if (temp != data[index]) {
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
