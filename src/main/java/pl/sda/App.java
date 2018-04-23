package pl.sda;


public class App 
{
    public static void main( String[] args ) {

//        String filePath = "C:\\Users\\adamm\\Desktop\\tekst.txt";
//
//        TranslatorFileReader reader = new TranslatorFileReader();
//        String fileContents = reader.read(filePath);
//
//        String encodedText = MorseUtil.encodeMorse(fileContents);
//        System.out.println(encodedText);

        String filePath = "C:\\Users\\adamm\\Desktop\\tekst.txt";

        TranslatorFileReader translatorFileReader = new TranslatorFileReader();
        NatoUtil natoUtil = new NatoUtil();

        TranslationUtil translationUtil;

        String fileContents = translatorFileReader.read(filePath);
        String encodedText = natoUtil.encode(fileContents);
        System.out.println(encodedText);
    }


}
