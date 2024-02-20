package StringManupulationMethodlar;

import java.util.Scanner;

public class Soru_27 {

    public static void main(String[] args) {

        /*
          Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
          :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
          yazdirin.
         */

        Scanner scaner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime girin");
        String kelime = scaner.nextLine();
        if (kelime.length() % 2 == 0) {
            // String uzunluğu çift ise ortasına :) ekleyin
            int ortaIndek = kelime.length() / 2;
            String result = kelime.substring(0, ortaIndek) + ":)" + kelime.substring(ortaIndek);
            System.out.println("Sonuç: " + result);
        } else {
            // String uzunluğu tek ise ortadaki harfi silin ve yerine :( ekleyin
            int middleIndex = kelime.length() / 2;
            String result = kelime.substring(0, middleIndex) + kelime.substring(middleIndex + 1);
            System.out.println("Sonuç: " + result);


        }
    }
}
