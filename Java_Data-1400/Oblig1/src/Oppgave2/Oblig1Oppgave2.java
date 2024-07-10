package Oppgave2;

import javax.swing.*;
public class Oblig1Oppgave2 {

    public static void main(String [] args){
        String navn1, navn2;
        int antall1, antall2;
        double pris1, pris2;

        // les inn navn, antall og pris for vare 1
        navn1 = JOptionPane.showInputDialog("Skriv inn navn på vare 1");
        antall1 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall av vare 1"));
        pris1 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn prisen på vare 1"));

        // les inn navn, antall og pris for vare 2
        navn2 = JOptionPane.showInputDialog("Skriv inn navn på vare 2");
        antall2 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall av vare 2"));
        pris2 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn prisen på vare 2"));

        // bruk avvikshåntering (try/catch) for å konvertere antall og pris for vare 1 og vare 2
        Vare vare1, vare2;
        try {
            vare1 = new Vare(navn1,antall1,pris1);
            vare2 = new Vare(navn2,antall2,pris2);
        } catch (Exception e){
            vare1 = new Vare(navn1, (int) antall1, (double) pris1);
            vare2 = new Vare(navn2, (int) antall2, (double) pris2);
        }

        // beregn og skriv ut total pris for alle varer i System.out
        System.out.println("Totalpris for vare1: " + vare1.totalPris() + "kr." + "\n" +
                "Totalpris for vare2: " + vare2.totalPris() + "kr." + "\n" +
                "Altså er sluttprisen på " + (vare1.totalPris()+vare2.totalPris()));
    }
}
