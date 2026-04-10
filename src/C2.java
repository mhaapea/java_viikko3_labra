import java.util.*;

public class C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();

        boolean exit = false;
        String stop = "stop";

        System.err.println("Ohjelma laskee uniikit sanat. Syötä stop lopettaaksesi.");

        while(!exit) {
            String input = sc.nextLine();
            if (input.equals(stop)) {
                exit = true;
            } else {
                set.add(input);
            }
        }
        System.out.println("Uniikkien sanojen lkm: " + set.size());
        sc.close();
    }
}
