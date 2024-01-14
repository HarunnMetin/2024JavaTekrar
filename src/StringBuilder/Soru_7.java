package StringBuilder;

public class Soru_7 {

    public static void main(String[] args) {

        //Bir cümlede geçen belirli bir kelimenin kaç kez tekrarlandığını bulan bir program yazın.

        String cumle = "senin hayatin senin senin  senin senin senin kararlarin";
        kelimeTekrari(cumle , "senin");

    }
    public static void kelimeTekrari(String metin , String hedefKelime){


        StringBuilder sb = new StringBuilder(metin);

        int sayac= 0;

        int index = sb.indexOf(hedefKelime);

        while (index !=-1){

            sayac++;
            index = sb.indexOf(hedefKelime ,index +1);
        }
        System.out.println(hedefKelime + " kelimesi "+sayac+" defa kullanilmistir");

    }
}
