package StringBuilder;

import java.util.Scanner;

public class Soru_1 {

    public static void main(String[] args) {

        //Kullanıcıdan alınan iki String'i birleştirip ekrana yazdıran bir program yazın.
        // Bu işlemi StringBuilder kullanarak gerçekleştirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci metni giriniz");
        String metin1 = scanner.nextLine();
        System.out.println("ikinci metni giriniz");
        String metin2 = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        System.out.println(stringBuilder.append(metin1).append(metin2));
    }
}
