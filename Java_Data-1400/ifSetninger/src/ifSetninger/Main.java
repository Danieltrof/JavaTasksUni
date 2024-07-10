package ifSetninger;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn tall1");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn tall2");
        int tall1 = Integer.parseInt(innStreng1);
        int tall2 = Integer.parseInt(innStreng2);
        if (tall1 == tall2) {
            JOptionPane.showMessageDialog(null, "Tall1 er lik tall2");
        }
        if (tall1 != tall2) {
            JOptionPane.showMessageDialog(null, "Tall1 er ikke lik tall2");
        }
        if (tall1 > tall2) {
            JOptionPane.showMessageDialog(null, "Tall1 er større enn tall2");
        }
        if (tall1 <= tall2) {
            JOptionPane.showMessageDialog(null, "Tall1 er mindre eller lik tall2");
        }
        if (tall1 >= tall2) {
            JOptionPane.showMessageDialog(null, "Tall1 er større eller lik tall2");
        }
    }
}