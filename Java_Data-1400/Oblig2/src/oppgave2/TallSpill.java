package oppgave2;

import javax.swing.*;

public class TallSpill {
    int tall, gjetning;

    public int nyttTall(){
        return (int) (Math.random()*201);
    }

    public void visMelding(String melding){
        gjetning = Integer.parseInt(JOptionPane.showInputDialog(melding));
    }

    private void forLite(int tall){
        gjetning = Integer.parseInt(JOptionPane.showInputDialog(tall + " er for lite. Prøv igjen."));
    }

    private void forStort(int tall){
        gjetning = Integer.parseInt(JOptionPane.showInputDialog(tall + " er for stort. Prøv igjen."));
    }

    public void avsluttRunde(int antall, int gjetning){
        JOptionPane.showInputDialog(gjetning + " er riktig! Du gjettet riktig på " + antall + " forsøk.");
    }

    public void kjørSpill(){
        tall = nyttTall();
        visMelding("Jeg tenker på et tall mellom 0 og 200. \nPrøv å gjette tallet.");
        int forsøk = 1;

        while (gjetning != tall){
            if (gjetning < tall){
                forLite(gjetning);
            } else {
                forStort(gjetning);
            }
            forsøk++;
        }
        avsluttRunde(forsøk,gjetning);
    }
}
