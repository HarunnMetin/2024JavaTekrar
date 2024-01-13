package StringManupulationMethodlar;

public class Soru_8 {

    public static void main(String[] args) {

        //Özel Karakterleri Temizleme:
        //
        //Verilen bir metindeki özel karakterleri (noktalama işaretleri, boşluklar, vs.)
        // temizleyerek sadece harf ve rakamları içeren yeni bir metin elde etme.

        String orijinalMetin = "ben --@her ne_kadar zor4904902 olu#/%rsa olsun basarac=/&%^+agim";

        StringBuilder yeniMetin = new StringBuilder();

        for (int i = 0; i < orijinalMetin.length(); i++) {

            char karakter = orijinalMetin.charAt(i);

            if (Character.isLetterOrDigit(karakter)){

                yeniMetin.append(karakter);
            }
        }
        System.out.println(orijinalMetin);
        System.out.println(yeniMetin);
    }
}
