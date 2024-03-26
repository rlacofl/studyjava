package extendsInterface;

public class ElfTest {
    public static void main(String[] args) {
        Elf elf = new Elf("엘프1", 100);
        HighElf high = new HighElf("엘프2", 160, 100);
        ElfLord lord = new ElfLord("엘프3", 230, 140, 100);

        Elf[] elves = {elf, high, lord};

        for (int i = 0; i < elves.length; i++) {
            System.out.println(elves[i].toString()); // toString() 메서드로 객체 문자열 표현 출력
        }
    }
}

class Elf {
    String name;
    int hp;

    public Elf(String name, int hp) {
        // this.는 생성자에 의해 생성되는 객체를 참조하는 레퍼런스 변수
        // this는 인스턴스 자기 자신을 가리키는 키워드이다. 객체 자신에 대한 주소값을 가지며
        // 메소드에 전달하거나 return 하기 위해 사용된다! 만약, 매개 변수와 자신이 가지고 있는 변수명이
        // 같은 경우 이를 구분하기 위해 this를 사용한다!!
        this.name = name;
        this.hp = hp;
    }
    public String toString() {
        return String.format("[엘프] Name : %s, HP : %d", name, hp);
        //toString() 메서드를 오버라이드하여 String.format()을 사용하여 객체의 정보를 포맷팅한 문자열을 반환
    }
}

class HighElf extends Elf { // Elf 클래스 상속 즉, Elf 클래스의 모든 멤버 및 메서드를 상속받음.
    int mp;
    // 추가적으로 mp 필드를 가지며, 생성자를 통해 초기화

    public HighElf(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
        // toString() 메서드를 오버라이드하여 Elf 클래스의 toString() 메서드를 호출하고,
        // 추가로 mp 정보를 포함하는 문자열을 반환합니다.
    }
    public String toString() {
        return String.format("[엘프] Name : %s, HP : %d, MP : %d", name, hp, mp);
    }
}

class ElfLord extends HighElf {
    // ElfLord 클래스는 HighElf 클래스를 상속합니다.
    // 즉, Elf 클래스와 HighElf 클래스의 모든 멤버 및 메서드를 상속받습니다.
    int shield;
    // 추가적으로 shield 필드를 가지며, 생성자를 통해 초기화됩니다.

    public ElfLord(String name, int hp, int mp, int shield) {
        super(name, hp, mp);
        this.shield = shield;
    }
    public String toString() {
        return String.format("[엘프] Name : %s, HP : %d, MP : %d, SH : %d", name, hp, mp, shield);
    }
    // toString() 메서드를 오버라이드하여 HighElf 클래스의 toString() 메서드를 호출하고,
    // 추가로 shield 정보를 포함하는 문자열을 반환합니다.
}

// 이 코드에서는 클래스 간의 상속을 통해 코드 중복을 피하고 코드의 재사용성을 높였으며,
// 각 클래스에서는 toString() 메서드를 오버라이드하여 각각의 객체에 대한 적절한 문자열 표현을 제공함.