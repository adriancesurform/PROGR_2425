public class kata8 {
    public static void main(String[] args) {

        // --------- ODD OR EVEN -----------

        class Codewars {
            public static String oddOrEven (int[] array) {
                // Si la matriz está vacía, la tratamos como si fuera [0]
                if (array.length == 0) {
                    return "even";
                }

                // Sumar todos los elementos del array
                int sum = 0;
                for (int num : array) {
                    sum += num;
                }

                // Verificar si la suma es par o impar
                return sum % 2 == 0 ? "even" : "odd";
            }
        }
    }
}
