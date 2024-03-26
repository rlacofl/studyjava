package aJAVA_question4;

public class q_08 {
    public static void main(String[] args) {

        Hero chaeri = new Hero("채리");
        Hero cat = new Hero("고양이");
        // hp 는 밑에서 변동을 시켜야 하기 때문에 넣지 않음

        Hero.battle(chaeri, cat);
    }
}


class Hero {
    String name;
    int hp;

    public Hero (String str) {  // 생성자
        name = str;
        hp = 30; // 고정값이므로 그냥 30 넣어주기
    }

    public void punch(Hero enemy) {  // 메서드
        int damage = (int) (Math.random()*10);
        enemy.hp -= damage;
    }

    public static void battle(Hero a, Hero b) {
        boolean Attack = true;
        while (a.hp > 0 && b.hp > 0) {
            if (Attack) {
                a.punch(b);
                System.out.printf("[%s]의 펀치\n", a.name);
                System.out.printf("%s : %d/30\n", b.name, b.hp);
            } else {
                b.punch(a);
                System.out.printf("[%s]의 펀치\n", b.name);
                System.out.printf("%s : %d/30\n", a.name, a.hp);
            }
            Attack = !Attack;
            // 공수 전환 ?
        }
    }


}