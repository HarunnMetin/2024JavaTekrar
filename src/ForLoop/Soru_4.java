package ForLoop;

public class Soru_4 {

    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissi

        int basDegeri = 6;
        int bitDegeri = 7;
        int toplam = 0;

        if (bitDegeri < basDegeri){
            int temp = basDegeri;
            basDegeri = bitDegeri;
            bitDegeri = temp;
        }

        for (int i = basDegeri; i <=bitDegeri ; i++) {

            toplam += i;
        }
        System.out.println(toplam);

    }
}
