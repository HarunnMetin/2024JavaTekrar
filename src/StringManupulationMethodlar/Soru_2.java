package StringManupulationMethodlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_2 {

    public static void main(String[] args) {

        String sayilar = "135792468";

        // Bu sayıları çift ve tek rakamlar olmak üzere iki farklı gruba ayırınız.

        List<Integer> ciftSyi = new ArrayList<>();
        List<Integer> tekSyi = new ArrayList<>();
        for (int i = 0; i < sayilar.length(); i++) {

            char karakter = sayilar.charAt(i);
            int rakam = Character.getNumericValue(karakter);

            if (rakam % 2 == 0){

                ciftSyi.add(rakam);
            }
            else {

                tekSyi.add(rakam);
            }
        }
        System.out.println("cift sayilar : " + ciftSyi +"\ntek sayilar : " + tekSyi);
    }
}
