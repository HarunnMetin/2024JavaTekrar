package StringManupulationMethodlar;

public class Soru_11 {

    public static void main(String[] args) {

        //Bir cümle içinde geçen her kelimenin kaç kez tekrarlandığını hesaplayarak,
        // her kelimenin frekansını bulma.

        String cumle = "ben kesinlikle ve kesinlikle basarmaliyim cunku ben zorundayim";

        String[] keliemeler = cumle.split(" ");

        int[] fraknslar = new int[keliemeler.length];

        for (int i = 0; i < keliemeler.length; i++) {

            fraknslar[i] = 1;

            if (fraknslar[i] == -1){
                continue;
            }

            for (int j = i+1; j < keliemeler.length ; j++) {

                if (keliemeler[i].equalsIgnoreCase(keliemeler[j])){

                    fraknslar[j] = -1;
                    fraknslar[i]++;
                }
            }
        }
        System.out.println("cumle : " +cumle);
        System.out.println("her kelimenin frekansi");
        for (int i = 0; i < keliemeler.length; i++) {

            if (fraknslar[i] != -1){

                System.out.println(keliemeler[i] +" : "+fraknslar[i]);
            }
        }
    }
}
