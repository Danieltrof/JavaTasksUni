package Oppgave3;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {
        String innFornavn = showInputDialog("Skriv inn fornavnet");
        String innEtternavnet = showInputDialog("Skriv inn etternavnet");
        String innAlder = showInputDialog("Skrive inn alder");
        String innAdresse = showInputDialog("Skriv inn adressen");
        String innPostSted = showInputDialog("Skriv inn poststedet");
        String innPostNr = showInputDialog("Skriv inn postnr");

        String ut = innFornavn+" "+innEtternavnet+" bor i "+innAdresse+" som har postnummeret "+innPostNr+" i "+
                innPostSted+". "+innFornavn+"'s alder er "+innAlder+" år.";

        showMessageDialog(null,ut);
    }
}
