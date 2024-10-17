public class kata6 {
    public static void main(String[] args) {

        // ------- SQUARE EVERY DIGIT ----------

        class SquareDigit {

            public int squareDigits(int n) {
                // Convertir el número a una cadena
                String numStr = Integer.toString(n);
                StringBuilder result = new StringBuilder();

                // Recorrer cada carácter de la cadena usando un bucle for tradicional
                for (int i = 0; i < numStr.length(); i++) {
                    // Convertir el carácter a un número, elevarlo al cuadrado y añadirlo al resultado
                    int digit = Character.getNumericValue(numStr.charAt(i));
                    result.append(digit * digit);
                }

                // Convertir el resultado a un número entero y devolverlo
                return Integer.parseInt(result.toString());
            }
        }
    }
}
