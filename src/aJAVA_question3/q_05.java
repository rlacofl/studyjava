package aJAVA_question3;

public class q_05 {
    // 정수 n을 만들기 위한 정수 3개의 곱 A,B,C 출력
    // printCombos() 메서드 완성

    public static void main(String[] args) {

        printCombos(10);
    }

    public static void printCombos(int n) {
        int count = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {

                    if (n == i * j * k) {
                        System.out.printf("%d = %d x %d x %d\n", n,i,j,k);
                        count++;
                    }
                }
            }
        }
        System.out.println("=============================");
        System.out.printf("경우의 수 : %d\n", count);
    }
}
