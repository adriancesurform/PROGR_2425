public class kata1 {
    public static void main(String[] args) {

        //---------------- SUM OF ARRAYS SINGLES -----------------

        class Solution {
            public static int repeats(int[] array) {
                // Inicializamos la variable que almacenará
                // la suma de los números que solo aparecen una vez.
                int sum = 0;

                // Recorremos cada elemento de la array.
                for (int i = 0; i < array.length; i++) {
                    int count = 0;
                    // Contamos cuantas veces aparece el número.
                    for (int j = 0; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            count++;
                        }
                    }
                    if (count == 1) {
                        sum += array[i];
                    }
                }

                return sum;
            }
        }
    }
}
