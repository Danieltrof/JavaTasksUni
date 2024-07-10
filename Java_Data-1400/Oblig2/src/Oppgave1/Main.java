package Oppgave1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        /*Liste over studenter som leverer inn oppgavene
            Danils Trofimovs s374922
            Hashim Ul Hassan s353670
            Mert Tunahan Altunbas s376867
         */

        Scanner sc = new Scanner(System.in);
        int tall1=0, tall2=0;
        while (!(tall1 < tall2)){
            System.out.println("Bestem nedre grense");
            tall1 = sc.nextInt();
            System.out.println("Bestem øvre grense");
            tall2 = sc.nextInt();

            if (tall1 >= tall2){
                System.out.println("\nNedre grense kan ikke være større eller lik øvre grense.\n");
            }
        }
        sc.close();
        sumMellomTallene(tall1,tall2);
    }

    static void sumMellomTallene(int nedreGrense, int øvreGrense){
        int sum = 0, count = 0;

        for (int i = nedreGrense; i < øvreGrense+1; i++){
            if (count % 10 == 0) System.out.print("\n");

            System.out.print(i + " + ");
            sum += i;
            count++;
        }
        System.out.print("\b\b= " + sum);
    }
}