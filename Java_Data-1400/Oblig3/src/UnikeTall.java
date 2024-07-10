import java.lang.Math;
import javax.swing.JOptionPane;

public class UnikeTall{
    // Deklarasjon av array for lagring av tilfeldige heltall
    private int[] array;


    /* Konstruktør som mottar arrayets lengde som parameter og
        oppretter arrayet.  */
    public UnikeTall(int storrelse){
        array = new int[storrelse];
        fyllArray();
        GUI();
    }


    /* Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
     Tallet det letes etter skal mottas som parameter.
     Metoden skal returnere true hvis tallet finnes i arrayet.
     Hvis ikke skal metoden returnere false. */
    private boolean tallSjekk(int tall){
        for (int elem: array){
            if (tall == elem) return true;
        }
        return false;
    }


    /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
     begge grenser inkludert. Metoden skal gjøre dette på en måte
     som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
     parametre og heller ikke returnere noen verdi.
     Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
   */
    private int tilfeldigTall(int min, int max){
        return (int)(Math.random()*((max - min) + 1)) + min;
    }

    private void fyllArray(){
        for (int i = 0; i < array.length; i++){

            while (true){
                int tall = tilfeldigTall(100, 999);
                if (!tallSjekk(tall)){
                    array[i] = tall;
                    break;
                }
            }
        }
    }

    // Metode som finner og returnerer det minste tallet i arrayet.
    public int minsteTall(){
        int minste = array[0];
        for (int elem: array){
            if (elem < minste){
                minste = elem;
            }
        }
        return minste;
    }

    // Metode som finner og returnerer det største tallet i arrayet.
    public int storsteTall(){
        int storste = array[0];
        for (int elem: array){
            if (elem > storste){
                storste = elem;
            }
        }
        return storste;
    }

    /*  Metode som beregner og returnerer den gjennomstnittlige verdien
     (double-verdi) av tallene i arrayet.  */
    public double gjennomsnitt(){
        double sum = 0;
        for (double elem: array){
            sum += elem;
        }

        return sum/array.length;
    }

    /* Metode som viser tallene i arrayet i en meldngsboks.
     I tillegg skal det, i meldingsboks, skrives ut
     opplysninger om hvilket tall som er minst, hvilket som er størst, og
     hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
     skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
     Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
     per linje. */
    private void GUI(){
        JOptionPane.showMessageDialog(null, toString() +
                "\n\n Minste tall er " + minsteTall() +
                "\n Storste tall er " + storsteTall() +
                "\n Gjennomsnittsverdien er " + String.format("%.2f",gjennomsnitt()), null, 0);
    }

    public String toString(){
        String a = "";
        int teller = 0;
        for (int elem: array){
            if (teller%8 == 0) a += "\n";
            a += elem + " ";
            teller++;
        }
        return a;
    }
}