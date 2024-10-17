public class kata10 {
    public static void main(String[] args) {

        // ------ REGEXP BASICS - IS IT A DIGIT? ---------

        class StringUtils {

            public static boolean isDigit(String s) {
                // Verificar si la cadena no es nula y tiene una longitud de 1
                if (s == null || s.length() != 1) {
                    return false;
                }

                // Verificar si el único carácter en la cadena es un dígito
                char ch = s.charAt(0);
                return Character.isDigit(ch);
            }
        }
    }
}
