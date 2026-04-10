import java.util.*;

public class A1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("b", "a", "c");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
