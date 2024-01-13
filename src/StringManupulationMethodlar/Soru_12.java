package StringManupulationMethodlar;

import java.util.Arrays;

public class Soru_12 {

    public static void main(String[] args) {

        //Verilen bir string ifadeyi parseInt() methodunu kullanarak bir tamsayıya nasıl çevirebilirsin?

        String str = "ben 10 yil sonra milyonerim";

        String[] indexStr = str.split(" ");

        int sayi = Integer.parseInt(indexStr[1]);
        System.out.println(sayi);


    }
}
