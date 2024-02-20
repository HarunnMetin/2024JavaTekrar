package ForLoop;

import java.util.Scanner;

public class Soru_3 {

    public static void main(String[] args) {

        //- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        int basDegeri = 123;
        int bitDegeri = 90;

        int toplam = 0;

        for (int i = basDegeri; i <=bitDegeri ; i++) {

                toplam +=i;
        }
        if (bitDegeri < basDegeri){
            System.out.println("bitis degeri baslangic degerinden kucuk olamaz");
        }
        System.out.println("TOPLAM : " +toplam);
    }
}
