package execute;

import javax.swing.*;

import static Cesar.cExecute.executeCript;
import static Cesar.cExecute.executeDiscpt;
import static morce.Morce.morceCodificar;

public class Execute {
    public static void main(String[] args) throws RuntimeException {

        String opcao = """
                Digite o tipo de criptografia\s
                (1)-Cifra de Cesar\s
                (2)-Em obras""";
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(opcao));

        if (tipo == 1) {
            String t = """
                    Gostaria de Criptografar ou Descriptografar\s
                    (1)- Criptografar\s
                    (2)- Descriptografar""";
            int option = Integer.parseInt(JOptionPane.showInputDialog(t));
            if (option == 1) {
                String executeCriptografia = executeCript();
            } else if (option == 2) {
                String executeDescriptografia = executeDiscpt();
            }
        } else if (tipo == 2) {
            String texto = JOptionPane.showInputDialog("Digite o codigo a ser criptografado:").toLowerCase();
            String textoCript = morceCodificar(texto);
            JOptionPane.showMessageDialog(null, textoCript);
        }


    }
}
