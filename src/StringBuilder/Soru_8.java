package StringBuilder;

public class Soru_8 {

    public static void main(String[] args) {

        String str = "Merhaba, dünya!";

        // 'a' karakterinin indeksini bul

        int index = str.indexOf("a");
        System.out.println("a'nin indexi :" +index);

        String str2 = "Ben basariya dogru gidiyorum Allah'ım sen yardim et";

        int index2 = str2.indexOf("gidiyorum");
        if (index2 ==-1){
            System.out.println("bole bir metin bulunmadi");
        }
        else {
            System.out.println("metin bulundu ve metin indexi :" +index2);
        }

        String str3 = "Merhaba, dünya! Merhaba, Java!";

        // İkinci "Merhaba" alt dizisinin indeksini bul

        int index3 = str3.indexOf("Merhaba",str3.indexOf("Merhaba") + 1 );

        System.out.println("ikinci merhaba "+index3+". indexte kullanilmistir");


    }
}
