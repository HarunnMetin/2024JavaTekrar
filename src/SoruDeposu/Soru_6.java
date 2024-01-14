package SoruDeposu;

public class Soru_6 {

    public static void main(String[] args) {

        //Bir dize içindeki her bir karakterin ASCII değerini nasıl bulunur?

        String dize = "ben kesinlikl basaracagim";
        for (int i = 0; i < dize.length(); i++) {

            char karakter = dize.charAt(i);
            int asciiDegeri = karakter;
            System.out.print(asciiDegeri + " ");
        }

    }
}

