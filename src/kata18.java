public class kata18 {
    public static void main(String[] args) {

        // ------- CREATE PHONE NUMBER ---------

        class Kata {
            public static String createPhoneNumber(int[] numbers) {
                StringBuilder phoneNumber = new StringBuilder();
                phoneNumber.append("(");
                for(int i = 0; i < 3; i++){
                    phoneNumber.append(numbers[i]);
                }
                phoneNumber.append(") ");
                for(int i = 3; i < 6; i++){
                    phoneNumber.append(numbers[i]);
                }
                phoneNumber.append("-");
                for(int i = 6; i < 10; i++){
                    phoneNumber.append(numbers[i]);
                }
                return phoneNumber.toString();
            }
        }

    }
}
