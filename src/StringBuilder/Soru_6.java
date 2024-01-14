package StringBuilder;

import java.util.Arrays;

public class Soru_6 {

    public static void main(String[] args) {

        //Bir dizi içindeki sayıları virgülle ayrılmış bir String'e dönüştüren bir program yazın.

        int[] sayilar = {42, 17, 89, 5};

        StringBuilder sb = new StringBuilder();

        for (Integer each: sayilar) {

            sb.append(each).append(", ");
        }
        System.out.println(sb);

        if (sb.length() > 0){
            sb.deleteCharAt(sb.length()-2);
        }

        System.out.println(sb);


    }
}
