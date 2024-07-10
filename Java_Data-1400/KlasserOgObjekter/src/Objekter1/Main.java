package Objekter1;

class Bil{
    public String farge;

    public void visFarge(){
        System.out.println("Fargen til bilen er "+farge);
    }
}

public class Main {
    public static void main(String[] args){
        Bil nyBil = new Bil();
        nyBil.farge = "blå";
        nyBil.visFarge();
    }
}