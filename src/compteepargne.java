public class compteepargne extends compte{
    public int fraisgestion;
    public compteepargne(int identifcompte, int soldeinitial,int fraisgestion) {
        super(identifcompte, soldeinitial);
        fraisgestion=fraisgestion;
    }

    @Override
    public void ajoutfrais(double frais) {
        if(frais>0){
            retirer(frais);
            System.out.println("le frais de "+frais +"a ete retiree");
        }
    }
}
