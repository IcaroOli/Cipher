package Cesar;


public class Cesar {

    /**
     * @param chave numero do deslocamento
     * @param texto string a ser cripografado
     * @return o texto criptografado
     */
    public static String cesarCriptografar(int chave, String texto) {
        StringBuilder textoCifrado = new StringBuilder();
        int tamanhoTexto = texto.length();

        for (int i = 0; i < tamanhoTexto; i++) {
            int charCifrado = ((int) texto.charAt(i)) + chave;

            //Letras minusculas na tabela ASII
            if (texto.charAt(i) >= 97 && texto.charAt(i) <= 122) {
                charCifrado = (char) ((texto.charAt(i) - 97 + chave) % 26 + 97);
                //Letras maiuscula na tabela ASII
            } else if (texto.charAt(i) >= 65 && texto.charAt(i) <= 90)
                charCifrado = (char) ((texto.charAt(i) - 65 + chave) % 26 + 65);


            textoCifrado.append((char) charCifrado);
        }
        return textoCifrado.toString();
    }

    public static String cesarDecriptografia(int chave, String textoCifrado) {
        StringBuilder texto = new StringBuilder();
        int tamanhoTexto = textoCifrado.length();

        for (int c = 0; c < tamanhoTexto; c++) {
            int charDecifrado = (int) textoCifrado.charAt(c) - chave;

            if (textoCifrado.charAt(c) >= 97 && textoCifrado.charAt(c) <= 122) {
                charDecifrado = (char) ((textoCifrado.charAt(c) - 97 + chave) % 26 + 97);
            } else if (textoCifrado.charAt(c) >= 65 && textoCifrado.charAt(c) <= 90)
                charDecifrado = (char) ((textoCifrado.charAt(c) - 65 + chave) % 26 + 97);
            texto.append((char) charDecifrado);
        }

        return texto.toString();
    }

}
