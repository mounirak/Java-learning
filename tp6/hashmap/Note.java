package hashmap;
import java.util.*;
public class Note{
    public static void main(String[] args) {
        HashMap<String, Double> notes = new HashMap<>(); 
        notes.put("mounir", 17.5);
        notes.put("walid", 18.0);
        notes.forEach((k, v) -> System.out.println("=> "+ k + " : " + v));
        System.out.println("=> Note walid : " + notes.get("walid"));
        notes.put("mounir", 18.0);
        notes.remove("walid");
        double somme = 0;
        for (double n : notes.values()) {
            somme += n;
        }
        System.out.println("=> Moyenne = " + (somme / notes.size()));
    }
}
