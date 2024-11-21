public class comptecourant extends compte{

double decouv;
    public comptecourant(int identifcompte, int soldeinitial, double decou, int i) {
        super(identifcompte, soldeinitial);
        decouv=decou;
    }


    @Override
    public void ajoutfrais(double frais) {
     if(frais>0){
         retirer(frais);
         System.out.println("le frais de "+frais +"a ete retiree");
     }
    }
}
