package StringManupulationMethodlar;

public class Soru__16 {

    public static void main(String[] args) {

        //"charAt() metodunu kullanarak bir tam sayının son basamağını nasıl elde edebiliriz?
        // Örnekle açıklayabilir misiniz?"

        int tamSayi = 1234;

        char sonBasamak = Integer.toString(tamSayi).charAt(Integer.toString(tamSayi).length()-1);
        System.out.println(sonBasamak);


    }
}
