package tp4;

public class CompteEpargne extends Compte {
    private double tauxInteret;

    public CompteEpargne(String numero1,String tilulaire1,double solde1,double tauxInteret1){
        super(numero1,tilulaire1,solde1);
        this.tauxInteret=tauxInteret1;
    }
    public void calulerInternet(double solde){
        solde=solde+(solde*tauxInteret);
    }
    @Override
    public void retirer(double solde){
        super.retirer(solde);
    }
}