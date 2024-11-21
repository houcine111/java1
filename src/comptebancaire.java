import java.util.List;

public interface comptebancaire {
     double getsolde();
     int getIdentifcompte();
     void deposer(double montant);
     void retirer(double montant);
     void virement(double soldeenv, int idcomptdest, List<compte>l1);


}
