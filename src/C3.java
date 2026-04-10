import java.util.*;

public class C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        map.put("matti", "04006789");
        map.put("liisa", "040054321");
        map.put("veikka", "04001234");

        System.out.println("Anna nimi. Vaihtoehdot: matti, liisa, veikka ");

        String input = sc.nextLine();

        for (Map.Entry<String, String> e : map.entrySet()) {
            if(input.equals(e.getKey())) {
                System.out.println("puhelinnumero: " + e.getValue());
            }
        }

        sc.close();
    }
}
