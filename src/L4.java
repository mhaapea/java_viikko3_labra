import java.util.List;
import java.util.ArrayList;

public class L4 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("A");
        li.add("B");
        li.add("C");
        li.remove(1);
        System.out.println(li);
    }
}
