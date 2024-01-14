package StringBuilder;

import java.util.Scanner;

public class Soru_5 {

    public static void main(String[] args) {

        //Kullanıcıdan alınan bir kelimeyi tersten yazdıran bir program yazın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String girilenKelime = scanner.next();

        StringBuilder sb = new StringBuilder(girilenKelime);
        System.out.println(sb.reverse());
    }
}
