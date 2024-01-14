package SoruDeposu;

import java.util.Scanner;

public class Soru_7 {

    public static void main(String[] args) {

        //- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        /*
        String  karakter = String.valueOf(scanner.next().charAt(0));

        if (karakter.contains(karakter.toUpperCase())){
            System.out.println("girilen karakter buyuk harf");
        }
        else {
            System.out.println("girilen karakter kucuk harf");
        }

         */

        //ikinci cozum

        char karakterChar = scanner.next().charAt(0);
        if (karakterChar>='A' && karakterChar<= 'Z'){
            System.out.println("Karakter buyuk harf");
        }
        else {
            System.out.println("Girilen karakter kucuk harf");
        }
        System.out.println("=============");

    }
}
