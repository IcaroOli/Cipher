package Cesar;

import javax.swing.*;
import static Cesar.Cesar.cesarCriptografar;
import static Cesar.Cesar.cesarDecriptografia;

public class cExecute {
    public static String executeCript() {
        String texto = JOptionPane.showInputDialog("Digite a menssagem a ser criptografado:");
        int chave = Integer.parseInt(JOptionPane.showInputDialog("Digite a chave de deslocamento: "));
        if (chave <= 25) {
            String textoCriptografado = cesarCriptografar(chave, texto);
            JOptionPane.showMessageDialog(null, textoCriptografado);
        }
        return texto;
    }

    public static String executeDiscpt() {
        String texto = JOptionPane.showInputDialog("Digite a menssagem a ser Descriptografar:");
        int chave = Integer.parseInt(JOptionPane.showInputDialog("Digite a chave de deslocamento: "));
        if (chave <= 25) {
            String textoDescriptografado = cesarDecriptografia(chave, texto);
            JOptionPane.showMessageDialog(null, textoDescriptografado);
        }
        return texto;
    }

}

