package ch05_7;

interface Describable { // interface는 대부분 ~able로 끝남
    String getDescription(); // 추상메서드
}
class Person implements Describable { // 얘는 부모 객체 따로 없고 Object임
    @Override
    public String toString() {
        // toString 메서드는 Object에서 객체의 주소 출력 (기본)
//        return super.toString(); // super : 부모 객체. this는 이 객체임.(Person)
    return "Person 객체 입니다. 필드 변수 없음.";
    }

    @Override
    public String getDescription() {
        return "person dlqslek.";
    }
}
class Computer implements Describable {
    @Override
    public String toString() {
        return "Computer 객체임. 필드 변수 없음";
    }

    @Override
    public String getDescription() {
        return "Computer dlqslek.";
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
//        Person person = new Person();
//        Object // Object class : 모든 클래스의 부모 클래스(기본값)
//        Object[] objs = {new Person(), new Computer()};
//
//        for (Object obj : objs) {
//            System.out.println(obj.toString()); // toString 생략 가능
//        }

        Describable[] objs = {new Person(), new Computer()};

        for (Describable obj : objs) {
            System.out.println(obj.getDescription());
        }

    }
}
