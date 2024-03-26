package aJAVA_question3;

public class q_07 {
    // Math.pow() 메서드 사용 / writeLog() 메서드 만들기
    // int result = (int) Math.pow(2, 3) // => 8 나옴
    // 출력 예 = [1, 2, 4, 8, 16, 32, 64, 128, 256, 512]

    static class Bacteria {
        public static void main(String[] args) {
            int[] bCountLog = new int[10]; // 배열 생성

            writeLog(bCountLog);
            printLog(bCountLog);
        }

        public static void writeLog(int[] logs) { // 배열 입력하기
            for (int a = 0; a < logs.length; a++) {
//                int result = (int) Math.pow(2, a);
                logs[a] = (int) Math.pow(2, a);
                // 배열 입력할 땐 해당 메서드 입력 변수(logs)에 배열 변수 집어넣어야함 ..
            }
        }

        public static void printLog(int[] result) {
            System.out.printf("[");
            for (int i = 0; i < result.length; i++) {
                System.out.printf("%d", result[i]);

                if (i != result.length - 1); {   // 9번째 전을 뜻함
                    System.out.printf(", ");
                }
            }
            System.out.printf("]");
        }
    }

}
