package SoruDeposu;

import java.util.Scanner;

public class Soru_13 {

    public static void main(String[] args) {

        //: Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
        //icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
        //- String aranan metni icermiyor
        //- Aranan metin String’de sadece 1 kere kullanilmis
        //- Aranan metin String’de sadece 1’den fazla kullanilmi


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String girilenMetin = scanner.nextLine();
        System.out.println("lutfen girdiginiz metinde araadiginiz kelimeyi veya cumleyiyaziniz");
        String arananMetin = scanner.nextLine().toLowerCase();

        int index = girilenMetin.indexOf(arananMetin);

        if (index == -1) {
            System.out.println("String aranan metni icermiyor");
        }
        else {

            int sonrakiIndex = girilenMetin.indexOf(arananMetin,index +1);
            if (sonrakiIndex ==-1){
                System.out.println("Aranan metin String’de sadece 1 kere kullanilmistir");
            }
            else {
                System.out.println("Aranan metin String’de sadece 1’den fazla kullanilmistir");
            }
        }
    }
}
