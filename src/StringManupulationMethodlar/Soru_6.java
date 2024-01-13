package StringManupulationMethodlar;

import java.util.Arrays;

public class Soru_6 {

    public static void main(String[] args) {

        //Bir cümle içinde kaç kelime olduğunu nasıl sayabilirsin?

        String cumle = "ben her ne kadar zor olursa olsun basaracagim";

        String[] cumleArr = cumle.split(" ");
        System.out.println(Arrays.toString(cumleArr));
        System.out.println("cumlede " + cumleArr.length + " tane kelime vardir");

    }
}
