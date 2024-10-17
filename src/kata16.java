public class kata16 {
    public static void main(String[] args) {

        // ------- MULTIPLES OF 3 OR 5 ----------

        class Solution {

            public int solution(int number) {
                int sum=0;

                for (int i=0; i < number; i++){
                    if (i%3==0 || i%5==0){sum+=i;}
                }
                return sum;
            }
        }
    }
}
