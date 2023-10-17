package org.hbrs.se1.ws23.uebung1.test;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    @Test
    void aPositiveTest() {
        GermanTranslator translator = new GermanTranslator();
        assertEquals("fünf", translator.translateNumber(5));
        assertEquals("eins", translator.translateNumber(1));
        assertEquals("zehn", translator.translateNumber(10));

    }
    @Test
    void aNegativTest() {
        GermanTranslator translator = new GermanTranslator();
        assertEquals("Übersetzung der Zahl -100 nicht möglich (1.0)", translator.translateNumber(-100));
        assertEquals("Übersetzung der Zahl 11 nicht möglich (1.0)", translator.translateNumber(11));
        assertEquals("Übersetzung der Zahl 0 nicht möglich (1.0)", translator.translateNumber(0));

    }
}
