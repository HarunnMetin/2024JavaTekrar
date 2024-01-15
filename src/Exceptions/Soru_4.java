package Exceptions;

import java.util.Scanner;

public class Soru_4 {

    public static void main(String[] args) {

        //Kullanıcıdan bir sayı girişi alın. Eğer kullanıcı sayı girişi yapmazsa
        //veya girilen değer bir sayıya dönüştürülemezse bir istisna fırlatın.

        Scanner scanner= new Scanner(System.in);

        try {
            System.out.println("Lutfen bir sayi giriniz");
            String girilenSayi = scanner.next();

            if (girilenSayi.isEmpty()){
                throw new IllegalArgumentException("Bos deger girisi saptandi");
            }
            int sayi = Integer.parseInt(girilenSayi);
            System.out.println("Girilen sayi :"+sayi);
        }
        catch (IllegalArgumentException e){

            System.out.println("Hata :"+ e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(2*2);
        }
    }
}
