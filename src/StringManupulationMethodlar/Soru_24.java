package StringManupulationMethodlar;

public class Soru_24 {

    public static void main(String[] args) {

        //String Birleştirme:
        //
        //İki String'i nasıl birleştirirsiniz?

        String str1 = "Ben";
        String str2 = "Basaracagim";

        StringBuilder sb = new StringBuilder();

        sb.append(str1).append(" ").append(str2);
        System.out.println(sb);


    }
}
