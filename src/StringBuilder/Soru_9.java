package StringBuilder;

public class Soru_9 {

    public static void main(String[] args) {

        //Soru 1: Karakter Dizisi İçinde Belirli Bir Karakterin Tüm İndekslerini Bulma

        String str = "Ben basariya dogru gidiyorum Allah'ım sen yardim et";

        int indexs = str.indexOf('a');
        while (indexs!=-1){
            System.out.println("a karakterimin indexi : " +indexs);
            indexs = str.indexOf('a',indexs +1);
        }


    }
}
