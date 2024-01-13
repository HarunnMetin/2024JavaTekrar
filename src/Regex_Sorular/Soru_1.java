package Regex_Sorular;

import java.util.Arrays;

public class Soru_1 {

    public static void main(String[] args) {

        //"Java'da \S ifadesini kullanarak bir metindeki kelime sayısını nasıl bulabilirsiniz?"

        String metin = "potansiyelini bosa harcama, potansiyelin farkina var";

        String[] kelimeArr = metin.split("\\S+");
        int kelimeSayisi = kelimeArr.length;
        System.out.println("Metindeki kelime sayısı: " + kelimeSayisi);
    }
}
