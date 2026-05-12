package hashsetreeset;
import java.util.*;
public class Matiere {
    public static void main(String[] args) {
        HashSet<String> matieres = new HashSet<>();
        matieres.add("Math");
        matieres.add("Physique");
        matieres.add("Math");
        System.out.println(matieres);
        TreeSet<String> trie = new TreeSet<>(matieres);
        System.out.println(trie);
    }
}
