package execute;

import javax.swing.*;

import static Cesar.Cesar.*;
import static morce.Morce.*;

public class execute {
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
                    String texto = JOptionPane.showInputDialog("Digite a menssagem a ser criptografado:");
                    int chave = Integer.parseInt(JOptionPane.showInputDialog("Digite a chave de deslocamento: "));
                    if (chave <= 25) {
                        String textoCriptografado = cesarCriptografar(chave, texto);
                        JOptionPane.showMessageDialog(null, textoCriptografado);
                        System.out.println(textoCriptografado);
                    }
                } else if (option == 2) {
                    String texto = JOptionPane.showInputDialog("Digite a menssagem a ser Descriptografar:");
                    int chave = Integer.parseInt(JOptionPane.showInputDialog("Digite a chave de deslocamento: "));
                    if (chave <= 25) {
                        String textoDescriptografado = cesarDecriptografia(chave, texto);
                        JOptionPane.showMessageDialog(null, textoDescriptografado);
                        System.out.println(textoDescriptografado);
                    }
                }
            } else if (tipo == 2) {
                String texto = JOptionPane.showInputDialog("Digite o codigo a ser criptografado:");
                String textoCript = morceCodificar(texto);
                JOptionPane.showMessageDialog(null, textoCript);
            }


}
}
