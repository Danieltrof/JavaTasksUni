package Oppgave1;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main(String[] args) {
        String innStreng = showInputDialog("Skriv inn alder");
        int tall1 = Integer.parseInt(innStreng);
        JOptionPane.showMessageDialog(null,"Alderen din er "+tall1+" år.");
    }
}