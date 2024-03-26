package ch04;

public class S07_for {
    public static void main(String[] args) {

        // 기본 구조
        String[] numbers = {"one", "two", "three"};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        // for 문 예시
        int[] marks = {90, 25, 67, 45, 80};  // [] 배열 박스 ?
        for (int i = 0; i < marks.length; i++) {

            if (marks[i] < 60) {
                System.out.println((i + 1) + "번 학생 ㅊㅋ 합격");
            } else {
                System.out.println((i + 1) + "번 학생 불합격");
            }
        }


        // continue (for문으로 돌아가기)
        int[] marks2 = {90, 25, 67, 45, 80};  // [] 배열 박스 ?
        for (int i = 0; i < marks2.length; i++) {
            if (marks2[i] < 60) {
                continue;  // 조건문으로 돌아감
            }
            System.out.println((i + 1) + "번 학생 ㅊㅋ 합격");
        }
    }
}
