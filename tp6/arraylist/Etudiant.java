package arraylist;
class Etudiant {
    int id;
    String nom;
    double moyenne;
    public Etudiant(int id, String nom, double moyenne) {
        this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
    }
    public String toString() {
        return "=> ID : "+id +"\n"+"Nom : "+nom +"\n"+"Moyenne : "+"\n"+moyenne;
    }
}
