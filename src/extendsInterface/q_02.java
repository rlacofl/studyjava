package extendsInterface;

public class q_02 {
    public static void main(String[] args) {
        Car c = new Car("티코");
        Car t = new Truck("트럭", 1.5);

        System.out.println(c.toString());
        System.out.println(t.toString());
    }
}

class Car {
    protected String name;
    public Car(String name) {
        this.name = name;
    }
    public String toString() {
        return String.format("[자동차] { name : %s }", name);
    }
}


class Truck extends Car {
    protected double ton; // 추가된 거

    public Truck(String name, double ton) { // 생성자
        super(name);
        this.ton = ton;
    }

    public String toString() { // 메서드
        return String.format("[트럭] { name : %s , ton : %.1f }", name, ton);
        }
    }

    //this

//this : 클래스 자신을 가리키는 레퍼런스 변수
//생성자를 통해 필드변수를 초기화 할 때
// (명시적으로 this를 앞에 붙여주면 필드 변수라는 것을 명확히 알 수 있음)
//멤버변수(field)와 일반변수(매개변수, 지역변수등)와 구분하기 위해 사용한다
//this는 클래스 자신을 나타내는 레퍼런스(참조)변수이며, 자신의 멤버변수나 멤버함수에 접근할때 사용한다
//객체 멤버 변수와 메소드 변수의 이름이 같은 경우에 사용하지만 객체 멤버 변수와 메서드 변수의 이름이
//같지 않으면 굳이 사용 안 해도 됨.
//이름이 같으면 필수로 사용
