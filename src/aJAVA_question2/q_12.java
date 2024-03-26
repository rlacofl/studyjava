package aJAVA_question2;

public class q_12 {
    static class JavaCafe {
        public static void main(String[] args) {

            printPay(10.00, 40);
            printPay(10.00, 50);
            printPay(7.50, 38);
            printPay(8.50, 66);

        }

        // 시급, 일한 시간 입력 받아서 주급을 출력
        public static void printPay (double basePay, int hours) {
            // 최저시급 체크
            if (basePay < 8.00) {
                System.out.println("최저시급 에러!");
                return;
            }
            // 초과 근무시간 체크
            if (hours > 60) {
                System.out.println("초과 근무시간 에러!");
                return;
            }

            double pay = 0;

            // 초과 급여 계산
            if (hours > 40) {
                int extraHours = hours - 40; // 초과 근무 시간
                pay += basePay * extraHours * 1.5; // (최저시급*초과근무시간*1.5)
                hours -= extraHours;  // 시간 = 시간 - 초과근무시간 이건왜잇는거지 ?
            }

            // 기본 급여 계산
            pay += basePay * hours;  // 급여 = 최저시급 * 시간


                System.out.printf("$%.2f\n", pay);
            }

        }

    }


