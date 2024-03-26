package ch05_6;

class Animal {
    String name;
    int age;

    Animal() {
        System.out.println("Animal의 디폴트 생성자임"); // Dog 안에 생성자 없을 때, 이거 2번 나옴
        // 한 번은 new Animal에서 나온 것 (밑에) / 두번째는 new Dog에서 나옴.
        // 상속일 경우, 자식 객체는 부모 객체도 함께 생성
    }

    public Animal (String name) { // 생성자 오버로딩 : 입력이 다른 여러개의 생성자
        this.name = name;

    }

    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }


    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal{
    public Dog() {
        System.out.println("Dog의 디폴트 생성자임");

    }
    // 안에 생성자가 없어서 디폴트 생성자가 생김
}

public class S01_constructor {
    // new로 만드는 것들이 생성자 객체.

    public static void main(String[] args) {
        Animal animal = new Animal(); // 디폴트 생성자 (class와 이름이 똑같고, 입력 변수, 내용 없음)

        Animal animal2 = new Animal("애니멀투");
        System.out.println(animal2.name);

        Animal animal3 = new Animal("애니멀쓰리", 17);
        System.out.println(animal3.age);  // 17
        System.out.println(animal3.name); // 애니멀쓰리


    // 상속일 경우 자식객체는 부모객체도 함께 생성
        Dog dog = new Dog();
    }
}
