package md.execptionsservicetask;

public class TextManager {

    public static int getTheTextLength(String imputString){
        return imputString.length();
    }

    public static int getTheTextLengthWithTryAndCatch(String imputString){
        try {
            return imputString.length();
        }catch (NullPointerException exceptionFromTheTryBlock){
            exceptionFromTheTryBlock.printStackTrace();
            return 0;
        }
    }
    public static int getTheTextLengthWithIf(String imputText){
        if (imputText == null){
            return 0;
        }else {
            return imputText.length();
        }
    }
}
