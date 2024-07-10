package Oppgave1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {
        String innFornavn = showInputDialog("Skriv inn fornavnet");
        String innEtternavnet = showInputDialog("Skriv inn etternavnet");
        String ut = "Du heter "+innFornavn+" "+innEtternavnet;

        showMessageDialog(null,ut);
    }
}