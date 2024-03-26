package ch03_6;

public class S_01_sequence {
    public static void main(String[] args) {
        String[] weeks = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        // 배열 길이를 만들어놓았음 그래서 그대로 넣어줌 .. (이미 정해져있음)

        System.out.println(weeks[3]);  // 배열의 인덱스로 해당 값을 가져옴
        // 배열의 인덱스 번호는 0부터 시작함.

        for(int i = 0; i < weeks.length; i++) {
            // 배열 길이 : 배열이름.length
            System.out.println(weeks[i]);
        }

       // 배열의 흔한 오류 (배열의 길이를 잘못 판단)
//        System.out.println(weeks[7]);  // 에러 생김
        System.out.println(weeks[weeks.length-1]); // sun ?

        // 정수 배열
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers.length);  // 5

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
