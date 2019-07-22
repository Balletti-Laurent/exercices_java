/**
 * Ce programme lit trois nombres au clavier et determine s'ils
 * sont en ordre croissant strict.
 * Le programme affiche un message pour signaler ce resultat.
 */
public class CroissantStrict{
  public static void main(String[] args){
    int a,b,c;
    boolean cr;
    // Lecture a,b,c
    System.out.print("Premier entier: ");
    a= Terminal.lireInt();
    System.out.print("deuxieme entier: ");
    b= Terminal.lireInt();
    System.out.print("troisieme entier: ");
    c= Terminal.lireInt();
    // Calcul d'un boolean correspondant au resultat
    cr = a<b && b< c;
    // Affichages
    System.out.print("Les nombres "+a+", "+b+", "+c);
    if (cr) {
         System.out.println(", sont en ordre croissant strict."); 
    } else {
          System.out.println(", ne sont pas en ordre croissant strict."); 
    }
  }
}




// Tableau de test :
// 1, 5, 8 = sont en ordre croissant strict
// 12, 52, 53  = sont en ordre croissant strict
// -1, 2, 3  = sont en ordre croissant strict
// 5, 1, 8  = ne sont pas en ordre croissant strict
// 5, 12, 8  = ne sont pas en ordre croissant strict