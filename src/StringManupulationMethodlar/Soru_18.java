package StringManupulationMethodlar;

public class Soru_18 {

    public static void main(String[] args) {

        //"substring() metodunu kullanarak bir metnin belirli bir aralığı nasıl alabiliriz?"

        String metin = "her ne pahasina olursa olsun ben hedefime kavusacagim";
        String[] metinArr = metin.split(" ");

        String yeni= metin.substring(2,7);
        System.out.println(yeni);

        //"substring() metodu ile bir kelimenin ortasındaki harfleri nasıl elde edebiliriz?"

        String ortaHarfler = metinArr[0];
        System.out.println(ortaHarfler.substring(1,2));
    }
}
