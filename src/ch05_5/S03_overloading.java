package ch05_5;

class Tiger {
    // 메소드 오버로딩 : 동일한 이름의 입력이 다른 메서드를 만듦.
    void sleep() {
        System.out.println("호랑이가 자용");
    }

    void sleep(int time) {  // void sleep() 이렇게 하면 에러남
        System.out.println("호랑이가 " + time +"시간 만큼 자용 . . .");
    }
}
public class S03_overloading {
    public static void main(String[] args) {
//        System.out.println(1);
//        System.out.println("1");
//        System.out.println(1.0);
        // 프린트 라인이 여러개.
        // 이름만 같다고 해서 같은 메서드 아님. > 입력 타입이 같아야 같은 메서드 !
        // 이름 같은데 입력 타입 다르면 다른 메서드임 !

        Tiger tiger = new Tiger();
        tiger.sleep();
        tiger.sleep(3);
    }
}
