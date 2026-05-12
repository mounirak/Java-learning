package arraylist;
import java.util.*;
public class Programmeprincipal {
    public static void main(String[] args) {
        ArrayList<Etudiant> liste = new ArrayList<>();
        liste.add(new Etudiant(1, "mounir", 17));
        liste.add(new Etudiant(2, "wissam", 16));
        liste.add(new Etudiant(3, "marwa", 19));
        liste.add(new Etudiant(4, "taha", 18));
        liste.add(new Etudiant(5, "ali", 15));
        liste.forEach(System.out::println);  
        for (Etudiant e : liste) {
            if (e.nom.equals("walid")) {
                System.out.println("Trouvé : " + e);
            }
        }
        liste.removeIf(e -> e.id == 3);
        liste.sort(Comparator.comparingDouble(e -> e.moyenne));
        Etudiant max = Collections.max(liste, Comparator.comparingDouble(e -> e.moyenne));
        System.out.println("+ Meilleur : " + max);
    }
}
