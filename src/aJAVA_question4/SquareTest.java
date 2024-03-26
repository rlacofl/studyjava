package aJAVA_question4;

public class SquareTest {

    public static void main(String[] args) {
        // 객체 생성
//        int a  = 10;  기본 타입은 변수가 값을 가짐
        Square s = new Square();  // s는 주소 /
        // 클래스 타입은 주소를 가리킴. > new Square가 있는 곳을 가리킴.
//        System.out.println(s);  이상한거나옴 ㅋㅋ
//        s.length 이렇게 하면 밑에 있는 길이가 실행
//        s.area() 이렇게 하면 메서드가 생성됨

        //2. 필드 초기화 (값 변경)
        s.length = 4;
        //3. 결과 출력
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이 : %d", s.length, s.area());

    }
}

// 정사각형 클래스
class Square {
    int length; // 변 길이
    // 메서드로 넓이 구하기 (넓이 반환 메서드)
    int area() {
        return length * length;
    }
}