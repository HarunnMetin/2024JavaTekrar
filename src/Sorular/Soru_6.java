package Sorular;

import java.util.Scanner;

public class Soru_6 {

    public static void main(String[] args) {

        //: Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        //input : java1 ogRe2@nMek3 #ne +Gu=zel
        //output : Java ogrenmek ne guzel.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin = scanner.nextLine().toLowerCase();

        String temizlenenMetin = metin.replaceAll("[^a-zA-Z ]","");

        if (!temizlenenMetin.isEmpty()){
            temizlenenMetin = Character.toUpperCase(temizlenenMetin.charAt(0)) + temizlenenMetin.substring(1);
            System.out.println(temizlenenMetin);
        }


    }
}
