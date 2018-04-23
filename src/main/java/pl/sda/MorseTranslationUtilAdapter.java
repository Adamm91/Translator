package pl.sda;

public class MorseTranslationUtilAdapter implements TranslationUtil{

    @Override
    public String encode(String textToEncode) {
        MorseEncoder morseEncoder = new MorseEncoder();
        return morseEncoder.encode(textToEncode);
    }

    @Override
    public String decode(String textToDecode) {
        MorseDecoder morseDecoder = new MorseDecoder();
        return morseDecoder.decode(textToDecode);
    }
}
