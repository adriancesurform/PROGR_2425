public class kata14 {
    public static void main(String[] args) {

        // --------- NAME THAT NUMBER! ----------

        class Kata {
            public static String nameThatNumber(int x) {
                // Arrays for numbers 0-19 and for tens
                String[] units = {
                        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                        "seventeen", "eighteen", "nineteen"
                };

                String[] tens = {
                        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
                };

                if (x < 20) {
                    return units[x]; // Return the word for numbers 0-19
                } else {
                    // Get the tens and units
                    int ten = x / 10; // Tens place
                    int unit = x % 10; // Units place
                    return tens[ten] + (unit != 0 ? " " + units[unit] : ""); // Return the combined word
                }
            }
        }




    }
}
