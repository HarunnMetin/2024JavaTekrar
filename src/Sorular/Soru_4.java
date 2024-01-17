package Sorular;

public class Soru_4 {

    public static void main(String[] args) {

        //: Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 26.70 €

        String input1 = "“15.30 €";
        String input2 = "“11.40 €";

        String duzeltme = input1.replaceAll("[^0-9.]+" ,"");
        String duzeltme2 = input2.replaceAll("[^0-9.]+","");

        double islem = Double.parseDouble(duzeltme);
        double islem2 = Double.parseDouble(duzeltme2);

        double toplam = islem+islem2;
        System.out.println("toplam :" +toplam);


    }
}
