import java.util.Map;
import java.util.HashMap;

public class M2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        for (Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.println(e.getKey()+": "+e.getValue());
        }
    }
}
