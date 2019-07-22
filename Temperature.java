/**
 * Afficher la température
 */

public class Temperature {

    public static void main(String[] args) {
        int temperature = 0;

        Terminal.ecrireStringln("Saisissez une température :");

        temperature = Terminal.lireInt();


        if (temperature > 0 || temperature < 100) {
            Terminal.ecrireStringln("A " + temperature + "° l'eau est liquide.");
        } else if (temperature <= 0) {
            Terminal.ecrireStringln("A " + temperature + "° l'eau est de la glace.");
        } else if (temperature >= 100) {
            Terminal.ecrireStringln("A " + temperature + "° l'eau est de la vapeur.");
        } else {
            Terminal.ecrireStringln("Veuillez saisir un nombre.");
        }
    }
}
