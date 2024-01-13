package StringManupulationMethodlar;

public class Soru_10 {

    public static void main(String[] args) {

        //Kelime Uzunlukları:
        //Verilen bir cümledeki her kelimenin uzunluğunu hesaplayarak, her kelimenin uzunluğunu sıralama.

        String metin = "Buraya kadar gelmen buyuk bir basari kendine guven ve sadece ilerle";

        String[] metinArr = metin.split(" ");

        int[] kelimeUzunluk = new int[metinArr.length];


        for (int i = 0; i < metinArr.length; i++) {

            for (int j = 0; j < kelimeUzunluk[i]; j++) {

                if (kelimeUzunluk[i] > kelimeUzunluk[j]){



                }
            }
        }
    }
}
