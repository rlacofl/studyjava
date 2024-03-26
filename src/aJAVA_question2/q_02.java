package aJAVA_question2;

public class q_02 {
    // 칼로리 소모량은 ?
    // 한 걸음 : 0.02 하루 5000 걸음


    static class Walking {
        public static void main(String[] args) {
            double result = calculate(5000);

            System.out.printf("소모 칼로리 : " + result + "kcal");
        }

        public static double calculate(int walk) {
            return 0.02 * walk;
        }
    }
}