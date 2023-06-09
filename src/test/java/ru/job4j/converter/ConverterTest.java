package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {
    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
    @Test
    public void whenConvert180RblThen3Dollars() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
    @Test
    public void whenConvert10DlrThen9dot3Euro() {
        float in = 10;
        float expected = 9.3f;
        float out = Converter.dollarToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
    @Test
    public void whenConvert14EurThen14dot9800Dollars() {
        float in = 14;
        float expected = 14.9800f;
        float out = Converter.euroToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}