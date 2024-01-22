package Maps;

import java.util.HashMap;
import java.util.Map;

public class Soru_2 {

    public static void main(String[] args) {

        //Bir öğrenci sınıfının notlarını saklamak için bir HashMap kullanarak öğrenci adlarını anahtar (key)
        //olarak ve notları değer (value) olarak içeren bir program yazın.

        Map<String,Integer> ogrenciNotMap = new HashMap<>();
        ogrenciNotMap.put("Adem",101);
        ogrenciNotMap.put("Hasan",100);
        ogrenciNotMap.put("Ayse",23);
        ogrenciNotMap.put("Fatma",67);
        ogrenciNotMap.put("Derya",11);
        ogrenciNotMap.put("Melis",143);
        System.out.println(ogrenciNotMap.size());
        System.out.println(ogrenciNotMap.get("Melis"));
        System.out.println(ogrenciNotMap.containsKey("Derya"));
        System.out.println(ogrenciNotMap);
        ogrenciNotMap.replace("Melis",150);
        System.out.println("Melis :" + ogrenciNotMap.get("Melis"));
        System.out.println(ogrenciNotMap.containsKey(23));
        System.out.println(ogrenciNotMap.values());

    }
}
