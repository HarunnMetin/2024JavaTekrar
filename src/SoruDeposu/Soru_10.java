package SoruDeposu;

import java.util.Scanner;

public class Soru_10 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        //oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        //yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi = scanner.nextInt();;

        if (sayi % 2 != 0 && sayi >0){
            System.out.println("sayi pozitif bir tek sayidir");

        }
        else if (sayi %2 !=0 && sayi<0) {

            System.out.println("sayi bir negatif tek tamsayidir");
        }
        else if (sayi %2 == 0 && sayi %10 == 0){
            System.out.println("sayi cift sayidir ve onun katidir");

        }
        else if (sayi %2 == 0 && sayi %10 != 0){
            System.out.println("sayi cift sayidir ve onun kati degildir");
        }



    }
}
