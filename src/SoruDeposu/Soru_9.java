package SoruDeposu;

import java.util.Scanner;

public class Soru_9 {

    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdiri

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir har giriniz");
        char harf = scanner.next().charAt(0);

        if (harf >='a'&& harf <='z'){
            System.out.println(Character.toUpperCase(harf));
        }
        else {
            System.out.println(harf);
        }
    }
}
