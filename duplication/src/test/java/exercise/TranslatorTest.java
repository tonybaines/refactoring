package exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class TranslatorTest {
    private Translator translator = new Translator();

    @Test
    public void shouldTranslateASingleDigit() {
        shouldTranslate(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9,},
                new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"});
    }

    @Test
    public void shouldTranslateMultiplesOfTenUpToNinety() {
        shouldTranslate(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90,},
                new String[]{"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"});
    }

    @Test
    public void shouldTranslateTheTeens() {
        shouldTranslate(new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19,},
                new String[]{"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"});

    }

    @Test
    public void shouldTranslateNumbersBetweenTwentyOneAndNinetyNine() {
        shouldTranslate(new int[]{21, 37, 99},
                new String[]{"twenty one", "thirty seven", "ninety nine"});
    }

    @Test
    public void shouldTranslateMultiplesOfOneHundredUpToNineHundred() {
        shouldTranslate(new int[]{100, 200, 300, 400, 500, 600, 700, 800, 900},
                new String[]{"one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"});
    }

    @Test
    public void shouldTranslateNumbersBetweenOneHundredAndOneAndNineHundredAndNinetyNine() {
        shouldTranslate(new int[]{101, 705, 999},
                new String[]{"one hundred and one", "seven hundred and five", "nine hundred and ninety nine"});
    }

    @Test
    public void shouldTranslateNumbersBetweenOneThousandAndNineHundredAndNinetyNineThousandNineHundredAndNinetyNine() {
        shouldTranslate(new int[]{1000, 7001, 40020, 999999},
                new String[]{"one thousand", "seven thousand and one", "forty thousand and twenty", "nine hundred and ninety nine thousand nine hundred and ninety nine"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrownAnExceptionIfTooLargeANumberIsPassedIn() {
        translator.translate(1000000000);
    }


    private void shouldTranslate(int[] from, String[] to) {
        for (int i = 0; i < from.length; i++) {
            assertEquals(to[i], translator.translate(from[i]));
        }
    }
}
