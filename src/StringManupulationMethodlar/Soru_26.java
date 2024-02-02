package StringManupulationMethodlar;

import java.util.Scanner;

public class Soru_26 {

    public static void main(String[] args) {

        /*
        Kullanicidan isim ve soyismini ayri ayri alin.
           - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
             yazdirin
           - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
             harflerle yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.next();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.next();

        String isimIlkHarf = isim.toUpperCase();
        String soyIlkHarf = soyisim.toUpperCase();

        if (isim.length() > soyisim.length()){
            System.out.println(isimIlkHarf.charAt(0)+isimIlkHarf.toLowerCase().substring(1)+" "+
                               soyIlkHarf.charAt(0) + soyIlkHarf.toLowerCase().substring(1));
        }
        if (soyisim.length() > isim.length()){
            System.out.println(isimIlkHarf.charAt(0) + isimIlkHarf.toLowerCase().substring(1)+" "+soyIlkHarf);
        }
        if (isim.length() == soyisim.length()){
            System.out.println(isimIlkHarf+" "+soyIlkHarf);
        }

    }
}
