package exercise;/*
Take a number and give the equivalent number in British English words e.g.
	1 = one
	21 = twenty one
	105 = one hundred and five
	56945781 = fifty six million nine hundred and forty five thousand seven hundred and eighty one
	etc.. up to 999,999,999 without using a tokenizer, or any external libraries
 */

import org.junit.Test;
import static org.junit.Assert.*;
public class AcceptanceTest {
    Translator translator = new Translator();

    @Test public void shouldTakeANumberAndGiveTheEquivalentNumberInBritishEnglishWords() {
        assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", translator.translate(56945781));
    }

    @Test public void shouldTranslateTheMaximumValue() {
        assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", translator.translate(999999999));
    }


}
