package ch05_7;

interface Predator {
    // interface 선언 (class 대신 interface 사용 .. 왜? ??)
    String getFood(); // 추상메서드 : 메서드 코드가 없음 . (return, 입력만 있음)

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
}

class Animal {
    String name;
    void setName(String name) { // 메서드 (입력변수 - 색깔 같은거끼리 같은 거)
        this.name = name;
    }
}
// 인터페이스 메서드, 추상 클래스,

// interface는 class에서 implements로 구현됨
// 상속이랑 비슷한데 키워드가 다름.
class Tiger extends Animal implements Predator { // 상속
    // 인터페이스 구현시 추상클래스를 무조건 구현하기
    @Override
    public String getFood() {
        return "apple";
    }
}

class Lion extends Animal implements Predator {
    @Override
    public String getFood() {
        return "banana";
    }
}

public class Interface {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        System.out.println(tiger.getFood());
        System.out.println(lion.getFood());

        tiger.printFood();
        lion.printFood();   // 디폴트 메서드 어쩌고 . . .
    }
}
