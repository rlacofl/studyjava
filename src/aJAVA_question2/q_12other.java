package aJAVA_question2;

public class q_12other {

    static class JavaCafe {
        public static void main(String[] args) {

            printPay(10.00, 40);
            printPay(10.00, 50);
            printPay(7.50, 38);
            printPay(8.50, 66);
        }

        public static void printPay(double basePay, int hours) {
            double pay = basePay * hours;
            double overTimepay = (hours - 40) * basePay * 0.5;

            // 근무시간 초과 / 최저 시급 작음 / 초과 근무*1.5 / 일반
            if (hours > 60) {
                System.out.println("초과 근무시간 에러!");
            } else if (basePay < 8) {
                System.out.println("최저 시급 에러!");
            } else if (hours > 40) {
                pay += overTimepay;
                System.out.printf("$%.2f\n", pay);
            } else {
                System.out.printf("$%.2f\n", pay);
            }
        }
    }



}
