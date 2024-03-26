package ch03_4;

public class S_01_equals {
    public static void main(String[] args) {
        // 문자열 내장 메소드
        String a = "hello";
        String b = "Java";
        String c = "hello";

        System.out.println(a.equals(b)); // false
        System.out.println(a.equals(c)); // true
        // a. 이거랑 () 안에 있는 문자열이랑 비교한다는 뜻.

        // 어떤 값을 넣은 곳. 이라고 하면(위에선 a.) m 이라고 되어있는 건 전부 메소드
        // 문자열의 값을 비교할 때는 반드시 == 연산자 대신 equals 사용
        
    }
}
