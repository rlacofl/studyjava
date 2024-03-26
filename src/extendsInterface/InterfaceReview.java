package extendsInterface;

import java.util.ArrayList;

public class InterfaceReview {
    public static void main(String[] args) {
        Sounding dog = new Dog();
        Sounding baby = new Baby();
        Sounding tiger = new Tiger();
        Sounding robot = new Robot();

        // 클래스에 객체를 생성하고 얘네들을 Sounding Interface로 형변환해서
        // ArrayList에 추가함

        ArrayList<Sounding> list = new ArrayList<Sounding>();
        list.add(dog);
        list.add(baby);
        list.add(tiger);
        list.add(robot);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).sound();
        }
        // 반복문을 통해서 ArrayList에 저장된 각 객체의 sound() 메서드를 호출해서 해당 객체의
        // 소리를 출력함.
    }
}

interface Sounding { // Sounding 인터페이스
    public void sound();
}   // 얘는 Sound() 메서드를 정의함 이 메서드는 소리를 나타내는 기능을 함

class Dog implements Sounding {
    public void sound() {
        System.out.println("Dog : 멍");
    }
}

class Baby implements Sounding {
    public void sound() {
        System.out.println("Baby : 응 애 나 애 기");
    }
}

class Tiger implements Sounding {
    public void sound() {
        System.out.println("Tiger : 어흥");
    }
}

class Robot implements Sounding {
    public void sound() {
        System.out.println("Robot : 삐그덕");
    }
}
