package StringManupulationMethodlar;

public class Soru_21 {

    public static void main(String[] args) {
        //Bir String'in uzunluğunu nasıl bulursunuz?

        String str = "ben cok iyi gidiyorum boyle devam edecegim ve basaracagim";
        int uzunluk = str.length();
        System.out.println(uzunluk);

        //Bir String'in belirli bir indeksindeki karakteri nasıl alırsınız?

        System.out.println(str = String.valueOf(str.charAt(2)));
    }
}
