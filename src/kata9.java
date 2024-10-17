public class kata9 {
    public static void main(String[] args) {

        // ---------- IS A NUMBER PRIME ------------

        class Prime {
            public static boolean isPrime(int number) {
                if(number < 2)
                    return false;
                for (int i=2; i<=Math.sqrt(number); i++){
                    if(number % i == 0)
                        return false;
                }
                return true;
            }
        }
    }
}
