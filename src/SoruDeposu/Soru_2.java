package SoruDeposu;

import java.util.Scanner;

public class Soru_2 {

    public static void main(String[] args) {

        //- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin");
        char harf = scanner.next().charAt(0);

        int ascii = harf;

        char asci1 = (char) ((char) ascii +1);
        char asci2 = (char) ((char) ascii +2);
        char asci3 = (char) ((char) ascii +3);

        System.out.println(asci1);
        System.out.println(asci2);
        System.out.println(asci3);
    }
}
