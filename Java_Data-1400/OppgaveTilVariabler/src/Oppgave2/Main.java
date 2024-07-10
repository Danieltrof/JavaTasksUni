package Oppgave2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {
        String innFornavn = showInputDialog("Skriv inn fornavnet");
        String innEtternavnet = showInputDialog("Skriv inn etternavnet");
        String innAlder = showInputDialog("Skrive inn alder");
        String ut = "Alderen til "+innFornavn+" "+innEtternavnet+" er "+innAlder+" år.";

        showMessageDialog(null,ut);
    }
}
