package Sorular;

public class Soru_1 {

    public static void main(String[] args) {

        //Belirli Bir Karakteri veya Alt Diziyi Bulma:
        //
        //Bir String içinde belirli bir karakterin kaç kez geçtiğini nasıl bulursunuz?
        //Belirli bir alt dizinin ilk indeksini nasıl bulursunuz?

        String str = "Herkes basarimi gorecek sadece beklesinler";
        char arananKarkater = 'e';

        int karakterTekrari = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == arananKarkater){
                karakterTekrari++;
            }
        }
        System.out.println(arananKarkater + " karakteri " +karakterTekrari +" kez tekrarlanmistir");
    }
}
