package ForLoop;

import java.util.Scanner;

public class Soru_3 {

    public static void main(String[] args) {

        //- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        int basDegeri = 12;
        int bitDegeri = 90;

        int toplam = 0;

        for (int i = basDegeri; i <=bitDegeri ; i++) {

            if (bitDegeri < basDegeri){
                System.out.println("bitis degeri baslangic degerinden kucuk olamaz");
            }
            else {
                toplam +=i;

            }

        }
        System.out.println("TOPLAM : " +toplam);
    }
}
