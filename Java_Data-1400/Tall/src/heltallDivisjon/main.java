package heltallDivisjon;
import javax.swing.*;

public class main {
    public static void main(String [] args){
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn et heltall");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn et heltall til");
        int tall1 = Integer.parseInt(innStreng1); /*Hvis begge er definert som int vil vi få et heltall, selvom det
            ikke nødvendig er riktig svar. Dermed må en eller begge tallene være definert som double*/
        double tall2 = Double.parseDouble(innStreng2);
        double divisjon = tall1/tall2;

        JOptionPane.showMessageDialog(null,"Divisjonen ble "+divisjon);
        //System.out.println("Divisjonen ble "+divisjon);
    }
}
