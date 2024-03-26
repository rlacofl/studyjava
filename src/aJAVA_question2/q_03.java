package aJAVA_question2;

public class q_03 {
    // 연비 : 이동거리 / 사용량

    static class Gasoline {
        public static void main(String[] args) {
            double gasoline = 8.86;
            double distance = 182.736;
            double efficiency = calcEffiency(gasoline, distance);

            System.out.printf("연비: %.2f km/L,", efficiency);
        }

        public static double calcEffiency(double fuel, double distance) {
            return distance / fuel;
        }
    }
}
