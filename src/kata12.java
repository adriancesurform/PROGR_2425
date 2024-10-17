public class kata12 {
    public static void main(String[] args) {

        // ------ REGEX VALIDATE PIN CODE ---------

        class Solution {

            public static boolean validatePin(String pin) {
                return pin.matches("(^\\d{4}$)|(^\\d{6}$)");
            }

        }
    }
}
