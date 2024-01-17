package Maps;

import java.util.HashMap;
import java.util.Map;

public class Soru_1 {

    public static void main(String[] args) {

        //HasMap
        Map<String,Integer> map = new HashMap<>();

        map.put("Basaracagim ben",12);
        map.put("inaniyorum cunku",10);

        System.out.println(map.get("Basaracagim ben"));
        System.out.println(map);
    }
}
