public class kata3 {
    public static void main(String[] args) {

        // ------------ DESCENDING ORDER --------------

        class DescendingOrder {
            public static int sortDesc(final int num) {
                // Convertir el número a una cadena
                String numStr = Integer.toString(num);
                // Convertir la cadena a un array de caracteres
                char[] digits = numStr.toCharArray();

                // Ordenar los caracteres en orden descendente
                for (int i = 0; i < digits.length - 1; i++) {
                    for (int j = i + 1; j < digits.length; j++) {
                        if (digits[i] < digits[j]) {
                            // Intercambiar los caracteres
                            char temp = digits[i];
                            digits[i] = digits[j];
                            digits[j] = temp;
                        }
                    }
                }

                // Convertir el array de caracteres de nuevo a una cadena
                String sortedNumStr = new String(digits);
                // Convertir la cadena ordenada de nuevo a un número entero
                return Integer.parseInt(sortedNumStr);
            }
        }
    }
}
