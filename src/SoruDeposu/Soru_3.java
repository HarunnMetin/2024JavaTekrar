package SoruDeposu;

import java.util.Scanner;

public class Soru_3 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();

        byte sayi2 = (byte) sayi;
        System.out.println(sayi2);
    }
}
