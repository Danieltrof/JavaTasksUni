package Oppgave4;

import javax.swing.*;

public class Main {
    public static void main(String [] args){
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn et desimaltall");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn et desimaltall til");
        String innStreng3 = JOptionPane.showInputDialog("Skriv inn enda et desimaltall");

        double tall1,tall2,tall3;

        try{
            tall1 = Double.parseDouble(innStreng1);
            tall2 = Double.parseDouble(innStreng2);
            tall3 = Double.parseDouble(innStreng3);
        }
        catch (Exception e){
            tall1=0;
            tall2=0;
            tall3=0;
            System.out.println(e);
        }
        double sum = tall1+tall2+tall3;
        double gjennomsnitt = sum/3;
        String ut = "Summen av de tre desimaltallene ble "+sum+"\n"+"Gjennomsnittet er "+gjennomsnitt;

        System.out.println(ut);
        JOptionPane.showMessageDialog(null,ut);
    }
}