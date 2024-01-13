package StringManupulationMethodlar;

import java.util.Scanner;

public class Soru_15 {

    public static void main(String[] args) {

        //Bir kullanıcının girdiği bir sayının onlar basamağındaki rakamı nasıl bulunur?
        // charAt() metodu burada nasıl kullanılır?"

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen onlar basamagindaki rakami gormek istediginiz rakami giriniz");
        int girlenSayi = scanner.nextInt();

        char onlarBasamagi = Integer.toString(girlenSayi).charAt(Integer.toString(girlenSayi).length()-3);
        System.out.println(onlarBasamagi);




    }
}
