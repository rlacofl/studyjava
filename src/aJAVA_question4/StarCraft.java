package aJAVA_question4;

public class StarCraft {
    public static void main(String[] args) {

        // 객체 생성
        Marine marine = new Marine ("마린", 80);  // 이름, 초기값들
        Medic medic = new Medic ("메딕", 60);  // 이름, 초기값들
        // 하고 클래스 만들어야징

        // 마린 스팀팩 버프
        marine.stimPack();
        // 메딕의 치료 -> 마린한테
        medic.heal(marine);
    }
} // 메인에선 객체를 생성, 마린 스팀팩, 메딕 치료 의 동작을 수행


// 마린 클래스
class Marine {
    // 필드
    String name;
    int hp;

    // 생성자 (필드값 초기화)
    public Marine(String name, int hp) { // 기본 생성자와는 달리 초기값 넣을 수 있음 ()
        // 객체에서 괄호 안에 두 개의 값이 있으니까 서로 연결되게 작성 ("마린", 80 에 맞춰서)
        this.name = name;
        this.hp = hp;
    }

    // 메서드
    public void stimPack() {  // void - return값 없음
        System.out.printf("[%s]의 스팀팩! HP : %d -> ",name, hp);
        hp = hp - 10;  // hp 10 감소
        System.out.printf("%d\n", hp);  // 10 감소되고 난 후의 hp 값 표시하고 한 줄 띄움
    }
}

// 매딕 클래스
class Medic {
    // 필드
    String name;
    int hp;

    // 생성자 (필드값 초기화)
    public Medic(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // 메서드
    public void heal(Marine target) {
        System.out.printf("[%s]의 치유! %s HP(%d -> ",name, target.name, target.hp);
        target.hp += 10;
        System.out.printf("%d)\n", target.hp);
    }

}

// 보이드나 다른거 .... 스트링 같은거 .. 쓰면 그 안에서 프린트 해줘야함
// 메서드에 보이드 안 쓰면 메인에서 프린트
