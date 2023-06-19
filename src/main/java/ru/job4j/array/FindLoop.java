package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }

        return rst;
    }

    public static void main(String[] args) {
        int[] mass = new int[] {10, 3, 5, 6, 8, 9};
        System.out.println(indexInRange(mass, 5, 0, 1));
    }
}
