package Konstruktør;

class Bil {
    public String farge;

    public Bil(String farge){
        this.farge = farge;
    }

    public void visFarge(){
        System.out.println("Fargen til bilen er : "+farge);
    }
}


public class Main {
    public static void main(String[] args){
        Bil volvo = new Bil("Rød");
        volvo.visFarge();
    }
}