package ForLoop;

import java.util.Scanner;

public class Soru_7 {

    public static void main(String[] args) {

        //- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        int toplam = 0;
        if (girilenSayi<0){
            System.out.println("girilen sayi pozitif olmali");
        }


        // Sayının rakamlarını toplamak için her bir rakamı ayırın ve toplama ekleyin
        for (int temp = girilenSayi;temp >0; temp /= 10) {
            toplam += temp %10;
        }
        System.out.println("Girilen sayının rakamlarının toplamı: " + toplam);
    }


}
