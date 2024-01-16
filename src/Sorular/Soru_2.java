package Sorular;

public class Soru_2 {

    public static void main(String[] args) {

        //Başlangıç ve Bitiş Boşluklarını Kaldırma:
        //
        //Bir String'in başındaki ve sonundaki boşlukları nasıl kaldırırsınız?

        String metin = " Hayal ax hayal  ";
        System.out.println(metin);
        String boslukKaldirildi = metin.trim();
        System.out.println(boslukKaldirildi);
    }
}
