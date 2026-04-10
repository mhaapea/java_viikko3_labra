import java.util.*;
import java.util.stream.Collectors;

public class C4 {
    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ohjelma laskee uniikit sanat lauseesta. Anna lause:");

        String input = sc.nextLine();
        String[] words = input.split(" ");

        for(String str : words) {
            list.add(str);          //vrm aika tehoton tapa
        }


        map = list.stream().collect(Collectors.groupingBy(l -> l, Collectors.counting())); //koodipätkä netistä aikalailla ratkas kaiken

        Collections.sort(list);
        System.out.println("Annetut sanat aakkosjärjestyksessä listassa" + list);
        System.out.println("Mapin sisältö" + map);

        sc.close();
    }
}
