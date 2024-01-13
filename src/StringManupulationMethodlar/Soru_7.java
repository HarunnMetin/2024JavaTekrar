package StringManupulationMethodlar;

public class Soru_7 {

    public static void main(String[] args) {

        //Bir metin içinde kaç karakter olduğunu nasıl bulabilirsin?

        String metin = "ben her ne kadar zor olursa olsun basaracagim";

        String[] metinArr = metin.split("");

        int karakterSayisi = metinArr.length;
        System.out.println(karakterSayisi);


    }
}
