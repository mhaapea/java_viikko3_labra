import java.util.*;

public class A2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Oulu");       //4
        list.add("Tampere");    //7
        list.add("Tukholma");   //8
        list.add("Muonio");     //6
        list.add("Vaasa");      //5

        System.out.println("Ennen sorttia: " + list);

        Collections.sort(list, Comparator.comparingInt(String::length));

        System.out.println("Sorttauksen jälkeen: " + list);
    }
}
