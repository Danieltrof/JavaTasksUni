package Oppgave1;

import java.text.DecimalFormat;

public class Sirkel {
    // Statisk metode som beregner og returnerer sirkelens diameter.
    public static double beregnDiameter(double radius){
        double diameter = radius * 2;
        return diameter;
    }

    // Statisk metode som beregner og returnerer sirkelens omkrets.
    public static double beregnOmkrets(double radius){
        double omkrets = 2 * Math.PI * radius;
        return omkrets;
    }

    //Statisk metode som beregner og returnerer sirkelens areal.
    public static double beregnAreal(double radius){
        double areal = Math.PI * Math.pow(radius, 2);
        return areal;
    }
}


