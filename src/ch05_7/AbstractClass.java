package ch05_7;

abstract class GameObject {
    String name;

//    abstract void describe(); // 추상메서드
    void game() {
        System.out.println("게임시작");
    }
    public void describle() {
    }
    public abstract void describe();
}

class Player extends GameObject {
    @Override
    public void describe() {
        System.out.println("플레이어임");
    }
}
class Monster extends GameObject {
    @Override
    public void describe() {
        System.out.println("몬스터임");

    }
}
public class AbstractClass {
    public static void main(String[] args) {
        // 플레이어 객체와 몬스터 객체는 게임 오브젝트를 상속했으므로 
        // GameObject 선언 가능

        GameObject[] objs = {new Player(), new Monster()};

        for (GameObject obj : objs) {
            System.out.println(obj); // 객체 주소 toString 메서드
            obj.describle(); // 추상 메서드 구현
            obj.game();
        }

    }

}
