package ch03_4;

public class S_06_formatting {
    public static void main(String[] args) {

    // formatting : 문자열 안에 어떤 값을 삽입하는 방법

        // 숫자 대입하기
        // 방법 1
        String s = String.format("I eat %d apples.", 3);
        System.out.println(s);

        // 방법 2
        System.out.println(String.format("I eat %d apples.", 3));


        // 문자열 대입하기
        System.out.println(String.format("I eat %s apples.", "five"));


        // 숫자값을 나타내는 변수 대입
        int number = 3;
        System.out.println(String.format("I eat %d apples.", number));

        
        // 값 2개 이상 넣기
        int numb = 10;         // 변수 1
        String day = "three";  // 변수 2
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", numb, day));
    }
}
