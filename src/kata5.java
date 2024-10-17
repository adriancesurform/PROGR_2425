public class kata5 {
    public static void main(String[] args) {

        // -------------- GET THE MIDDLE CHARACTER ------------------

        class Kata {
            public static String getMiddle(String word) {
                int length = word.length();
                int middle = length / 2;

                if (length % 2 == 0) {
                    // Si la longitud es par, devolver los dos caracteres del medio
                    return word.substring(middle - 1, middle + 1);
                } else {
                    // Si la longitud es impar, devolver el carácter del medio
                    return word.substring(middle, middle + 1);
                }
            }
        }

    }
}
