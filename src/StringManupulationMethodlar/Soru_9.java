package StringManupulationMethodlar;

import java.awt.image.Kernel;

public class Soru_9 {

    public static void main(String[] args) {

        //Ters Sıralama:
        //Bir kelimenin harflerini ters sırayla dizerek yeni bir kelime oluşturma.

        String kelime = "Basaracagim";
        String tersKelime = "";

        for (int i = kelime.length()-1; i >=0 ; i--) {

            tersKelime += kelime.charAt(i);
        }
        System.out.println("ters kelime :" +tersKelime);


    }
}
