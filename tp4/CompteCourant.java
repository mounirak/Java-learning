package tp4;

public class CompteCourant extends Compte {
    private double decouvertAutorise;

    public CompteCourant(String numero1,String tilulaire1,double solde1,double decouvertAutorise1){
        super(numero1,tilulaire1,solde1);
        this.decouvertAutorise=decouvertAutorise1;
    }
@Override
    public void retirer(double montant){
        if(solde-montant>=-decouvertAutorise ){
            solde-=montant;
        }else{
            System.out.println("Montant de dépôt invalide.");
        }
    }
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("decouvertAutorise"+decouvertAutorise);
    }
}