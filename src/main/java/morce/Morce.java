package morce;

import java.util.HashMap;
import java.util.Map;

public class Morce {

    public static String morceCodificar(String texto) {
        int tamanhoT = texto.length();
        String morse = "   ";
        String[] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," "};
        String[] cMorse = {".- ", "-... ", "-.-. ", "-.. ", ". ", "..-.", "--. ", ".... ", ".. ", ".--- ", "-.- ", ".-.. ", "-- ", "-. ", "--- ", ".--. ", "... ", "- ", "..- ", " ...- ", ".-- ", "-..- ", "-.-- ", "--..", " "};
        Map<String,String> codemap = new HashMap<String,String>();

        //Arrumar error
        for (int i = 0; i < tamanhoT; i++) {
            if (texto.charAt(i) >= 97 && texto.charAt(i) <= 122) {
                codemap.put(letras[i],cMorse[i]);
            }
        }
        return morse;
    }

    public static String morceDecodificar(String morse) {
        int tamanhoT = morse.length();
        StringBuilder morseCifrado = new StringBuilder("   ");

        for (int i = 0; i < tamanhoT; i++)
            if (morse.charAt(i) >= 97 && morse.charAt(i) <= 122) {
                Character.toLowerCase(morse.charAt(i));
            }
        return morseCifrado.toString();
    }

}
