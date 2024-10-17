public class kata4 {
    public static void main(String[] args) {

        // ------------ FIND THE PERFECT SQUARE! --------------
        class NumberFun {
            public static long findNextSquare(long sq) {
                // Calcular la raíz cuadrada del número
                long resNum = (long) Math.sqrt(sq);
                // Verificar si el número es un cuadrado perfecto
                if (resNum * resNum == sq) {
                    // Devolver el siguiente cuadrado perfecto
                    return (resNum + 1) * (resNum + 1);
                } else {
                    return -1;
                }
            }
        }
    }
}
