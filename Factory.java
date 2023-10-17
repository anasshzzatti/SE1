package org.hbrs.se1.ws23.uebung1.view;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws23.uebung1.control.Translator;

public class Factory {
    public static Translator createTranslator() {
        return new GermanTranslator();
    }
}
