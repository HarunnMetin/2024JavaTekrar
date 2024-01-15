package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Soru_3 {

    public static void main(String[] args) {

        // Bir dosyaya yazma işlemi gerçekleştirmeye çalışın.
        // Ancak yazma işlemi sırasında bir hata oluşursa bir istisna fırlatın.

        String dosya = "src/Exceptions/Dosya.txt";

        try {
            FileWriter writer = new FileWriter(dosya);
            writer.write("Basariya acsin o yuzden calisiyorsun durma devam et");
            writer.close(); // Yazmayı bitiriyoruz

            System.out.println("Dosya yazma işlemi başarılı!");

        } catch (IOException e) {
            System.out.println("Hata: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Beklenmeyen bir hata oluştu: " + e.getMessage());
        } finally {
            System.out.println("Basarili");
        }
    }
}
