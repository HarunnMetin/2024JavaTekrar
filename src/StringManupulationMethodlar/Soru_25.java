package StringManupulationMethodlar;

import java.util.Scanner;

public class Soru_25 {

    public static void main(String[] args) {

        /*
        Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
           - ilk harf kucuk harf olmali
           - son karakter rakam olmali
           - sifre bosluk icermemeli
           - uzunlugu en az 10 karakter olmali
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sifre olusturun");
        String sifre = scanner.nextLine();

        //- ilk harf kucuk harf olmali
        if(sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z'){
            System.out.println("ilk harfkucuk harf olmali");

        }
        //- son karakter rakam olmali
        if(!(sifre.length()-1 >= 0 && sifre.length()-1 <= 9)){
            System.out.println("son karakter rakam olmali");
        }
        //- sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
        }
        //- uzunlugu en az 10 karakter olmali
        if (sifre.length() != 10){
            System.out.println("sifre 10 karakter olmali");
        }
        else {
            System.out.println("sifre basariyla kaydedildi");
        }

    }
}
