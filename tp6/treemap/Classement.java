package treemap;
import java.util.*;
public class Classement {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(101, "Ali");
        map.put(50, "mounir");
        map.put(200, "walid");
        System.out.println(map);
        System.out.println("Premier : " + map.firstEntry());
        System.out.println("Dernier : " + map.lastEntry());
        System.out.println(map.tailMap(100));
    }
}
