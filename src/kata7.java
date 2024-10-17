public class kata7 {
    public static void main(String[] args) {

        // -------- YOU'RE SQUARE! ---------

        class Square {
            public static boolean isSquare(int n) {
                if (n < 0) {
                    return false;
                }

                // Calcular la raíz cuadrada del número
                int sqrt = (int) Math.sqrt(n);
                // Verificar si el cuadrado de la raíz es igual al número original
                return sqrt * sqrt == n;
            }
        }
    }
}
