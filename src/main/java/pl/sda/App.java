package pl.sda;


public class App 
{
    public static void main( String[] args ) {
        String filePath = "C:\\Users\\adamm\\Desktop\\tekst.txt";
        TranslationType type = TranslationType.MORSE;

        if (args != null && args.length > 0) {
            filePath = args[0];
            type = TranslationType.valueOf(args[1]);
        }

        TranslatorFileReader reader = new TranslatorFileReader();
        String fileContents = reader.read(filePath);

        TranslationUtil translationUtil = TranslationUtilFactory.produce(type);

        String encodedText = translationUtil.encode(fileContents);
        System.out.println(encodedText);

    }


}
