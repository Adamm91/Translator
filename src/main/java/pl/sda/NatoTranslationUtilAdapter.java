package pl.sda;

public class NatoTranslationUtilAdapter implements TranslationUtil {
    @Override
    public String encode(String textToEncode) {
        MilitaryAlphabetEncoder militaryAlphabetEncoder = new MilitaryAlphabetEncoder();
        return militaryAlphabetEncoder.encode(textToEncode);
    }

    @Override
    public String decode(String textToDecode) {
        MilitaryAlphabetDecoder militaryAlphabetDecoder = new MilitaryAlphabetDecoder();
        return militaryAlphabetDecoder.decode(textToDecode);
    }
}
