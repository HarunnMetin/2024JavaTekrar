package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

public class Soru_2 {

    public static void main(String[] args) {

        //Soru 1: Kullanıcıdan doğum tarihi alarak, yaşını hesaplayan bir Java programı nasıl yazılır?

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dogum tarihinizi giriniZ 'yyyy-MM-dd'");
        String dogumTarihiStr = scanner.nextLine();

        LocalDate dogumTarihi = LocalDate.parse(dogumTarihiStr);
        LocalDate simdikiZaman = LocalDate.now();

        Period yas = Period.between(dogumTarihi,simdikiZaman);
        System.out.println(yas);
        System.out.println("Yıl :" +yas.getYears()+" Ay : "+yas.getMonths()+" Gun :"+yas.getDays());





    }
}
