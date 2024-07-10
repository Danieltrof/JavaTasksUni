package Oppgave1;

/* Liste over studenter som leverer inn oppgavene:
    Danils Trofimovs s374922
    Hashim Ul Hassan s353670
    Mert Tunahan Altunbas s376867
 */

public class Obligoppgave1 {
    public static void main(String[] args) {
        double radius = 23.5;
        double areal = Sirkel.beregnAreal(radius);
        double omkrets = Sirkel.beregnOmkrets(radius);
        double diameter = Sirkel.beregnDiameter(radius);

        System.out.println("Areal av sirkelen med radius " + radius + " er " + String.format("%.2f",areal) + "\n" +
                "Omkretsen av sirkelen er " + String.format("%.2f",omkrets) + "\n" +
                "Diameteren av sirkelen er " + String.format("%.2f",diameter));
    }
}
