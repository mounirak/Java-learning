package ShopExpress;
public class Main {
 public static void main(String[] args) {
     double solde = 1000;
     try {
         double nouveauSolde = effectuerPaiement(300, solde);
         System.out.println("Paiement effectué.");
         System.out.println("Nouveau solde : " + nouveauSolde);
     } catch (IllegalArgumentException e) {
         System.out.println("Erreur : montant invalide.");
     } catch (ArithmeticException e) {
         System.out.println("Erreur : solde insuffisant.");
     } finally {
         System.out.println("Fin de la transaction");
     }
     double montant = lireMontantLocal("250");
     System.out.println("Montant lu : " + montant);
     montant = lireMontantLocal("abc");
     System.out.println("Montant lu : " + montant);
     montant = lireMontantLocal("-50");
     System.out.println("Montant lu : " + montant);
     try {
         double m = lireMontant("500");
         System.out.println("Montant : " + m);

     } catch (NumberFormatException e) {
         System.out.println("Erreur : valeur non numérique.");

     } catch (IllegalArgumentException e) {
         System.out.println("Erreur : montant négatif.");
     }
     double[] tab = {100, 200, 300};
     try {
         double valeur = lireTransaction(tab, 1);
         System.out.println("Transaction : " + valeur);

     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Erreur : index invalide.");

     } catch (NullPointerException e) {
         System.out.println("Erreur : tableau non initialisé.");
     }

 }
 public static double effectuerPaiement(double montant, double solde) {
     if (montant <= 0) {
         throw new IllegalArgumentException();
     }
     if (montant > solde) {
         throw new ArithmeticException();
     }
     return solde - montant;
 }
 public static double lireMontantLocal(String valeur) {
     try {
         double montant = Double.parseDouble(valeur);
         if (montant < 0) {
             throw new IllegalArgumentException();
         }
         return montant;
     } catch (NumberFormatException e) {
         System.out.println("Erreur : texte non numérique.");
     } catch (IllegalArgumentException e) {
         System.out.println("Erreur : montant négatif.");
     }
     return 0; 
 }
 public static double lireMontant(String valeur)
         throws NumberFormatException, IllegalArgumentException {
     double montant = Double.parseDouble(valeur);
     if (montant < 0) {
         throw new IllegalArgumentException();
     }
     return montant;
 }
 public static double lireTransaction(double[] tab, int index) {
     return tab[index];
 }
}