package aJAVA_question3;

public class q_06 {

    // 팩토리얼 / printFactorial() 메소드 출력 / 출력 예 : 4! = 4 x 3 x 2 x 1 = 24

    public static void main(String[] args) {

        int num = 4;
        printFactorial(num); // 결과 출력

    }

    public static void printFactorial(int n) {
        int result = 1;  // 왜지 ??

        System.out.printf("%d! = ", n);  // 줄바꿈 안 하고 바로 뒤에 식 쓰기 위해서 !
        for (int i = n; i > 0; i--) {
            System.out.printf("%d", i);
            result *= i;

            if (i != 1) {
                System.out.printf(" x ");
            }
        }
        System.out.printf(" = %d", result);
    }

}
