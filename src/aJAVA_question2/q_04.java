package aJAVA_question2;

public class q_04 {

    static class Gamble {
        public static void main(String[] args) {
            double dollar = dice() + dice() + dice();
            double won = exchange(dollar);

            System.out.printf("획득 금액 : $%.2f(%.0f원)", dollar, won);
        }

        // 1~6 사이의 정수 값 반환
        public static int dice() {
            // Math.random() : double 타입의 값을 반환하는 메소드
            // double 값은 0.00.. ~ 0.99.. 실수 값을 반환함
            // Math.random() * 6 > 0.00.. ~ 5.99.. 사이의 값 반환
            // double > int 로 반환 : (int) > casting (강제로 형을 바꾸는 방법)
            // (int) (Math.random() * 6)  =>  0 ~ 5 사이의 정수 반환
            // (0 ~ 5) +1 하면 1 ~ 6
        return (int) (Math.random() * 5) + 1;  // 1~6
        }


        // 입력한 달러를 환전환 결과를 반환
        public static double exchange(double dollar) {
            return dollar * 1082.25108;
        }
    }
}
