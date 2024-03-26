package ch03_10;

public class S_01_enum {
        enum coffeeType {
            // enum = 서로 연관있는 여러 개의 상수 집합 정의에 사용
            AMERICANO,
            ICE_AMERICANO,
            CAFE_LATTE
        };

    public static void main(String[] args) {
        System.out.println(coffeeType.AMERICANO);
        System.out.println(coffeeType.ICE_AMERICANO);
        System.out.println(coffeeType.CAFE_LATTE);
    }
}
