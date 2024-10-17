public class kata17 {
    public static void main(String[] args) {

        // ---------- BREAK CAMEL CASE ----------

        class Solution {
            public static String camelCase(String input) {
                StringBuilder result = new StringBuilder();

                char[] chars = input.toCharArray();

                for (int i = 0; i < chars.length; i++) {
                    char c = chars[i];
                    if (Character.isUpperCase(c) && result.length() > 0) {
                        result.append(' ');
                    }
                    result.append(c);
                }
                return result.toString();
            }
        }
    }
}
