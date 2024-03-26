package ch05;

public class S04_methodEx {

    int sum(int a, int b) {  // 메서드(sum)에서만 사용하는 입력 변수 (int a, int b)
        // 메서드의 입력 변수는 메서드 내에서만 사용됨.
        return a + b;
    }




    // 리턴이 없는 메서드
    void noReturn() {  // 입력 변수도 없음
        System.out.println("노입력노리턴");
    }

    // 이름을 입력받아 문자열로 리턴하는 메서드
    String myName(String name) {
        return "내이름은 " + name + "이다.";
    }




    public static void main(String[] args) {
        int a = 3; // 위에 있는 메서드 변수랑 다름.
        int b = 4;

        S04_methodEx sample = new S04_methodEx();
//        sample.sum(a, b);  // 여기 a,b는 메인 메서드에 있는 a,b여서 3,4가 입력됨.
        System.out.println(sample.sum(a, b));   // 7
        System.out.println(sample.sum(9, 7));  // 16

        System.out.println(sample.myName("애기"));
    }
}
