package ch04;

public class S08_doublefor {
    public static void main(String[] args) {

        // for 문을 2번 사용하여 구구단 출력 ! ! ! ! ! ! ! ! ! !
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
//                System.out.print(i * j + " ");
                System.out.printf(("%d x %d = %d "), i, j, i*j);
            }
            System.out.println("");  // 줄을 바꾸어 출력하는 역할
        }

    }
}
