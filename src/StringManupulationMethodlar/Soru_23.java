package StringManupulationMethodlar;

public class Soru_23 {

    public static void main(String[] args) {

        String orijinalString = "JavaProgramming";

        // "Programming" alt dizisini içeren bir alt dizeyi alın

        String arananAltDize = "Programming";
        int baslangicIndex = orijinalString.indexOf(arananAltDize);

        if (baslangicIndex != -1) {
            // Eğer alt dize bulunduysa, bu alt diziyi alın
            String altDize = orijinalString.substring(baslangicIndex, baslangicIndex + arananAltDize.length());
            System.out.println("Aranan Alt Dize: " + altDize);
        } else {
            System.out.println("Aranan Alt Dize bulunamadı.");
        }
    }
}
