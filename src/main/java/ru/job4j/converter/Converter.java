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
        float expEuro = 2.0f;
        float expDollar = 3.0f;
        float expDollarToEuro = 9.3f;
        float expEuroToDollar = 14.9800005f;
        boolean passedEuro = euro == expEuro;
        boolean passedDollar = dollar == expDollar;
        boolean passedDollarToEuro = dollarToEuro == expDollarToEuro;
        boolean passedEuroToDollar = euroToDollar == expEuroToDollar;
        System.out.println("140 rubles are " + euro + " euro. Результат теста: " + passedEuro);
        System.out.println("180 rubles are " + dollar + " dollars.Результат теста: " + passedDollar);
        System.out.println("10 dollars are " + dollarToEuro + " euro.Результат теста: " + passedDollarToEuro);
        System.out.println("14 euro are " + euroToDollar + " dollars.Результат теста: " + passedEuroToDollar);
    }
}
