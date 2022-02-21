package morce;

public class Morce {

    public static String morceCodificar(String texto) {
        int tamanhoT = texto.length();
        String morse = "   ";

        //Arrumar error
        for (int i = 0; i < tamanhoT; i++) {
            if (texto.charAt(i) >= 97 && texto.charAt(i) <= 122) {
                switch (Character.toUpperCase(texto.charAt(i))) {
                    case 'a' -> morse += ".- ";
                    case 'b' -> morse += "-... ";
                    case 'c' -> morse += "-.-. ";
                    case 'd' -> morse += "-.. ";
                    case 'e' -> morse += ". ";
                    case 'f' -> morse += "..-. ";
                    case 'g' -> morse += "--. ";
                    case 'h' -> morse += ".... ";
                    case 'i' -> morse += ".. ";
                    case 'j' -> morse += ".--- ";
                    case 'k' -> morse += "-.- ";
                    case 'l' -> morse += ".-.. ";
                    case 'm' -> morse += "-- ";
                    case 'n' -> morse += "-. ";
                    case 'o' -> morse += "--- ";
                    case 'p' -> morse += ".--. ";
                    case 'q' -> morse += "--.- ";
                    case 'r' -> morse += ".-. ";
                    case 's' -> morse += "... ";
                    case 't' -> morse += "- ";
                    case 'u' -> morse += "..- ";
                    case 'v' -> morse += "...- ";
                    case 'w' -> morse += ".-- ";
                    case 'x' -> morse += "-..- ";
                    case 'y' -> morse += "-.-- ";
                    case 'z' -> morse += "--.. ";
                    case ' ' -> morse += "   ";
                }
            }
        }
        return morse;
    }

}