package StringManupulationMethodlar;

import java.util.Scanner;

public class Soru_13 {

    public static void main(String[] args) {

        // Kullanıcının girdiği bir kelimeyi kontrol ederek, metin içerisinde o
        // kelimenin geçip geçmediğini kontrol eden bir program."

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String girilenCumle= scanner.nextLine();
        System.out.println("metin icerisinde aradiginiz kelimeyi giriniz");
        String aranacakKelime = scanner.next();

        if (girilenCumle.contains(aranacakKelime)){
            System.out.println("aradiginiz kelime cumlede var");
        }
        else {
            System.out.println("aradiginiz kelime cumlede yok");
        }



    }
}
