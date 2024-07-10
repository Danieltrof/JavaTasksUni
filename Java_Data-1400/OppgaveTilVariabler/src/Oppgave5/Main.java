package Oppgave5;

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

        String ut = "Navn : "+innFornavn+" "+innEtternavnet+"\n"+
                "Adresse : "+innAdresse+"\n"+
                "Postnummer : "+innPostNr+"\n"+
                "Poststed : "+innPostSted+"\n"+
                "Alder : "+innAlder;

        System.out.println(ut);
    }
}