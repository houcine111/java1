import java.util.List;

public abstract class compte implements comptebancaire {
    public int identifcompte;
   private double soldeinitial;

    public compte(int identifcompte,int soldeinitial){
        this.identifcompte=identifcompte;
        this.soldeinitial=soldeinitial;

    }
    public double getsolde(){
        return soldeinitial;
    }

    public int getIdentifcompte() {
        return identifcompte;
    }
    public  void deposer(double montant){
        if(montant>0) {
            soldeinitial+=montant;
            System.out.println("le montant de transaction est de " +montant+ "a ete ajoute au solde "+soldeinitial);
        }else {
            throw new soldenegativeexeption("le montant est negative");
        }
    };
    public  void retirer(double montant){
        if(montant>0){
           soldeinitial-=montant;
        }else{
            throw new soldenegativeexeption("montant est insuffisant");

        }
    };
    public  void virement(double soldeenv, int idcomptdest, List<compte> l1){
        if(soldeenv>0 ){
           retirer(soldeenv);
           for(compte c:l1){
               if(c.getIdentifcompte()==idcomptdest){
                   c.deposer(soldeenv);

               }
           }
        }
        else{
            throw new soldenegativeexeption("monatnt est insuff");
        }
    }
    public abstract void ajoutfrais(double frais);





}
