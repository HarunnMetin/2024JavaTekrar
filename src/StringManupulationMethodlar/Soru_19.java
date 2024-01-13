package StringManupulationMethodlar;

public class Soru_19 {

    public static void main(String[] args) {

        //"substring() metodu ile bir kelimenin ortasındaki harfleri nasıl elde edebiliriz?"

        String kelime = "motivasyon";

        System.out.println(kelimeOrtasi(kelime));
    }

    public static String kelimeOrtasi (String kelime){

        int kelimeUzunlugu =kelime.length();

        int ortaIndex = kelimeUzunlugu / 2;

        if (kelimeUzunlugu %2 ==0){

            return kelime.substring(ortaIndex-1 , ortaIndex + 1);
        }
        else {
            return kelime.substring(ortaIndex);
        }

    }
}
