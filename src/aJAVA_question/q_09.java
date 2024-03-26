package aJAVA_question;

public class q_09 {
    public static void main(String[] args) {

        // 속력(m/s) = 거리(m) / 시간(s)
        // 시간 = 거리 / 속력
        // 거리 = 속력 * 시간
        // 1시간 = 3600sec
        // 100km = 100,000m
        // 1km = 100m = 10,000cm
        // 1m = 100cm

        double meter = 100;
        double sec = 18;

        double hour = meter / (sec * 0.01);

        System.out.printf(String.format("%.2f km/h", hour));
    }
}
