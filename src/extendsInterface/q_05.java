package extendsInterface;

public class q_05 {
    public static void main(String[] args) {

//        Artist kim = new Artist("뮤지션 김씨");
//        Architect lee = new Architect("건축가 이씨");
//        Developer park = new Developer("개발자 박");
//        Lawyer choi = new Lawyer("변호사 최씨");
//
//        Friend[] friends = {kim, lee, park, choi};

        Friend[] friends = {
            new Artist("뮤지션 김씨"),
        new Architect("건축가 이씨"),
        new Developer("개발자 박"),
        new Lawyer("변호사 최씨")
        };

        for (Friend f : friends) {
//            f.dearFriend();
            System.out.println(f.dearFriend() + " -> 칭구 아이가!");
        }

//        kim.printFriend();
//        lee.printFriend();
//        park.printFriend();
//        choi.printFriend();

    }
}

interface Friend {
    String dearFriend();

//    default void printFriend() {
//        System.out.printf("%s -> 칭구 아이가!\n", dearFriend());
//    }
}

class Artist implements Friend {
    private String name;

    public Artist(String name) {
        this.name = name;
    }
    @Override
    public String dearFriend() {
        return name;
    }
}

class Architect implements Friend {
    private String name;

    public Architect(String name) {
        this.name = name;
    }
    @Override
    public String dearFriend() {
        return name;
    }
}

class Developer implements Friend {
    private String name;

    public Developer(String name) {
        this.name = name;
    }
    @Override
    public String dearFriend() {
        return name;
    }
}

class Lawyer implements Friend {
    private String name;

    public Lawyer(String name) {
        this.name = name;
    }
    @Override
    public String dearFriend() {
        return name;
    }
}
