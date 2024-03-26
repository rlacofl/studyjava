package ch03_4;

public class S_03_contains_CharAt {
    public static void main(String[] args) {

        String a = "Hello Java";

        System.out.println(a.contains("Java")); // true

        System.out.println(a.charAt(6));        // J

        // contains : 문자열에서 특정 문자열이 포함되어 있는지 boolean으로 설명
        // charAt : 문자열에서 특정 위치의 문자를 리턴

    }
}
