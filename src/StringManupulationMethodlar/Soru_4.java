package StringManupulationMethodlar;

import java.util.Arrays;

public class Soru_4 {

    public static void main(String[] args) {

        String sayi = "9876";

        // Bu sayının ortadaki iki rakamını birbirleriyle yer değiştirerek yeni bir sayı oluşturunuz.

        char[] karakter = sayi.toCharArray();

        char temp = karakter[1];
        karakter[1] = karakter[2];
        karakter[2] = temp;

        String yeniSayi = new String(karakter);

        System.out.println(yeniSayi);
    }
}
