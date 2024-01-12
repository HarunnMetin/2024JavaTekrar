package StringManupulationMethodlar;

import java.util.Arrays;

public class Soru_1 {

    public static void main(String[] args) {


        String sayi = "9876";
        // Bu sayının rakamlarını toplayarak sonucu bulunuz.

        int toplam = 0;

        for (int i = 0; i < sayi.length(); i++) {

            char rakamCh = sayi.charAt(i);
            int rakam = Character.getNumericValue(rakamCh);
            toplam+=rakam;
        }
        System.out.println("toplam : " + toplam);

    }
}
