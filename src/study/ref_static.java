package study;

public class ref_static {

    // 객체를 가리키는 변수 : 레퍼런스
    // 공유의 키워드 : 스테틱

    // 코드를 많이 분석해보기 > 코드를 많이 작성해보기 > 스스로 작성 가능할 때까지


    // 레퍼런스 : 자바 타입의 큰 범주 (카테고리)
    // 변수 타입은
    // (레퍼런스형 : String, Hero .. / 기본형 : int, double, boolean ..

    // 레퍼런스형 (reference type) : 클래스 타입 / 사용자 정의형 타입 > 객체를 변수에 연결하기 위헤 사용하는 타입

    // Marine marine = new Marine("레이너", 80);

    // Marine(맨 앞) = 레퍼런스 타입, 클래스 타입
    // marine = 레퍼런스 변수

    // 레퍼런스 변수는 기본형과 무엇이 다를까 ?
    // ㄴ> 레퍼런스 변수 : 객체를 간접적으로 가리키는 형태 / 기본형(기본 변수) : 객체가 아닌 값을 직접 가짐

    // Marine marine = new Marine("레이너", 80);   > marine = 레퍼런스 변수  / 대문자 시작(Marine)
    // int score = 88;  > score = 기본 변수  / 소문자 시작 (int)


    // static : "공유"의 개념이 담김 키워드 > 필드와 메서드에 적용될 수 있음
    // 필드에 적용 = 클래스 변수
    // 메서드에 적용 = 클래스 메서드

    // "인스턴스" 라는 말이 들어가면 => "객체"를 만들어서 사용하는 것

    // 클래스 변수(static fields) : 객체 밖에 존재함
    // 인스턴스 변수(non-static fields) : 객체 내부에 존재함


    // 예를 들어 학생 정보가 들어올 때마다 카운트 된다고 칠 때, 카운드의 수는 클래스 변수, 학생들 개개인의 정보는 인스턴스 변수.
//    class Student {
//        static in count = 0;
//
//        int id;
//        String name;
//    }



    // 클래스 메서드(static methods) : 클래스가 동작시키는 메서드 -> 간편 기능 구현에 유용 (Math.random())
    // 인스턴스 메서드(non-static methods) : 주 객체가 수행(동작)하는 메서드 -> 특정 객체의 동작 구현 시 유리 (ma.stimpack())


}
