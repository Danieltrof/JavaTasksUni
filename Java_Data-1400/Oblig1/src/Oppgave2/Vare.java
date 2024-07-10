package Oppgave2;

public class Vare {
    private String navn;
    private int antall;
    private double pris;

    //Konstruktør med alle attributter
    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    //get / set metoder
    //antall og pris må være større enn null

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) throws Exception {
        if (antall > 0) this.antall = antall;
        else throw new Exception("Antall må være større enn 0.");
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) throws Exception {
        if (pris > 0) this.pris = pris;
        else throw new Exception("Pris må være større enn 0.");
    }

    // metode for å beregne totalpris (pris * antall)
    public double totalPris(){
        return getPris()*getAntall();
    }
}
