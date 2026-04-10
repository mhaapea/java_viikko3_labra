import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("Anna opiskelijoiden nimet, syötä STOP lopettaaksesi: ");
        boolean exit = false;
        String STOP = "stop";

        while(!exit) {
            String input = sc.nextLine();
            if(input.equals(STOP)) {
                exit = true;
            } else {
                list.add(input);
            }
        }
        System.out.println("Ohjelma lopettetu. Opiskelijat: " + list);
        sc.close();
    }
}
