package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.07F;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value * 0.93F;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(180);
        float dollarToEuro = Converter.dollarToEuro(10);
        float euroToDollar = Converter.euroToDollar(14);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollars.");
        System.out.println("180 rubles are " + dollar + " dollars.");
        System.out.println("10 dollars are " + dollarToEuro + " euro.");
        System.out.println("14 euro are " + euroToDollar + " dollars.");
    }
}
