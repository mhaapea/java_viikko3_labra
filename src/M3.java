import java.util.*;

public class M3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        map.put(1, "Punainen");
        map.put(2, "Sininen");

        for (Map.Entry<Integer, String> e : map.entrySet()) {
        li.add(e.getKey());
        }
        for(int i : li) {
            System.out.print(i + " ");
        }
        System.out.println("");
        //System.out.println(li.get(0) + " " +  li.get(1));
    }
}