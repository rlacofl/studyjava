package extendsInterface;

public class q_04 {
    public static void main(String[] args) {
//        Novice novice = new Novice("노비스", 10);
//        Wizard wizard = new Wizard("마법사", 50, 50);
        GreatWizard gandalf = new GreatWizard("간달프", 100, 100, 100);

        System.out.println(gandalf.toString());
        gandalf.energeVolt();
    }
}

class Novice {
    protected String name;
    protected int hp;

    public Novice(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public String toString() {
        return String.format("[초심자] %s(HP : %d)", this.name, this.hp);
    }
}

class Wizard extends Novice {
    protected int mp;

    public Wizard (String name, int hp, int mp) {
    super(name, hp);
    this.mp =  mp;
    }

//    public void energeVolt() {
//        System.out.printf("[마법사] %s(HP : %d)", this.name, this.hp, this.mp);
//    }
}

class GreatWizard extends Wizard {
    protected int shield;
//    private Object name;
//    private Object hp;
//    private Object mp;

    public GreatWizard (String name, int hp, int mp, int shield) {
        super(name, hp, mp);
        this.shield = shield;
    }

    public String toString() {
        return String.format("[대마법사] %s(HP : %d, MP : %d, SHIELD : %d)", this.name, this.hp, this.mp, this.shield);
    }
    public void energeVolt() {
        System.out.printf("%s의 에너지 볼트! (대마법사 버프로 데미지 +30 추가)", this.name);
    }
}