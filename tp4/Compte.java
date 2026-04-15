package tp4;

class Compte {
    protected String numero;
    protected String titulaire;
    protected double solde;

    public Compte(String numero, String titulaire, double solde) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Montant de dépôt invalide.");
        }
    }

    public void retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant.");
        }
    }

    public void afficher() {
        System.out.println("Numéro: " + numero + " | Titulaire: " + titulaire + " | Solde: " + solde);
    }
}
