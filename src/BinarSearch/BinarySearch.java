package BinarSearch;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BinarySearch {

    public static void main(String[] args) {

        //Dizide Eleman Bulma:
        //Bir int dizisinde, Arrays.binarySearch() metodunu kullanarak
        //belirli bir sayıyı bulmak için nasıl bir kod yazılır?

        int[] sayiArr = {2,3,4,2,4,54,5,3,4,3,4,3,5,4,53,4,3,3,2,4,34,12,23,4,4,34,34};

        int arananSayi = 4;
        Arrays.sort(sayiArr);
        System.out.println(Arrays.toString(sayiArr));
        int index = Arrays.binarySearch(sayiArr,arananSayi);

        if (index>=0){
            System.out.println(arananSayi + " sayisi arrayin "+ index +". indexsinde bulunuyor");
        }
        else {
            System.out.println(arananSayi + " arrayda bulunmadi");
        }
    }
}
