import java.util.Arrays;
public class kata15 {
    public static void main(String[] args) {

        // ------ LARGESTS ELEMENTS ---------

        class Solution {

            public static int[] largest(int n, int[] arr) {

                if (n == 0) {
                    return new int[]{};
                }

                Arrays.sort(arr);
                int[] result = new int[n];
                for (int i = 0; i < n; i++) {
                    result[i] = arr[arr.length - 1 - i];
                }

                Arrays.sort(result);
                return result;
            }
        }
    }
}
