package ForLoop;

import java.util.Scanner;

public class Soru_6 {

    public static void main(String[] args) {

        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk birsayi giriniz");
        int girilenSayi = scanner.nextInt();

        int faktoryel = 1;

        if (girilenSayi >20){
            System.out.println("Lutfen 20'den kucuk birsayi giriniz");
        }
        for (int i = 1; i <=girilenSayi ; i++) {
            faktoryel*=i;
        }
        System.out.println(girilenSayi+"! 'Sayisinin Faktoryeli :"+faktoryel);
    }
}
