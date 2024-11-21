import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static List<compte> l1=new ArrayList<>();


   public static  void ajouter(compte c){
      l1.add(c);
   }

    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       compte c1=new comptecourant(10123,2000,15,45);
       compte c2=new compteepargne(1023,25000,100);
       c1.deposer(100);
       c2.retirer(200);
       c1.ajoutfrais(50);
       System.out.println(c1.getsolde());
       System.out.println(c2.getsolde());
       System.out.println(c1.getIdentifcompte());
       ajouter(c1);
       ajouter(c2);
       for(compte c:l1){
       System.out.println("le solde du "+ c.getIdentifcompte()+" est de "+c.getsolde());
       }
       c2.virement(100, c1.getIdentifcompte(),l1);
       System.out.println("apres virement");

       for(compte c:l1){
          System.out.println("le solde du "+ c.getIdentifcompte()+" est de "+c.getsolde());
       }





    }
}