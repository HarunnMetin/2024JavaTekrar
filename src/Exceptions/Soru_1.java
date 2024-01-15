package Exceptions;

import java.util.Scanner;

public class Soru_1 {

    public static void main(String[] args) {

        //Kullanıcıdan alınan bir sayının pozitif olup olmadığını kontrol eden bir program yazın.
        // Eğer sayı negatifse bir istisna fırlatın.

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("lutfen pozitif bir sayi giriniz");
            int sayi = scanner.nextInt();
            if (sayi<0){
                throw new IllegalArgumentException("Negatif sayi girisi hatasi");
            }
            System.out.println("sayi :"+sayi);

        }catch (IllegalArgumentException e){

            System.out.println("Hata!!" + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Bilinmeyen bir hata olustu " +e.getMessage());
        }
        finally {
            System.out.println("gercekten basaracaksin ben bına kalpten inaniyorum");
        }
    }
}
