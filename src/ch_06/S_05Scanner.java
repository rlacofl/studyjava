package ch_06;

import java.util.Scanner;

public class S_05Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(scanner.next());    // 토근 읽기 ?
        System.out.println(scanner.nextInt());  // 정수 읽기
        System.out.println(scanner.nextLine());  // 문자열 읽기
        System.out.println(scanner.nextFloat());  // 실수 읽기
        // System.out.println 메서드 : 콘솔에 문자열을 출력할 때나 디버깅 할 때 많이 사용

        scanner.close();  // 사용 후 닫기 (메모리 절약)
    }
}
