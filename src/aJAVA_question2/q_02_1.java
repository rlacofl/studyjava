package aJAVA_question2;

public class q_02_1 {


    static class Pork {
        public static void main(String[] args) {

        int n = 3;
        double result = calorieCalculator(n);

            System.out.printf("삼겹살 %d인분: %.2f kcal", n, result);
        }

        public static double calorieCalculator(int n) {
            int g = n * 180;
            double k = g * 5.179;
            return k;
            }

        }
    }
