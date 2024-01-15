package Exceptions;

import java.util.Arrays;

public class Soru_2 {

    public static void main(String[] args) {

        //Bir dizide belirli bir indekse erişmeye çalışın.
        // Ancak indeks, dizinin boyutunu aşıyorsa bir istisna fırlatın.



        try {
            int[] dizi = {1,2,3,4,5};
            int index = 3;

            if (index >= dizi.length || index < 0){

                throw new  IndexOutOfBoundsException("Index dizi sinirlarinin disinda");
            }
            System.out.println(Arrays.toString(dizi));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Hata!!" + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Bilinmeyen hata!!!!!!" + e.getMessage());
        }
        finally {
            System.out.println("yapabidigimin farkinda oldugum icin birakamiyorum");
        }
    }
}
