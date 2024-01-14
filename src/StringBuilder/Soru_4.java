package StringBuilder;

import java.util.Arrays;

public class Soru_4 {

    public static void main(String[] args) {

        //Bir dizi içindeki sayıları birleştirip ekrana yazdıran bir program yazın.

        int[] sayilar = {42, 17, 89, 5};

        StringBuilder stringBuilder = new StringBuilder();

        for (Integer eachBuilder: sayilar) {
            stringBuilder.append(eachBuilder);
        }
        System.out.println(stringBuilder);



    }
}
