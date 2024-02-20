package ForLoop;

import java.util.Scanner;

public class Soru_5 {

    public static void main(String[] args) {

        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk birsayi giriniz");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi >20){

            System.out.println("Lutfen 20'den kucuk birsayi giriniz");
        }
        int carpim = 1;
        for (int i = 1; i <=girilenSayi ; i++) {
            carpim *=i;
        }
        System.out.println(carpim);
    }
}
