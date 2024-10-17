public class kata2 {
    public static void main(String[] args) {

        //--------------- DISEMVOWELL TROLLS -----------------

        class Troll {
            public static String disemvowel(String str) {
                // Crear un StringBuilder para construir la nueva cadena sin vocales.
                StringBuilder result = new StringBuilder();

                // Recorrer cada carácter de la cadena original.
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    // Comprobar si el carácter no es una vocal.
                    if ("aeiouAEIOU".indexOf(c) == -1) {
                        // Si no es una vocal, añadirlo al resultado.
                        result.append(c);
                    }
                }
                // Convertir el StringBuilder a String y devolverlo.
                return result.toString();
            }
        }
    }
}
