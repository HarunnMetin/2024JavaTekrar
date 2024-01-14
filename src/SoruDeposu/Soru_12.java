package SoruDeposu;

import java.util.Locale;
import java.util.Scanner;

public class Soru_12 {

    public static void main(String[] args) {

        //Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
        //icerip icermedigini indexOf() method’u kullanarak yazdirin.
        String metin = "ben benim kimse degilim herkes farklidir";


        arananMetin();
    }

    public static void arananMetin(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen birmetin giriniz");
        String girilenMetin = scanner.nextLine();
        System.out.println("lutfen girdiginiz metinde araadiginiz kelimeyi veya cumleyiyaziniz");
        String arananMetin = scanner.nextLine().toLowerCase();

        int index = girilenMetin.indexOf(arananMetin);

        if (index != -1){

            System.out.println("girilen metin aranan metni iceriyor");
        }
        else {
            System.out.println("girilen metin aranan metni iceriyor ");

        }



    }
}
