package io.raineri.jbow;

import java.text.Normalizer;

public class TextProcessor {

    static public String removeNonAlphabetCharsFromWord(String word) {
        return word.replaceAll("[^a-zA-Z0-9]", "");
    }

    static public String removeAccentsCharsFromWord(String word) {
        String normalizedWork = Normalizer.normalize(word, Normalizer.Form.NFD);
        return normalizedWork.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    static public String transformLowerCaseWord(String word) {
        return word.toLowerCase();
    }

    static public String cleanWord(String word) {
        word = TextProcessor.removeAccentsCharsFromWord(word);
        word = TextProcessor.transformLowerCaseWord(word);
        return TextProcessor.removeNonAlphabetCharsFromWord(word);     
    }
}
