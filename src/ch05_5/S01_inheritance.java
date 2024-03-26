package ch05_5;

class Animal {   // Animal class (부모 class)
    String name;  // name 이라는 객체 변수
    void setName(String name){  // 메서드 - 입력된 이름 (이름을 입력하면 객체 변수에 이름을 입력해줌)
        this.name = name;
    }
}

class Dog extends Animal {
    // extends 키워드로, Animal class를 상속받은 Dog class
    void sleep() {  // sleep 메서드 추가 (void : return 값이 없다)
        System.out.println(this.name+"zzz");  // puppyzzz 라고 나옴
    }
}


public class S01_inheritance {
    public static void main(String[] args) {
        // 상속을 하려면 부모, 자식 클래스 있어야함.

        Dog dog = new Dog(); // Dog class에 객체 dog

        // .setName(), .name을 부모 클래스에서 상속받음 (사용 가능)
        dog.setName("puppy ");  // 상속 받았기 때문에 기본적으로 가지고 있는 것.
        System.out.println(dog.name);  // puppy 라고 나옴.

        dog.sleep();   // (this.name+"zzz")


        // 부모타입으로 자식객체를 선언할 수 있음.
        Animal dog1 = new Dog();

        // 반대일 경우엔 오류 발생 (자식 > 부모 안 됨)
//        Dog dog2 = new Animal(); 오류 생김 헤헤
    }

}
