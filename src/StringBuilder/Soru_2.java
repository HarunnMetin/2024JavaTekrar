package StringBuilder;

public class Soru_2 {

    public static void main(String[] args) {

        //Verilen bir String'de belirli bir alt dizenin yerine başka bir alt dize ekleyen bir metot yazın.
        // Bu işlemi StringBuilder kullanarak gerçekleştirin.

        String str = "ben basariliyim";
        String degistirelecekMetin = "basariliyim";
        String yerineKonşacakMetin = "yapabilirim";

        System.out.println(replaceSubstring(str, degistirelecekMetin, yerineKonşacakMetin));


    }
    private static String replaceSubstring(String original, String toReplace, String replacement){
        StringBuilder sb = new StringBuilder(original);
        int startIndex = sb.indexOf(toReplace);
        int endIndex = startIndex + toReplace.length();
        sb.replace(startIndex, endIndex, replacement);
        return sb.toString();


    }
}
