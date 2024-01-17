package Sorular;

public class Soru_5 {

    public static void main(String[] args) {

        //Sadece Rakamları Tutma


        String ornekString = "ABC123xyz456!";

        String sadeceRakamlar = ornekString.replaceAll("[^0-9]","-");
        System.out.println(sadeceRakamlar);

        //Sadece Harf ve Boşlukları Tutma

        String ornekstr = "12abc34 def56AABB!";

        String harfBosluk = ornekstr.replaceAll("[^a-z A-Z]","");
        System.out.println(harfBosluk);

        // Türkçe Karakterleri Tutma
        String ornek = "Türkçe İşaretleme Örneği!";

        String turkceKarakter = ornek.replaceAll("[^\\p{L}]","");
        System.out.println(turkceKarakter);


    }
}
