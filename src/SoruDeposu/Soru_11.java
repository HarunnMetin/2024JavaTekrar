package SoruDeposu;

import java.util.Scanner;

public class Soru_11 {

    public static void main(String[] args) {

        //Kullanicidan gun ismin girmesini isteyin, girilen gun hafta ici bir gun ise
        //“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        //gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
        //zamani” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi girin");
        String gunIsmi = scanner.next().toLowerCase();


       switch (gunIsmi){

           case "pazartesi":
               System.out.println("simdi calisma zamani haftasonuna 4 gun var");
               break;
           case "salı":
               System.out.println("simdi calisma zamani haftasonuna 3 gun var");
               break;
           case "çarşamba":
               System.out.println("simdi calisma zamani haftasonuna 2 gun var");
               break;
           case "perşembe":
               System.out.println("simdi calisma zamani haftasonuna 1 gun var");
               break;
           case "cuma":
               System.out.println("simdi calisma zamani haftasonuna 0 gun var");
               break;
           case "cumartesi":

           case "pazar":
               System.out.println("bugun haftasonu simdi dinlenme zamani");
               break;
           default:
               System.out.println("boyle bir gun yok");
       }
    }
}
