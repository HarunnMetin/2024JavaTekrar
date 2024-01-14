package StringBuilder;

import java.util.Arrays;

public class Soru_3 {

    public static void main(String[] args) {

        //Verilen bir cümledeki boşlukları kaldıran bir program yazın. strinBuilder ile yapin

        String cumle = "kimsenin umurunda degilsin. o yuzden kendine gel";

        StringBuilder stringBuilder = new StringBuilder(cumle);
        int index = 0;

        while ((index = stringBuilder.indexOf(" ", index)) != -1) {
            stringBuilder.deleteCharAt(index);
        }
        System.out.println(stringBuilder);

    }
}
