package tp4;

public class ComptePremium extends Compte {
    private double plafonRetrait;

    public ComptePremium(String numero1,String tilulaire1,double solde1,double plafonRetrait1){
        super(numero1,tilulaire1,solde1);
        this.plafonRetrait=plafonRetrait1;
    }

    @Override
    public void retirer(double solde){
        if(solde>plafonRetrait){
            System.out.println("Montant de retrait invalide.");
        }else{
            super.retirer(solde);
        }
    }
}