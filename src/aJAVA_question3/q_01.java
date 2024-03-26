package aJAVA_question3;

public class q_01 {

    // 5개월 후의 몸무게 출력 / weight() 메서드 생성 / 입력 예 : 73.55kg
    public static void main(String[] args) {
        double start = 72.4;
        int month = 5;
//        double less = 0.231;

        double result = weight(start, month);

        System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", month, result);
    }

    public static double weight(double currentW, int months) {
    double expect = currentW;
    for (int i = 0; i < months; i++) {
        expect += 0.231;
    }
    return expect;
    }
}
