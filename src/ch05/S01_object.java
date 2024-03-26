package ch05;


class Calculator {  // 한 파일에 여러개의 클래스 만들기 가능 (이름은 다르게 하기)
    int result = 0;
    int add(int num) {  // 메소드 (add)
        result += num;  // 변수 (result)
        return result;
    }
} // calculator 타입 선언


public class S01_object {
    public static void main(String[] args) {

        Calculator cal1 = new Calculator();  // 선언. 실제 객체 생성해줌
        // 자바 특징 : 이렇게 객체를 만들어서 사용함

        System.out.println(cal1.add(3)); // 3이 return 됨.
        System.out.println(cal1.add(4)); // 7 (누적됨)


        Calculator cal2 = new Calculator();  // cal1 과는 서로 다른 객체 (이름이 달라서ㅋ)

        System.out.println(cal1.add(3)); // 3
        System.out.println(cal1.add(7)); // 10

    }
}
