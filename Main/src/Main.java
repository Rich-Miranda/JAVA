import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validador tes = new Validador();
        int resp = 0;

        do {
            String quest = JOptionPane.showInputDialog(null, "\n1- Validar Inteiro" + "\n2- Validadr Real" + "\n3- Validar ambos" + "\n4-Sair");
            resp = Integer.parseInt(quest);

            switch (resp) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Foi selecionado validar inteiro");
                    try {
                        String tes1 = JOptionPane.showInputDialog(null, "Informe o valor");
                        int numeberInt =  Integer.parseInt(tes1);
                        tes.ValidInt(numeberInt);
                        JOptionPane.showMessageDialog(null, "Esse valor é inteiro: " + numeberInt);
                    } catch (NumberFormatException err) {
                        throw new NumberFormatException("Esse valor não é inteiro ");
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Foi selecionado validar real");
                    try {

                        String teste = (JOptionPane.showInputDialog(null, "Informe o valor double"));
                        double numeberDouble = Double.parseDouble(teste);
                        tes.ValidDouble(numeberDouble);
                        JOptionPane.showMessageDialog(null, "Esse valor é double: " + numeberDouble);
                    } catch (NumberFormatException err) {
                        throw new NumberFormatException("Esse valor não é double ");

                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Foi selecionado validar ambos");
                    try {
                        String tes1 = JOptionPane.showInputDialog(null, "Informe o valor");
                        int numeberInt = Integer.parseInt(tes1);
                        tes.ValidInt(numeberInt);
                        JOptionPane.showMessageDialog(null, "Esse valor é inteiro: " + numeberInt);
                    } catch (NumberFormatException err) {
                        throw new NumberFormatException("Esse valor não é inteiro ");
                    }


                    try {

                        String teste = (JOptionPane.showInputDialog(null, "Informe o valor double"));
                        double numeberDouble = Double.parseDouble(teste);
                        tes.ValidDouble(numeberDouble);
                        JOptionPane.showMessageDialog(null, "Esse valor é double: " + numeberDouble);
                    } catch (NumberFormatException err) {
                        throw new NumberFormatException("Esse valor não é double ");

                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Foi selecionado sair");
                    break;
            }
        } while (resp != 4);

        System.out.println("flwwww! ");

    }

}