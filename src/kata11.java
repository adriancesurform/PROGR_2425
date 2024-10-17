public class kata11 {
    public static void main(String[] args) {

        // -------- PIZZA PAYMENTS ------------


        class PizzaPayments {
            public static double michaelPays(double cost) {
                if  (cost < 5) return Math.round(cost * 100) / 100.0;

                double kateCost = cost/3;
                if (cost > 5) {

                    if (kateCost < 10) return Math.round((cost - kateCost) * 100.0) / 100.0;
                    return Math.round((cost - 10) * 100.0) / 100.0;
                }
                return 0;
            }
        }
    }
}
