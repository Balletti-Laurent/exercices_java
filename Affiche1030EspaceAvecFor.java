/**
 * Affiche les nombres compris entre 10 et 30 separés par un espace.
 */
public class Affiche1030EspaceAvecFor {
    public static void main(String[] args) {
        // On initialise la boucle For avec n
        for (int n = 10; n <= 30; n++) {
            // On met une condition qui permet d'afficher le point final après le chiffre 30
            if (n == 30) {
            // On affiche le point
                System.out.print(n + ".");
            // Sinon on affiche ", "
            } else {
                System.out.print(n + ", ");
            }
        }
    }
}