package Oppgave2;

import javax.swing.*;

public class Main {
    public static void main(String [] args){
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn et desimaltall");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn et desimaltall til");
        String innStreng3 = JOptionPane.showInputDialog("Skriv inn enda et desimaltall");

        double tall1 = Double.parseDouble(innStreng1);
        double tall2 = Double.parseDouble(innStreng2);
        double tall3 = Double.parseDouble(innStreng3);
        double sum = tall1+tall2+tall3;

        System.out.println("Summen av de tre desimaltallene ble "+sum);
    }
}
