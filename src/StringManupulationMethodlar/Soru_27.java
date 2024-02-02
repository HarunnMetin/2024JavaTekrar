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
        if (kelime.length() %2 == 0){
            System.out.println();
        }




    }
}
