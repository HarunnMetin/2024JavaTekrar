package StringManupulationMethodlar;

import java.util.Arrays;

public class Soru_14 {

    public static void main(String[] args) {

        // Verilen bir dizide belirli bir öğe olup olmadığını kontrol eden bir program yaziniz.

        String[] dizi = {"DELFİ", "BTC", "ANC", "KLO","JASMY","ADS","CRV","FLOKİ","CTT","DFL","GAL"};
        String arananOge = "gal";
        //System.out.println(Arrays.toString(dizi));

       boolean bulundu = false;

        for (String eleman: dizi) {

            if (eleman.equalsIgnoreCase(arananOge)){
                bulundu = true;
                break;
            }
        }

        if (bulundu){
            System.out.println("Aranan kelime dizide bulundu ");
        }
        else {
            System.out.println("Aranan kelime dizide bulunamadi");
        }


    }
}
