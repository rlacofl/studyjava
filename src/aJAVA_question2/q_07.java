package aJAVA_question2;

public class q_07 {

    // 삼항 연산자 : if-else 문의 변형식
    // > 조건식이 참인 경우와 거짓인 경우의 결과 값을 각각 반환함.
    // 구조 : (조건식) ? 참의 반환값 : 거짓의 반환값;

    static class Audition {

        public static void main(String[] args) {
            double tomV = 8.8;
            double tomD = 7.6;
            double kateV = 9.2;
            double kateD = 7.8;

            System.out.printf("Tom의 오디션 결과 : %s\n", result(tomV, tomD));
            System.out.printf("Kate의 오디션 결과 : %s\n", result(kateV, kateD));
        }

        public static String result(double vocal, double dance) {

            return (vocal*dance >= 70.0) ? "합격" : "불합격";
        }

    }
}
